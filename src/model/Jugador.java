package model;

import java.util.ArrayList;

public class Jugador {

    private String nombreJugador;
    private ArrayList<Fitxa> fitxesJugador;
    private boolean haPassat;

    public void setHaPassat(boolean haPassat) {
        this.haPassat = haPassat;
    }

    public boolean isHaPassat() {
        return haPassat;
    }

    public Jugador() {
        fitxesJugador = new ArrayList();
    }

    public Jugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
        fitxesJugador = new ArrayList();
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setFitxesJugador(Fitxa fitxa) {
        this.fitxesJugador.add(fitxa);
    }

    public void mostrarFitxes() {
        for (Fitxa fitxa : fitxesJugador) {
            System.out.println(fitxa.toString() + ", " + toString());
        }
    }

    public boolean buscarFitxa() {
        boolean encontrado = false;
        for (Fitxa f : fitxesJugador) {
            if (f.getCostatDreta() == 6 && f.getCostatEsquerra() == 6) {
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombreJugador=" + nombreJugador + ", fitxesJugador=" + fitxesJugador + ", haPassat=" + haPassat + '}';
    }

    public int numeroFitxes() {
        return fitxesJugador.size();
    }

}
