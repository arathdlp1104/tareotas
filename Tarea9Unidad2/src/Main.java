import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas del punto 1 (x1 y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Ingrese las coordenadas del punto 2 (x2 y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.println("Ingrese las coordenadas del punto 3 (x3 y3): ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        double ladoA = distancia(x2, y2, x3, y3);
        double ladoB = distancia(x1, y1, x3, y3);
        double ladoC = distancia(x1, y1, x2, y2);

        double perimetro = ladoA + ladoB + ladoC;

        double s = perimetro / 2;
        double area = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));

        double altura = (2 * area) / ladoA;

        double anguloA = Math.toDegrees(Math.acos((Math.pow(ladoB, 2) + Math.pow(ladoC, 2) - Math.pow(ladoA, 2)) / (2 * ladoB * ladoC)));
        double anguloB = Math.toDegrees(Math.acos((Math.pow(ladoA, 2) + Math.pow(ladoC, 2) - Math.pow(ladoB, 2)) / (2 * ladoA * ladoC)));
        double anguloC = Math.toDegrees(Math.acos((Math.pow(ladoA, 2) + Math.pow(ladoB, 2) - Math.pow(ladoC, 2)) / (2 * ladoA * ladoB)));

        boolean equilatero = (ladoA == ladoB && ladoB == ladoC);

        double[] puntoMedioAB = puntoMedio(x1, y1, x2, y2);
        double[] puntoMedioBC = puntoMedio(x2, y2, x3, y3);
        double[] puntoMedioCA = puntoMedio(x1, y1, x3, y3);

        System.out.printf("Lados del triángulo: A = %.2f, B = %.2f, C = %.2f\n", ladoA, ladoB, ladoC);
        System.out.printf("Perímetro: %.2f\n", perimetro);
        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Altura respecto al lado A: %.2f\n", altura);
        System.out.printf("Ángulos internos: A = %.2f°, B = %.2f°, C = %.2f°\n", anguloA, anguloB, anguloC);
        System.out.println("¿Es equilátero? " + (equilatero ? "Sí" : "No"));
        System.out.printf("Punto medio del lado AB: (%.2f, %.2f)\n", puntoMedioAB[0], puntoMedioAB[1]);
        System.out.printf("Punto medio del lado BC: (%.2f, %.2f)\n", puntoMedioBC[0], puntoMedioBC[1]);
        System.out.printf("Punto medio del lado CA: (%.2f, %.2f)\n", puntoMedioCA[0], puntoMedioCA[1]);

        System.out.println("\nHecho por Eduardo Calderon Torres. Paseme profe, ándale.");

        sc.close();
    }

    public static double distancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] puntoMedio(double x1, double y1, double x2, double y2) {
        double[] puntoMedio = {(x1 + x2) / 2, (y1 + y2) / 2};
        return puntoMedio;

    }
}