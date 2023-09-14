package rolfanpage;

public class Rol_Fan_Page {
    int cod_rol_fan;
    int fky_per;
    int fky_fan_pag;
    int fky_rol;
    String est_rol_fan;
    public Rol_Fan_Page() {
    }
    public Rol_Fan_Page(int cod_rol_fan) {
        this.cod_rol_fan = cod_rol_fan;
    }
    public Rol_Fan_Page(int fky_per, int fky_fan_pag, int fky_rol, String est_rol_fan) {
        this.fky_per = fky_per;
        this.fky_fan_pag = fky_fan_pag;
        this.fky_rol = fky_rol;
        this.est_rol_fan = est_rol_fan;
    }
    public Rol_Fan_Page(int cod_rol_fan, int fky_per, int fky_fan_pag, int fky_rol, String est_rol_fan) {
        this.cod_rol_fan = cod_rol_fan;
        this.fky_per = fky_per;
        this.fky_fan_pag = fky_fan_pag;
        this.fky_rol = fky_rol;
        this.est_rol_fan = est_rol_fan;
    }
    public int getCod_rol_fan() {
        return cod_rol_fan;
    }
    public void setCod_rol_fan(int cod_rol_fan) {
        this.cod_rol_fan = cod_rol_fan;
    }
    public int getFky_per() {
        return fky_per;
    }
    public void setFky_per(int fky_per) {
        this.fky_per = fky_per;
    }
    public int getFky_fan_pag() {
        return fky_fan_pag;
    }
    public void setFky_fan_pag(int fky_fan_pag) {
        this.fky_fan_pag = fky_fan_pag;
    }
    public int getFky_rol() {
        return fky_rol;
    }
    public void setFky_rol(int fky_rol) {
        this.fky_rol = fky_rol;
    }
    public String getEst_rol_fan() {
        return est_rol_fan;
    }
    public void setEst_rol_fan(String est_rol_fan) {
        this.est_rol_fan = est_rol_fan;
    }
}
