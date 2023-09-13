package rol;

public class Rol {
    int cod_rol;
    String nom_rol;
    String des_rol;
    String est_rol;
    public Rol() {
    }
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
