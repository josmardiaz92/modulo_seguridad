package rol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import utilidades.Conexion;

public class Metodo_rol {
    public void rol_agregar(){
        Conexion cn=new Conexion();
        Rol r=new Rol();
        r.setNom_rol("dueño6");
        r.setDes_rol("dueño pero no administrado");
        r.setEst_rol("A");
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.rol_agregar('"+r.getNom_rol()+"','"+r.getDes_rol()+"','"+r.getEst_rol()+"')";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                System.out.println("Rol agregado correctamente con el codigo: "+rs.getString(1));
            }
            con.close();
        }catch(SQLException ex){
            System.out.println("Error al agregar el rol"+ex);
        }
    }
    public void rol_modificar(){
        Conexion cn=new Conexion();
        Rol r=new Rol();
        r.setCod_rol(5);
        r.setNom_rol("dueño1");
        r.setDes_rol("probando cambio");
        r.setEst_rol("A");
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.rol_modificar("+r.getCod_rol()+",'"+r.getNom_rol()+"','"+r.getDes_rol()+"','"+r.getEst_rol()+"')";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                if(rs.getString(1)==null){
                    System.out.println("Rol no encontrado");
                }else{
                System.out.println("Rol con el codigo "+rs.getString(1)+" modificado correctamente");
                }
            }
            con.close();
        }catch(SQLException e){
            System.out.println("Error al modificar el rol");
        }
    }
    public void rol_eliminar(){
        Conexion cn=new Conexion();
        Rol r=new Rol();
        r.setCod_rol(9);
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.rol_eliminar('"+r.getCod_rol()+"')";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            System.out.println("Rol eliminado correctamente");
            con.close();
        }catch(SQLException e){
            System.out.println("Error al eliminar el rol");
        }
    }
    public void rol_listar(){
        Conexion cn=new Conexion();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.rol_listar()";
        ArrayList<Rol> lista=new ArrayList<>();
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Rol r1=new Rol();
                String cad=rs.getString(1);
                cad=cad.substring(1,cad.length()-1);
                String[] partes=cad.split(",");
                r1.setCod_rol(Integer.parseInt(partes[0]));
                r1.setNom_rol(partes[1].replace("\"", ""));
                r1.setDes_rol(partes[2].replace("\"", ""));
                r1.setEst_rol(partes[3]);
                lista.add(r1);
                System.out.println("Código: "+r1.getCod_rol()+" Nombre: "+r1.getNom_rol()+" Descripción: "+r1.getDes_rol()+" Estatus: "+r1.getEst_rol());
            }
            con.close();
            Iterator<Rol> iter=lista.iterator();
            System.out.println("iterator");
            while(iter.hasNext()){
                Rol r2=new Rol();
                r2=iter.next();
                System.out.println("Código: "+r2.getCod_rol()+" Nombre: "+r2.getNom_rol()+" Descripción: "+r2.getDes_rol()+" Estatus: "+r2.getEst_rol());
            }
        }catch(SQLException e){
            System.out.println("Error al Listar los roles");
        }
    }
    public void rol_buscar(){
        Conexion cn=new Conexion();
        Rol r=new Rol();
        r.setCod_rol(4);
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.rol_buscar("+r.getCod_rol()+")";
        ArrayList<Rol> lista=new ArrayList<>();
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Rol r1=new Rol();
                String cad=rs.getString(1);
                cad=cad.substring(1,cad.length()-1);
                String[] partes=cad.split(",");
                r1.setCod_rol(Integer.parseInt(partes[0]));
                r1.setNom_rol(partes[1].replace("\"", ""));
                r1.setDes_rol(partes[2].replace("\"", ""));
                r1.setEst_rol(partes[3]);
                lista.add(r1);
                System.out.println("Código: "+r1.getCod_rol()+" Nombre: "+r1.getNom_rol()+" Descripción: "+r1.getDes_rol()+" Estatus: "+r1.getEst_rol());
            }
            con.close();
            Iterator<Rol> iter=lista.iterator();
            System.out.println("iterator");
            while(iter.hasNext()){
                Rol r2=new Rol();
                r2=iter.next();
                System.out.println("Código: "+r2.getCod_rol()+" Nombre: "+r2.getNom_rol()+" Descripción: "+r2.getDes_rol()+" Estatus: "+r2.getEst_rol());
            }
        }catch(SQLException e){
            System.out.println("Error al buscar los roles");
        }
    }
    public static void main(String[] args) {
        Metodo_rol i=new Metodo_rol();
        i.rol_eliminar();
    }
}
