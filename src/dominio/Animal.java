package dominio;

public abstract class Animal extends SerVivo {

    private String claseAni;

    @Override
    public abstract void Alimentarse();

    public String getClaseAni() {
        return claseAni;
    }

    public void setClaseAni(String claseAni) {
        this.claseAni = claseAni;
    }
}
