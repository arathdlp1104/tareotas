public class Main {
    public static void main(String[] args) {
        String producto = "12345;Laptop HP Pavilion;1500.99;Electrónica";

        // 1. Obtener la longitud de la cadena
        int longitudCadena = producto.length();
        System.out.println("Longitud de la cadena: " + longitudCadena);

        // 2. Extraer el ID del producto (antes del primer ;)
        String idProducto = producto.substring(0, producto.indexOf(';'));
        System.out.println("ID del producto: " + idProducto);

        // 3. Obtener el nombre del producto (entre el primer y segundo ;)
        int primerPuntoYComa = producto.indexOf(';');
        int segundoPuntoYComa = producto.indexOf(';', primerPuntoYComa + 1);
        String nombreProducto = producto.substring(primerPuntoYComa + 1, segundoPuntoYComa);
        System.out.println("Nombre del producto: " + nombreProducto);

        // 4. Convertir el nombre del producto a mayúsculas
        String nombreMayus = nombreProducto.toUpperCase();
        System.out.println("Nombre del producto en mayúsculas: " + nombreMayus);

        // 5. Extraer el precio (entre el segundo y tercer ;)
        int tercerPuntoYComa = producto.indexOf(';', segundoPuntoYComa + 1);
        String precioStr = producto.substring(segundoPuntoYComa + 1, tercerPuntoYComa);
        double precio = Double.parseDouble(precioStr);
        System.out.println("Precio del producto: " + precio);

        // 6. Mostrar el carácter en la posición 10 del nombre
        char caracterPos10 = nombreProducto.charAt(9); // El índice empieza en 0
        System.out.println("Carácter en la posición 10 del nombre: " + caracterPos10);

        // 7. Obtener la primera ocurrencia de la letra 'a' en el nombre
        int primeraA = nombreProducto.indexOf('a');
        System.out.println("Primera ocurrencia de 'a' en el nombre: " + primeraA);

        // 8. Mostrar la última ocurrencia de la letra 'o' en el nombre
        int ultimaO = nombreProducto.lastIndexOf('o');
        System.out.println("Última ocurrencia de 'o' en el nombre: " + ultimaO);

        // 9. Convertir el precio a texto y concatenarlo con la categoría
        String categoria = producto.substring(tercerPuntoYComa + 1);
        String precioYCategoria = precioStr + " - " + categoria;
        System.out.println("Precio y categoría: " + precioYCategoria);

        // 10. Mostrar la subcadena desde la posición 7 del nombre
        String subcadenaDesde7 = nombreProducto.substring(6);
        System.out.println("Subcadena desde la posición 7 del nombre: " + subcadenaDesde7);



    }
}