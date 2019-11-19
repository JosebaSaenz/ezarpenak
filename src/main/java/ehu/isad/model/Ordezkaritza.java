package main.java.ehu.isad.model;

public class Ordezkaritza {

    private String herrialdea;
    private String artista;
    private String abestia;

    public Ordezkaritza(String herrialdea, String artista, String abestia) {
        this.herrialdea = herrialdea;
        this.artista = artista;
        this.abestia = abestia;
    }

    public String getHerrialdea() {
        return herrialdea;
    }

    public String getArtista() {
        return artista;
    }

    public String getAbestia() {
        return abestia;
    }


    @Override
    public String toString() {
        return "Ordezkaritza{" +
                "herrialdea=" + herrialdea +
                ", artista='" + artista + '\'' +
                ", abestia='" + abestia + '\'' +
                '}' + "\n";
    }
}
