package model;

public final class Fitxa {

    private int costatEsquerra;
    private int costatDreta;
    private boolean girada;

    public boolean isGirada() {
        return girada;
    }

    public Fitxa(int costatEsquerra, int costatDreta) {
        this.costatEsquerra = costatEsquerra;
        this.costatDreta = costatDreta;
    }

    @Override
    public String toString() {
        return "Fitxa{" + "costatEsquerra=" + costatEsquerra + ", costatDreta=" + costatDreta + ", girada=" + girada + '}';
    }

    public Fitxa() {
    }

    public int getCostatEsquerra() {
        return costatEsquerra;
    }

    public int getCostatDreta() {
        return costatDreta;
    }

    public String mostrarFitxa() {
        return ((girada) ? "[" + costatDreta + "," + costatEsquerra + "]" : "[" + costatEsquerra + "," + costatDreta + "]");
    }

}
