package myutils;

import java.util.Calendar;

public class MyUtils {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String cadenaInvertida(String cadena) {
        String cadenaInvertida = "";

        if (cadena == null) {
            System.out.println(cadena);
        } else if (!cadena.equals("")) {
            for (int i = cadena.length() - 1; i >= 0; i--) {
                cadenaInvertida += cadena.charAt(i);
            }
        }
        return cadenaInvertida;
    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edad(int day, int month, int year) {

        Calendar cal = Calendar.getInstance();
        Calendar calComprobar = Calendar.getInstance();
        calComprobar.set(year, month - 1, day);

        int edad = (cal.get(Calendar.YEAR) - calComprobar.get(Calendar.YEAR));

        if ((cal.get(Calendar.DAY_OF_YEAR)) < calComprobar.get(Calendar.DAY_OF_YEAR)) {
            edad -= 1;
        }
        if (calComprobar.compareTo(cal) > 0 || day > 31 || month > 12 || day < 1 || month < 1 || year < 1) {
            edad = -2;
        }
        if (edad > 150) {
            edad = -1;
        }

        return edad ;
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static int factorial(int numero) {

        int resultat;
        
        if (numero == 0) {
            return 1;
        } else if (numero < 0) {
            return -1;
        } else {
            resultat = numero * factorial(numero - 1);
            
        }
        return resultat;
    }
}
