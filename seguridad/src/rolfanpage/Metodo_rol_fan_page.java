package rolfanpage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import utilidades.Conexion;

public class Metodo_rol_fan_page {
    public void rol_fan_page_agregar(){
        Conexion cn=new Conexion();
        Rol_Fan_Page r=new Rol_Fan_Page();
        r.setFky_per(3);
        r.setFky_fan_pag(1);
        r.setFky_rol(1);
        r.setEst_rol_fan("A");
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.rol_fan_page_agregar('"+r.getFky_per()+"','"+r.getFky_fan_pag()+"','"+r.getFky_rol()+"','"+r.getEst_rol_fan()+"')";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                System.out.println("Rol de la FanPage agregado correctamente con el codigo: "+rs.getString(1));
            }
            con.close();
        }catch(SQLException ex){
            System.out.println("Error al agregar el rol en la FanPage"+ex);
        }
    }
    public void rol_fan_page_modificar(){
        Conexion cn=new Conexion();
        Rol_Fan_Page r=new Rol_Fan_Page();
        r.setCod_rol_fan(4);
        r.setFky_per(3);
        r.setFky_fan_pag(1);
        r.setFky_rol(1);
        r.setEst_rol_fan("I");
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.rol_fan_page_modificar("+r.getCod_rol_fan()+",'"+r.getFky_per()+"','"+r.getFky_fan_pag()+"','"+r.getFky_rol()+"','"+r.getEst_rol_fan()+"')";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                if(rs.getString(1)==null){
                    System.out.println("Rol de la FanPage no encontrado");
                }else{
                System.out.println("Rol de la FanPage con el codigo "+rs.getString(1)+" modificado correctamente");
                }
            }
            con.close();
        }catch(SQLException ex){
            System.out.println("Error al modificar el rol en la FanPage"+ex);
        }
    }
    public void rol_fan_page_eliminar(){
        Conexion cn=new Conexion();
        Rol_Fan_Page r=new Rol_Fan_Page();
        r.setCod_rol_fan(4);
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.rol_fan_page_eliminar("+r.getCod_rol_fan()+")";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                if(rs.getString(1)==null){
                    System.out.println("Rol de la FanPage no encontrado");
                }else{
                System.out.println("Rol de la FanPage con el codigo "+rs.getString(1)+" eliminado correctamente");
                }
            }
            con.close();
        }catch(SQLException ex){
            System.out.println("Error al eliminar el rol en la FanPage"+ex);
        }
    }
    public void rol_fan_page_listar(){
        Conexion cn=new Conexion();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.rol_fan_page_listar()";
        ArrayList<Rol_Fan_Page> lista=new ArrayList<>();
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Rol_Fan_Page r1=new Rol_Fan_Page();
                String cad=rs.getString(1);
                cad=cad.substring(1,cad.length()-1);
                String[] partes=cad.split(",");
                r1.setCod_rol_fan(Integer.parseInt(partes[0]));
                r1.setFky_per(Integer.parseInt(partes[1]));
                r1.setFky_fan_pag(Integer.parseInt(partes[2]));
                r1.setFky_rol(Integer.parseInt(partes[3]));
                r1.setEst_rol_fan(partes[4]);
                lista.add(r1);
                System.out.println("Código: "+r1.getCod_rol_fan()+" Codigo de la Persona: "+r1.getFky_per()+" Codigo de la fan page: "+r1.getFky_fan_pag()+" Codigo del rol: "+r1.getFky_rol()+" Estatus: "+r1.getEst_rol_fan());
            }
            con.close();
            Iterator<Rol_Fan_Page> iter=lista.iterator();
            System.out.println("iterator");
            while(iter.hasNext()){
                Rol_Fan_Page r2=new Rol_Fan_Page();
                r2=iter.next();
                System.out.println("Código: "+r2.getCod_rol_fan()+" Codigo de la Persona: "+r2.getFky_per()+" Codigo de la fan page: "+r2.getFky_fan_pag()+" Codigo del rol: "+r2.getFky_rol()+" Estatus: "+r2.getEst_rol_fan());
            }
        }catch(SQLException e){
            System.out.println("Error al Listar los roles de la fan page");
        }
    }
    public void rol_fan_page_buscar(){
        Conexion cn=new Conexion();
        Rol_Fan_Page r=new Rol_Fan_Page();
        r.setCod_rol_fan(4);
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.rol_fan_page_buscar("+r.getCod_rol_fan()+")";
        ArrayList<Rol_Fan_Page> lista=new ArrayList<>();
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Rol_Fan_Page r1=new Rol_Fan_Page();
                String cad=rs.getString(1);
                cad=cad.substring(1,cad.length()-1);
                String[] partes=cad.split(",");
                r1.setCod_rol_fan(Integer.parseInt(partes[0]));
                r1.setFky_per(Integer.parseInt(partes[1]));
                r1.setFky_fan_pag(Integer.parseInt(partes[2]));
                r1.setFky_rol(Integer.parseInt(partes[3]));
                r1.setEst_rol_fan(partes[4]);
                lista.add(r1);
                System.out.println("Código: "+r1.getCod_rol_fan()+" Codigo de la Persona: "+r1.getFky_per()+" Codigo de la fan page: "+r1.getFky_fan_pag()+" Codigo del rol: "+r1.getFky_rol()+" Estatus: "+r1.getEst_rol_fan());
            }
            con.close();
            if(lista.size()>0){
                Iterator<Rol_Fan_Page> iter=lista.iterator();
                System.out.println("iterator");
                while(iter.hasNext()){
                    Rol_Fan_Page r2=new Rol_Fan_Page();
                    r2=iter.next();
                    System.out.println("Código: "+r2.getCod_rol_fan()+" Codigo de la Persona: "+r2.getFky_per()+" Codigo de la fan page: "+r2.getFky_fan_pag()+" Codigo del rol: "+r2.getFky_rol()+" Estatus: "+r2.getEst_rol_fan());
                }
            }else{
                System.out.println("Rol no encontrado");
            }
        }catch(SQLException ex){
            System.out.println("Error al buscar los roles de la fan page"+ex);
        }
    }
    public static void main(String[] args) {
        Metodo_rol_fan_page i=new Metodo_rol_fan_page();
        i.rol_fan_page_buscar();
    }
}
