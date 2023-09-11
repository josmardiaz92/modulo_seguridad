package utilidades;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
    Connection conex;
    public Conexion(){
        try {
            conex=DriverManager.getConnection("jdbc:postgresql://localhost:5432/diplomado", "postgres", "240296");
            System.out.println("BD Conectada");
        } catch (SQLException ex) {
            System.out.println("Error al conectar la BD: "+ex);
        }
    }
    public Connection getConnection(){
        return conex;
    }//esto nos permite retornar el valor para saber que devuelve la conexion
}
