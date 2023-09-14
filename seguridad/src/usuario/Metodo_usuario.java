package usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import utilidades.Conexion;

public class Metodo_usuario {
    public void usuario_agregar(){
        Conexion cn=new Conexion();
        Usuario u=new Usuario();
        u.setAli_usu("vida");
        u.setEma_usu("vida92@gmail.com");
        u.setCla_usu("123456");
        u.setEst_usu("A");
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.usuario_agregar('"+u.getAli_usu()+"','"+u.getEma_usu()+"','"+u.getCla_usu()+"','"+u.getEst_usu()+"')";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                System.out.println("Usuario agregado correctamente con el codigo: "+rs.getString(1));
            }
            con.close();
        }catch(SQLException e){
            System.out.println("Error al agregar el usuario");
        }
    }
    public void usuario_modificar(){
        Conexion cn=new Conexion();
        Usuario u=new Usuario();
        u.setCod_usu(1);
        u.setAli_usu("nuevo Alias");
        u.setEma_usu("nuevoalias@gmail.com");
        u.setCla_usu("123456");
        u.setEst_usu("A");
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.usuario_modificar("+u.getCod_usu()+",'"+u.getAli_usu()+"','"+u.getEma_usu()+"','"+u.getCla_usu()+"','"+u.getEst_usu()+"')";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                if(rs.getString(1)==null){
                    System.out.println("Usuario no encontrado");
                }else{
                System.out.println("Usuario con el codigo "+rs.getString(1)+" modificado correctamente");
                }
            }
            con.close();
        }catch(SQLException e){
            System.out.println("Error al modificar el usuario");
        }
    }
    public void usuario_eliminar(){
        Conexion cn=new Conexion();
        Usuario u=new Usuario();
        u.setCod_usu(2);
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.usuario_eliminar("+u.getCod_usu()+")";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                if(rs.getString(1)==null){
                    System.out.println("Usuario no encontrado");
                }else{
                System.out.println("Usuario con el codigo "+rs.getString(1)+" eliminado correctamente");
                }
            }
            con.close();
        }catch(SQLException e){
            System.out.println("Error al eliminar el usuario");
        }
    }
    public void usuario_listar(){
        Conexion cn=new Conexion();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.usuario_listar()";
        ArrayList<Usuario> lista=new ArrayList<>();
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){ //mientras queden elementos
                Usuario u1=new Usuario();
                String cad=rs.getString(1);
                cad=cad.substring(1,cad.length()-1);
                String[] partes=cad.split(",");
                u1.setCod_usu(Integer.parseInt(partes[0]));
                u1.setAli_usu(partes[1].replace("\"", ""));
                u1.setEma_usu(partes[2]);
                u1.setCla_usu(partes[3]);
                u1.setEst_usu(partes[4]);
                lista.add(u1);
                System.out.println("Código: "+u1.getCod_usu()+" Alias: "+u1.getAli_usu()+" Email: "+u1.getEma_usu()+" Clave: "+u1.getCla_usu()+" Estatus: "+u1.getEst_usu());
            }
            con.close();
            Iterator<Usuario> iter=lista.iterator(); //se crea el iterador para recorrer la lista
            System.out.println("iterador");
            while(iter.hasNext()){ //mientras quedem elementos
                Usuario u2=new Usuario();
                u2=iter.next();
                System.out.println("Código: "+u2.getCod_usu()+" Alias: "+u2.getAli_usu()+" Email: "+u2.getEma_usu()+" Clave: "+u2.getCla_usu()+" Estatus: "+u2.getEst_usu());
            }
        }catch(SQLException e){
            System.out.println("Error al Listar los usuario");
        }
    }
    public void usuario_buscar(){
        Conexion cn=new Conexion();
        Usuario u=new Usuario();
        u.setCod_usu(2);
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select seguridad.usuario_buscar("+u.getCod_usu()+")";
        ArrayList<Usuario> lista=new ArrayList<>();
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){ //mientras queden elementos
                Usuario u1=new Usuario();
                String cad=rs.getString(1);
                cad=cad.substring(1,cad.length()-1);
                String[] partes=cad.split(",");
                u1.setCod_usu(Integer.parseInt(partes[0]));
                u1.setAli_usu(partes[1]);
                u1.setEma_usu(partes[2]);
                u1.setCla_usu(partes[3]);
                u1.setEst_usu(partes[4]);
                lista.add(u1);
                System.out.println("Código: "+u1.getCod_usu()+" Alias: "+u1.getAli_usu()+" Email: "+u1.getEma_usu()+" Clave: "+u1.getCla_usu()+" Estatus: "+u1.getEst_usu());
            }
            con.close();
            if(lista.size()>0){
                Iterator<Usuario> iter=lista.iterator(); //se crea el iterador para recorrer la lista
                System.out.println("iterador");
                while(iter.hasNext()){ //mientras quedem elementos
                    Usuario u2=new Usuario();
                    u2=iter.next();
                    System.out.println("Código: "+u2.getCod_usu()+" Alias: "+u2.getAli_usu()+" Email: "+u2.getEma_usu()+" Clave: "+u2.getCla_usu()+" Estatus: "+u2.getEst_usu());
                }
            }else{
                System.out.println("Usuario no encontrado");
            }
        }catch(SQLException e){
            System.out.println("Error al buscar los usuario");
        }
    }
    public static void main(String[] args) {
        Metodo_usuario i=new Metodo_usuario();
        i.usuario_listar();
    }
}
