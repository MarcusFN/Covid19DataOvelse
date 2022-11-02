
public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private int bekræftedeTilfælde;
    private int døde;
    private int indlagtIntensiv;
    private int indlagt;
    private String dato; //TODO kan laves til localDate

    public Covid19Data(){

    }

    public Covid19Data(String region, String aldersgruppe, int bekræftedeTilfælde, int døde, int indlagtIntensiv, int indlagt, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeTilfælde = bekræftedeTilfælde;
        this.døde = døde;
        this.indlagtIntensiv = indlagtIntensiv;
        this.indlagt = indlagt;
        this.dato = dato;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAldersgruppe() {
        return aldersgruppe;
    }

    public void setAldersgruppe(String aldersgruppe) {
        this.aldersgruppe = aldersgruppe;
    }

    public int getBekræftedeTilfælde() {
        return bekræftedeTilfælde;
    }

    public void setBekræftedeTilfælde(int bekræftedeTilfælde) {
        this.bekræftedeTilfælde = bekræftedeTilfælde;
    }

    public int getDøde() {
        return døde;
    }

    public void setDøde(int døde) {
        this.døde = døde;
    }

    public int getIndlagtIntensiv() {
        return indlagtIntensiv;
    }

    public void setIndlagtIntensiv(int indlagtIntensiv) {
        this.indlagtIntensiv = indlagtIntensiv;
    }

    public int getIndlagt() {
        return indlagt;
    }

    public void setIndlagt(int indlagt) {
        this.indlagt = indlagt;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }


}
