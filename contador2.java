//Giordano, Juan Carlos Daniel, VINF011535, 12/06/2022
public class ConteoLetras{

    public static void main(String[] args) {
        Contador cont = new Contador();

        try{
            Scanner sc = new Scanner(System.in);
                System.out.println("¿Cuántas palabras va a ingresar?: ");

            int cantidad = Integer.parseInt(sc.nextLine());

            String palabras[];

            palabras = new String[cantidad];

            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese una palabra, por favor: " + "(" + (i + 1) + ")");

                palabras[i] = sc.nextLine();
            }

            for (String palabra : palabras) {
                palabra = palabra.toUpperCase();
                cont.conteo(palabra);

            }
            cont.Mostrar();
        } catch (NumberFormatException exc) {
            System.out.println("Ingrese un número e intente de nuevo, por favor.");
        }
    }
}