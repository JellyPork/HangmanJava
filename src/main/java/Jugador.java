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
}
