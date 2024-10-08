public class Main {
    public static void main(String[] args) {
        String palabra = "supercalifragilisticoespialidoso";

        // 1. Mostrar la longitud de la cadena
        System.out.println("Longitud: " + palabra.length());

        // 2. Mostrar el carácter en la posición 10
        System.out.println("Carácter en posición 10: " + palabra.charAt(9));

        // 3. Convertir la cadena a mayúsculas
        System.out.println("En mayúsculas: " + palabra.toUpperCase());

        // 4. Obtener la subcadena desde la posición 5 hasta la 15
        System.out.println("Subcadena (5–15): " + palabra.substring(4, 15));

        // 5. Mostrar la primera ocurrencia de la letra 'i'
        System.out.println("Primera ocurrencia de 'i': " + palabra.indexOf('i'));

        // 6. Mostrar la última ocurrencia de la letra 'o'
        System.out.println("Última ocurrencia de 'o': " + palabra.lastIndexOf('o'));

        // 7. Convertir la cadena a minúsculas
        System.out.println("En minúsculas: " + palabra.toLowerCase());

        // 8. Obtener la subcadena desde la posición 7 hasta el final
        System.out.println("Subcadena desde la posición 7: " + palabra.substring(6));

        // 9. Mostrar la última ocurrencia de la frase "li"
        System.out.println("Última ocurrencia de 'li': " + palabra.lastIndexOf("li"));


    }
}