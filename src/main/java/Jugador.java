import java.util.Scanner;
/*
 * En el Jugador se estaran pidiendo datos para ser enviados al Juego
 */

/**
 *
 * @author Lenovo
 */
public class Jugador {
    public static String ingresarChar(){
        Scanner teclado = new Scanner(System.in);
        String letra;
        
        System.out.println("Introduzca una letra: ");
                letra = teclado.nextLine();

                while (letra.length() != 1) { //Validacion de la entrada del jugador 2
                    System.out.println("Introduzca SOLO una letra: ");
                    letra = teclado.nextLine();
                }
        
        
        
        return letra;
    }
    public static String ingresarSi(){
        String jugarOtra;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Desea jugar otra partida? Introduzca si para continuar");
            jugarOtra = (teclado.nextLine()).toLowerCase();
            
        return jugarOtra;
    }
    
    public static int ingresarYes(){
        int decision;
        String dec;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Deseas adivinar la palabra directamente?");
        System.out.println("1.Ingresar Letra");
        System.out.println("2.Ingresar Palabra");
            decision = teclado.nextInt();
            
          
        return decision;
    }
    
    public static String ingresarPalabra(){
        Scanner teclado = new Scanner(System.in);
        String palabra;
        
        System.out.println("Introduzca una palabra: ");
                palabra = teclado.nextLine();
                
        return palabra;
    }
}
