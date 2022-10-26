//Giordano, Juan Carlos Daniel, VINF011535, 12/06/2022

public class Contador{

    public Contador() {
    }

    int[] conteos = new int[26];
    public void conteo(String palabra) {        //Se cuenta la frecuencia de cada letra.
        
        for (int i = 0; i < palabra.length(); i++) {
            try{
                conteos[palabra.charAt(i) - 'A']++;
            }
            catch(ArrayIndexOutOfBoundsException exc){
                System.out.println("Ingrese solamente letras e intente de nuevo, por favor.");
            }
        }
    }
    public void Mostrar(){      //Y aquÃ­ imprimimos las frecuencias.
        System.out.println("Conteo de letras");
        for (int i = 0; i < conteos.length; i++){
            if (conteos[i] != 0){
                System.out.println((char) (i + 'A') + ": " + conteos[i]);
            }
        }
    }
}
