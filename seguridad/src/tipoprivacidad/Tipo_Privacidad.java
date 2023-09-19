package tipoprivacidad;

public class Tipo_Privacidad {
    int cod_tip;
    String nom_tip;
    String est_tip;
    public Tipo_Privacidad() {
    }
    public Tipo_Privacidad(int cod_tip) {
        this.cod_tip = cod_tip;
    }
    public Tipo_Privacidad(String nom_tip, String est_tip) {
        this.nom_tip = nom_tip;
        this.est_tip = est_tip;
    }
    public Tipo_Privacidad(int cod_tip, String nom_tip, String est_tip) {
        this.cod_tip = cod_tip;
        this.nom_tip = nom_tip;
        this.est_tip = est_tip;
    }
    public int getCod_tip() {
        return cod_tip;
    }
    public void setCod_tip(int cod_tip) {
        this.cod_tip = cod_tip;
    }
    public String getNom_tip() {
        return nom_tip;
    }
    public void setNom_tip(String nom_tip) {
        this.nom_tip = nom_tip;
    }
    public String getEst_tip() {
        return est_tip;
    }
    public void setEst_tip(String est_tip) {
        this.est_tip = est_tip;
    }
}
