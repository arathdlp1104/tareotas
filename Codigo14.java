import java.util.Scanner;

public class Main {

    // Clase para la encriptación
    public static class EncriptacionEmpleados {

        // Método para encriptar los datos
        public static String encriptarDatos(String correo, String fechaAscenso, double salario) {
            StringBuilder resultado = new StringBuilder();

            // Encriptar correo electrónico
            String[] partesCorreo = correo.split("@");
            resultado.append(new StringBuilder(partesCorreo[0]).reverse()).append("@").append(partesCorreo[1]);

            // Encriptar fecha de ascenso
            String[] partesFecha = fechaAscenso.split("-");
            int sumaFecha = Integer.parseInt(partesFecha[0]) + Integer.parseInt(partesFecha[1]) + Integer.parseInt(partesFecha[2]);
            resultado.append("|").append(sumaFecha);

            // Encriptar salario
            int parteEntera = (int) salario;
            int parteDecimal = (int) Math.round((salario - parteEntera) * 100);  // Parte decimal
            int diferencia = Math.abs(parteEntera - parteDecimal);
            resultado.append("|").append(diferencia * 2);

            return resultado.toString();
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Correo: ");
        String correo = scanner.nextLine();

        System.out.print("Fecha de ascenso (YYYY-MM-DD): ");
        String fechaAscenso = scanner.nextLine();

        System.out.print("Salario: ");
        double salario = scanner.nextDouble();

        // Encriptar datos
        String datosEncriptados = EncriptacionEmpleados.encriptarDatos(correo, fechaAscenso, salario);
        System.out.println("Datos encriptados: " + datosEncriptados);

        scanner.close();
    }
}
