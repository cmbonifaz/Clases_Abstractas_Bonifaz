package dominio;

public abstract class SerVivo {

    private String clases;
    public abstract void Alimentarse();

    public String getClases() {
        return clases;
    }

    public void setClases(String clases) {
        this.clases = clases;
    }

}
