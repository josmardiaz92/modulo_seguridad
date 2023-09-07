package usuario;

class Rol{
    int cod_rol;
    String nom_rol;
    String des_rol;
    String est_rol;
    public Rol(int cod_rol) {
        this.cod_rol = cod_rol;
    }
    public Rol(String nom_rol, String des_rol, String est_rol) {
        this.nom_rol = nom_rol;
        this.des_rol = des_rol;
        this.est_rol = est_rol;
    }
    public Rol(int cod_rol, String nom_rol, String des_rol, String est_rol) {
        this.cod_rol = cod_rol;
        this.nom_rol = nom_rol;
        this.des_rol = des_rol;
        this.est_rol = est_rol;
    }
    public int getCod_rol() {
        return cod_rol;
    }
    public void setCod_rol(int cod_rol) {
        this.cod_rol = cod_rol;
    }
    public String getNom_rol() {
        return nom_rol;
    }
    public void setNom_rol(String nom_rol) {
        this.nom_rol = nom_rol;
    }
    public String getDes_rol() {
        return des_rol;
    }
    public void setDes_rol(String des_rol) {
        this.des_rol = des_rol;
    }
    public String getEst_rol() {
        return est_rol;
    }
    public void setEst_rol(String est_rol) {
        this.est_rol = est_rol;
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Rol r1=new Rol(1,"Administrador","Tienen todos los privilegios","A");
        Rol r2=new Rol(2,"Propietario","No tiene todos los privilegios","A");
        Rol r3=new Rol(3,"Propietario2","No tiene todos los privilegios","A");
        if(r1.cod_rol<r2.cod_rol){ //*Esto en caso de datos numericos */
            System.out.println("El objeto 1 se creó primero...");
        }else{
            System.out.println("El objeto 2 se creó primero...");
        }
        if(r3.nom_rol.equals("Administrador")){
            System.out.println("El usuario es Administrador");
        }else{
            System.out.println("El usuario no es Administrador");
        }
    }
}
