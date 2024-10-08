import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dirección
        System.out.println("Introduce tu dirección completa (Ejemplo: Av. Libertador, 1234, Ciudad de México, C.P. 06000):");
        String direccion = scanner.nextLine();

        // Longitud de la dirección
        System.out.println("La longitud de la dirección es: " + direccion.length());

        // Primera y última letra
        char primeraLetra = direccion.charAt(0);
        char ultimaLetra = direccion.charAt(direccion.length() - 1);
        System.out.println("La primera letra de la dirección es: " + primeraLetra);
        System.out.println("la ultima letra de la dirección es: " + ultimaLetra);

        // Mayúsculas y minúsculas
        String direccionMayuscula = direccion.toUpperCase();
        String direccionMinuscula = direccion.toLowerCase();
        System.out.println("Dirección en mayúsculas: " + direccionMayuscula);
        System.out.println("Dirección en minúsculas: " + direccionMinuscula);

        // Buscar primer número (ejemplo '1')
        int posicionNumero = direccion.indexOf('1');
        System.out.println("La primera aparición de un número está en la posición: " + posicionNumero);

        // Quitar comas
        String direccionSinComas = direccion.replace(",", "");
        System.out.println("Dirección sin comas: " + direccionSinComas);

        // Quitar espacios extra
        String direccionSinEspacios = direccion.trim();
        System.out.println("Dirección sin espacios extra: " + direccionSinEspacios);

        // Abreviar dirección hasta "C.P."
        int indiceCP = direccion.indexOf("C.P.");
        if (indiceCP != -1) {
            String versionAbreviada = direccion.substring(0, indiceCP).trim() + " " + direccion.substring(indiceCP);
            System.out.println("Versión abreviada de la dirección: " + versionAbreviada);
        } else {
            System.out.println("No se encontró la frase 'C.P.' en la dirección.");
        }



    }
}