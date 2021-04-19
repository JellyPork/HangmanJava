import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
 * En el ControlJuego se generara la palabra en base a una lista
 * ademas de que se verificara que los caracteres sean los correctos y se cuente
 * bien el numero de caracteres.
 * Tambien se dibujara el ahorcado
 */

/**
 *
 * @author Lenovo
 */
public class ControlJuego {
    
    
    
    public static String generarPalabra(){
        String[] listaPalabras = {"Javier","Javier","pescado","Valeria","Probando","Universidad","Jose"};
        String palabra;
        
        palabra = listaPalabras[(int)(Math.random()*listaPalabras.length)];
       
        
        return palabra;
        
    }
    
    public static String[] checarLetrasAcertadas (String jugada, String palabraInicial, String []palabraJugador2){
            //ejecuta la jugada y devuelve la palabra modificada si ha acertado alguna letra

            for (int i = 0; i < palabraInicial.length(); i++) {
                if (palabraInicial.charAt(i) == jugada.charAt(0)) {
                    palabraJugador2[i] = jugada;
                }
            }
            return palabraJugador2;
    }
    
    public static int contarCaracteres (String cadena,char caracter){
            int posicion, contador = 0;
            //se busca la primera vez que aparece
            posicion = cadena.indexOf(caracter);
            while (posicion != -1) { //mientras se encuentre el caracter
                contador++;           //se cuenta
                //se sigue buscando a partir de la posición siguiente a la encontrada
                posicion = cadena.indexOf(caracter, posicion + 1);
            }
            return contador;
    }  
    
    public static int verificarPalabra(String palabraAux,String jugada,int puntuacion){
        int temp = puntuacion;
        
        
        if(jugada.equals(palabraAux)){
            puntuacion = 6;
        }else{
            puntuacion++;
        }
        return puntuacion;
    }
    
    public static void dibujarAhorcado(int intentoFallido){
        switch(intentoFallido){
            case 1: System.out.println("    ______");
                    System.out.println("   |     |");
                    System.out.println("   |     O"  );
                    System.out.println("   |        ");
                    System.out.println("   |        ");
                    System.out.println("___|________");
                    break;
            case 2: System.out.println("    ______");
                    System.out.println("   |     |");
                    System.out.println("   |     O");
                    System.out.println("   |     | ");
                    System.out.println("   |      ");
                    System.out.println("___|________");
                    break;  
            case 3: System.out.println("    ______");
                    System.out.println("   |     |");
                    System.out.println("   |     O");
                    System.out.println("   |    /| ");
                    System.out.println("   |        ");
                    System.out.println("___|________");
                    break;
            case 4: System.out.println("    ______");
                    System.out.println("   |     |");
                    System.out.println("   |     O");
                    System.out.println("   |    /|/ ");
                    System.out.println("   |        ");
                    System.out.println("___|________");
                    break;
            case 5: System.out.println("    ______");
                    System.out.println("   |     |");
                    System.out.println("   |     O");
                    System.out.println("   |    /|/ ");
                    System.out.println("   |    /  ");
                    System.out.println("___|________");
                    break;
            case 6: System.out.println("    ______");
                    System.out.println("   |     |");
                    System.out.println("   |     O");
                    System.out.println("   |    /|/ ");
                    System.out.println("   |    / /");
                    System.out.println("___|________");
                    break;
        }
        
        

    }
}

