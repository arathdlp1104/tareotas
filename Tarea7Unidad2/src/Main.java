import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = generarNumerosAleatorios(10, 1, 100);
        List<Double> raicesCuadradas = new ArrayList<>();
        List<Double> numerosCuadrados = new ArrayList<>();

        for (int num : numeros) {
            raicesCuadradas.add(Math.sqrt(num));
            numerosCuadrados.add(Math.pow(num, 2));
        }

        double media = calcularMedia(numeros);
        double desviacion = calcularDesviacionEstandar(numeros, media);

        System.out.println("Números originales: " + numeros);
        System.out.println("Raíces cuadradas: " + raicesCuadradas);
        System.out.println("Números al cuadrado: " + numerosCuadrados);
        System.out.println("Media: " + media);
        System.out.println("Desviación estándar: " + desviacion);
        System.out.println("HECHO Y REALIZADO POR EDUARDO CALDERÓN TORRES");
    }

    public static List<Integer> generarNumerosAleatorios(int cantidad, int min, int max) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            int numeroAleatorio = (int) (Math.random() * (max - min + 1)) + min;
            numeros.add(numeroAleatorio);
        }
        return numeros;
    }

    public static double calcularMedia(List<Integer> numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return (double) suma / numeros.size();
    }

    public static double calcularDesviacionEstandar(List<Integer> numeros, double media) {
        double sumaCuadrados = 0;
        for (int num : numeros) {
            sumaCuadrados += Math.pow(num - media, 2);
        }
        return Math.sqrt(sumaCuadrados / numeros.size());



    }
}