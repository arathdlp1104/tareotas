import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int numero = Scanner.nextInt();
        ;

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("El numero es divisible entre 3 y 5");
        } else if (numero % 3 == 0) {
            System.out.println("El número es divisible entre 3.");
        } else if (numero % 5 == 0) {
            System.out.println("El número es divisible entre 5.");
        } else {
            System.out.println("El número no es divisible ni entre 3 ni entre 5.");
        }

        System.out.println("\nIngresa los tres lados del triangulo");
        int ladoUno = Scanner.nextInt();
        int ladoDos = Scanner.nextInt();
        int ladoTres = Scanner.nextInt();

        if (ladoUno == ladoDos && ladoDos == ladoTres) {
            System.out.println("El triangulo es equilatero");
        } else if (ladoUno == ladoDos || ladoDos == ladoTres || ladoUno == ladoTres) {
            System.out.println("El triangulo es isosceles");
        } else {
            System.out.println("El triangulo es esacaleno");
        }

        System.out.println("Ingresar salario");
        int salario = Scanner.nextInt();
        if (salario <= 10000) {
            System.out.println("No pagas impuestos");
        } else if (salario > 10001 && salario < 20000) {
            System.out.println("Se descuenta 10% de impuesto");
            double salarioImpuestado = salario * 0.10;
            double salarioFinal = salario - salarioImpuestado;
            System.out.println("El salario es " + salarioFinal);

        } else if (salario > 20000) {
            System.out.println("Se descuenta 20% de impuesto");
            double salarioImpuestado = salario * 0.20;
            double salarioFinal = salario - salarioImpuestado;
            System.out.println("El salario es " + salarioFinal);
        }


        System.out.println("Ingresa un numero");
        int numeroDivisible = Scanner.nextInt();
        if (numeroDivisible % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }


    }
}
