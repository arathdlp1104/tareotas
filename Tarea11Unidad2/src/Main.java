public class Main {
    public static void main(String[] args) {
        String nombreCompleto = "García, Juan Carlos";

        // 1. Obtener la longitud del nombre completo
        int longitud = nombreCompleto.length();
        System.out.println("Longitud del nombre completo: " + longitud);

        // 2. Extraer el apellido (subcadena antes de la coma)
        String apellido = nombreCompleto.substring(0, nombreCompleto.indexOf(',')).trim();
        System.out.println("Apellido: " + apellido);

        // 3. Extraer el nombre completo sin el apellido (subcadena después de la coma)
        String nombreSinApellido = nombreCompleto.substring(nombreCompleto.indexOf(',') + 1).trim();
        System.out.println("Nombre sin apellido: " + nombreSinApellido);

        // 4. Mostrar el primer nombre (primera palabra del nombre completo)
        String primerNombre = nombreSinApellido.split(" ")[0];
        System.out.println("Primer nombre: " + primerNombre);

        // 5. Convertir el apellido a mayúsculas
        String apellidoMayusculas = apellido.toUpperCase();
        System.out.println("Apellido en mayúsculas: " + apellidoMayusculas);

        // 6. Convertir el nombre completo a minúsculas
        String nombreMinusculas = nombreCompleto.toLowerCase();
        System.out.println("Nombre completo en minúsculas: " + nombreMinusculas);

        // 7. Mostrar el carácter en la posición 5 del nombre completo
        char caracterPosicion5 = nombreCompleto.charAt(4); // índice 4 (posición 5)
        System.out.println("Carácter en la posición 5: " + caracterPosicion5);

        // 8. Mostrar la posición de la primera ocurrencia de la letra 'a'
        int primeraOcurrenciaA = nombreCompleto.indexOf('a') + 1; // Añadimos 1 para posición en lugar de índice
        System.out.println("Primera ocurrencia de 'a': " + primeraOcurrenciaA);

        // 9. Mostrar la última ocurrencia de la letra 'a'
        int ultimaOcurrenciaA = nombreCompleto.lastIndexOf('a') + 1; // Añadimos 1 para posición en lugar de índice
        System.out.println("Última ocurrencia de 'a': " + ultimaOcurrenciaA);



    }
}