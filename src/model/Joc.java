package model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;

public class Joc {

    private ArrayList<Jugador> jugadors;
    private ArrayList<Fitxa> fitxes;
    private ArrayDeque<Fitxa> tauler;

    public Joc() {
//        for (Jugador j : jugadors) {
//            System.out.println(j.toString());
//        }
//        Jugada jugada = new Jugada((trobarSisDoble() - 1));
//        tauler = new ArrayDeque();
//        for (int i = 0; i < 10; i++) {
//            jugada.afegirTorn();
//            System.out.println(jugada.getTorn());
//        }
    }
    
    public void iniciarJoc(){
        crearFitxes();
        crearJugadores();
        anadirFichasJugadores();
    }

    private void crearJugadores() {
        jugadors = new ArrayList();
        for (int i = 0; i < 4; i++) {
            jugadors.add(new Jugador("Jugador " + (i + 1)));
        }
    }

    private void crearFitxes() {
        fitxes = new ArrayList();
        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7; j++) {
                fitxes.add(new Fitxa(i, j));
            }
        }
    }

    private void anadirFichasJugadores() {
        boolean[] utilitzades = new boolean[fitxes.size()];
        int contador = 0;
        while (contador != fitxes.size()) {
            for (int i = 0; i < jugadors.size(); i++) {
                Random r = new Random();
                int ale = r.nextInt(fitxes.size());
                while (utilitzades[(ale = r.nextInt(fitxes.size()))]);
                jugadors.get(i).setFitxesJugador(fitxes.get(ale));
                utilitzades[ale] = true;
                contador++;
            }
        }
    }

    //  Restem -48 per que es on començen els numerics a la taula ASCII.
    private int trobarSisDoble() {
        int jugador = 0;
        for (Jugador j : jugadors) {
            if (j.buscarFitxa()) {
                jugador = (int) j.getNombreJugador().charAt(j.getNombreJugador().length() - 1) - 48;
                break;
            }
        }
        return jugador;
    }

    private void mostrarTauler() {
        for (Fitxa f : tauler) {
            System.out.print(f.mostrarFitxa());
        }
        System.out.println();
    }

}
