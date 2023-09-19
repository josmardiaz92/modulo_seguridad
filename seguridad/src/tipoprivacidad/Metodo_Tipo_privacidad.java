package tipoprivacidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import utilidades.Conexion;

public class Metodo_Tipo_privacidad {
    public void tipo_privacidad_agregar(){
        Conexion cn=new Conexion();
        Tipo_Privacidad tp=new Tipo_Privacidad();
        tp.setNom_tip("privada");
        tp.setEst_tip("A");
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.tipo_privacidad_agregar('"+tp.getNom_tip()+"','"+tp.getEst_tip()+"')";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                System.out.println("Tipo de privacidad agregada correctamente con el codigo: "+rs.getString(1));
            }
            con.close();
        }catch(SQLException ex){
            System.out.println("Error al agregar el tipo de privacidad"+ex);
        }
    }
    public void tipo_privacidad_modificar(){
        Conexion cn=new Conexion();
        Tipo_Privacidad tp=new Tipo_Privacidad();
        tp.setCod_tip(3);
        tp.setNom_tip("Top secret");
        tp.setEst_tip("A");
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.tipo_privacidad_modificar("+tp.getCod_tip()+",'"+tp.getNom_tip()+"','"+tp.getEst_tip()+"')";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                if(rs.getString(1)==null){
                    System.out.println("Tipo de privacidad no encontrada");
                }else{
                    System.out.println("Tipo de privacidad con el codigo "+rs.getString(1)+" modificada correctamente");
                }
            }
            con.close();
        }catch(SQLException ex){
            System.out.println("Error al modificar el tipo de privacidad"+ex);
        }
    }
    public void tipo_privacidad_eliminar(){
        Conexion cn=new Conexion();
        Tipo_Privacidad tp=new Tipo_Privacidad();
        tp.setCod_tip(4);
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.tipo_privacidad_eliminar("+tp.getCod_tip()+")";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                if(rs.getString(1)==null){
                    System.out.println("Tipo de privacidad no encontrada");
                }else{
                    System.out.println("Tipo de privacidad con el codigo "+rs.getString(1)+" eliminada correctamente");
                }
            }
            con.close();
        }catch(SQLException ex){
            System.out.println("Error al eliminar el tipo de privacidad"+ex);
        }
    }
    public void tipo_privacidad_listar(){
        Conexion cn=new Conexion();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.tipo_privacidad_listar()";
        ArrayList<Tipo_Privacidad> lista=new ArrayList<>();
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Tipo_Privacidad tp1=new Tipo_Privacidad();
                String cad=rs.getString(1);
                cad=cad.substring(1,cad.length()-1);
                String[] partes=cad.split(",");
                tp1.setCod_tip(Integer.parseInt(partes[0]));
                tp1.setNom_tip(partes[1]);
                tp1.setEst_tip(partes[2]);
                lista.add(tp1);
                System.out.println("Codigo: "+tp1.getCod_tip()+" Nombre: "+tp1.getNom_tip()+" Status: "+tp1.getEst_tip());
            }
            con.close();
            Iterator<Tipo_Privacidad> iter=lista.iterator();
            System.out.println("iterator");
            while(iter.hasNext()){
                Tipo_Privacidad tp2=new Tipo_Privacidad();
                tp2=iter.next();
                System.out.println("Codigo: "+tp2.getCod_tip()+" Nombre: "+tp2.getNom_tip()+" Status: "+tp2.getEst_tip());
            }
        }catch(SQLException e){
            System.out.println("Error al Listar los tipos de privacidad");
        }
    }
    public void tipo_privacidad_buscar(){
        Conexion cn=new Conexion();
        Tipo_Privacidad tp=new Tipo_Privacidad();
        tp.setCod_tip(1);
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.tipo_privacidad_buscar("+tp.getCod_tip()+")";
        ArrayList<Tipo_Privacidad> lista=new ArrayList<>();
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Tipo_Privacidad tp1=new Tipo_Privacidad();
                String cad=rs.getString(1);
                cad=cad.substring(1,cad.length()-1);
                String[] partes=cad.split(",");
                tp1.setCod_tip(Integer.parseInt(partes[0]));
                tp1.setNom_tip(partes[1]);
                tp1.setEst_tip(partes[2]);
                lista.add(tp1);
                System.out.println("Codigo: "+tp1.getCod_tip()+" Nombre: "+tp1.getNom_tip()+" Status: "+tp1.getEst_tip());
            }
            con.close();
            if(lista.size()>0){
                Iterator<Tipo_Privacidad> iter=lista.iterator();
                System.out.println("iterator");
                while(iter.hasNext()){
                    Tipo_Privacidad tp2=new Tipo_Privacidad();
                    tp2=iter.next();
                    System.out.println("Codigo: "+tp2.getCod_tip()+" Nombre: "+tp2.getNom_tip()+" Status: "+tp2.getEst_tip());
                }
            }else{
                System.out.println("Tipo de privacidad no encontrada");
            }   
        }catch(SQLException e){
            System.out.println("Error al buscar los tipos de privacidad");
        }
    }
    public static void main(String[] args) {
        Metodo_Tipo_privacidad i=new Metodo_Tipo_privacidad();
        i.tipo_privacidad_buscar();
    }
}
