package model;

public class Jugada {

    private int torn;

    public Jugada(int torn) {
        this.torn = torn;
    }

    public int getTorn() {
        return torn;
    }

    public void setTorn(int torn) {
        this.torn = torn;
    }

    public void afegirTorn() {
        torn++;
        if (torn > 3) {
            torn -= 4;
        }
    }

}
