////Giordano, Juan Carlos Daniel, VINF011535, 12/06/2022
import java.util.Scanner; 

public class Exc2 

{ 

    public static void main(String[] args) { 

   
    int[] conteos = new int[26]; 
    Scanner teclado = new Scanner(System.in); 

    //Leer palabra del usuario
    System.out.print("Ingrese una palabra (por favor, sólo letras):"); 
    String palabra = teclado.nextLine(); 

    //Se verifica...
    teclado.close(); 

    //Convierte a mayúscula. 
    palabra = palabra.toUpperCase(); 

    //Cuenta la frecuencia de cada letra y colocamos un "try" "catch" para la excepción "ArrayIndexOutOfBoundsException"
    for (int i=0; i < palabra.length(); i++) 
        try {
            conteos[palabra.charAt(i)-'A']++;
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Solo letras, por favor, intente de nuevo.");
        }
        finally{}
    
    //Imprime frecuencias.
    System.out.println(); 

    for (int i=0; i < conteos.length; i++) 
        if (conteos [i] != 0) 
            System.out.println((char)(i +'A') + ": " + conteos[i]); 
    } 
}