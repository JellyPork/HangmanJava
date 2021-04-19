
import java.util.Arrays;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String jugarOtra="si"; //para jugar otra partida
        while(jugarOtra.equals("si")) {
            int puntuacion = 0;

            System.out.println("Se esta generando la palabra a adivinar");
            String palabraInicial = ControlJuego.generarPalabra();
            String palabraAux = palabraInicial;
            palabraInicial = "";

            for (int l = 0; l < palabraAux.length(); l++) {
                palabraInicial += "" + palabraAux.charAt(l) + " ";
            }


            String palabraJuego = ""; // la palabra que va a ir rellenando el jugador 2
            System.out.println("La palabra a buscar tiene la siguiente longitud: ");

            for (int i = 0; i < palabraInicial.length() / 2; i++) { //imprimo _ por cada letra que tenga la palabra
                palabraJuego += "_ ";
            }

            System.out.println(palabraJuego);

            String jugada;
            String[] palabraJugador = new String[palabraInicial.length()];
            for (int m = 0; m < palabraJuego.length(); m++) {
                palabraJugador[m] = "" + palabraJuego.charAt(m);
            }
            int caracteresAnterior = palabraInicial.length() / 2; //si no varia el numero de '_' en cada tirada significa
            //que no ha introducido un caracter valido y pierde una vida
            int caracteresActual;


            while (puntuacion < 5) { //si llega a perder 5 vidas el jugador pierde

                System.out.println("Numero de oportunidades antes de morir: " + (puntuacion) + " de 5.");

                jugada = Jugador.ingresarChar();
                

                palabraJugador = ControlJuego.checarLetrasAcertadas(jugada, palabraInicial, palabraJugador); //comprueba si la letra esta en la palabra

                for (int m = 0; m < palabraJugador.length; m++) { //imprimo lo que ve el usuario
                    System.out.print(palabraJugador[m]);
                }
                System.out.println();

                palabraJuego = "";

                for (int x = 0; x < palabraInicial.length(); x++) {
                    palabraJuego += palabraJugador[x];
                }

                caracteresActual = ControlJuego.contarCaracteres(palabraJuego, '_');
                if (caracteresActual == 0) {
                    puntuacion = 6; //si puntuacion vale 6 es que el usuario ha ganado la partida
                }

                if (caracteresActual == caracteresAnterior) { // compruebo si las '_' han variado en el turno para que pierda una vida
                    puntuacion++;
                }
                if (puntuacion == 5) {
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Su cuello no ha aguantado más y se ha partido");
                }
                if (puntuacion == 6) {
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Se ha librado por los pelos!!!!!!!!!");
                }
                ControlJuego.dibujarAhorcado(puntuacion);
                caracteresAnterior = caracteresActual;
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Juego finalizado");

            
            jugarOtra = Jugador.ingresarSi();
        }
    }
    
    

    
}
