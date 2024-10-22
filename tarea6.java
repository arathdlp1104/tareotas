import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Ingresa tu nombre completo: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa tu matricula: ");
        String matricula = scanner.nextLine();

        System.out.println("Ingresa tu promedio: ");
        double promedio = scanner.nextDouble();

        System.out.println("¿Cuántas materias deseas inscribir?: ");
        int materias = scanner.nextInt();


        System.out.println("¿Cuántas materias aprobaste el semestre pasado?: ");
        int materiasAprobadas = scanner.nextInt();


        if (promedio < 7.0) {
            System.out.println("Se niega la inscripción a cualquier materia.");
        } else if (promedio >= 7.0 && promedio < 8.5) {
            if (materias < 3) {
                System.out.println("Puedes inscribir las materias.");
            } else {
                System.out.println("Se niega la inscripción por sobrecarga académica.");
            }
        } else if (promedio >= 8.5) {
            if (nombre.length() > 25) {
                System.out.println("Corrige el nombre.");
            }
            if (matricula.length() < 8) {
                System.out.println("Se niega la inscripción por formato de matrícula incorrecto.");
            } else {
                if (materias <= 5) {
                    System.out.println("Se permite la inscripción a todas las materias.");
                } else {
                    if (materiasAprobadas > 3) {
                        System.out.println("Puedes inscribir hasta 6 materias.");
                    } else {
                        System.out.println("Solo puedes inscribir un máximo de 5 materias.");
                    }
                }
            }
        }

        if (materias > 5 && promedio >= 7.0) {
            System.out.println("Puedes inscribir 6 materias.");
        } else if (materias > 5) {
            System.out.println("Puedes inscribir 5 solamente.");
        }
        scanner.close();


        System.out.println("¿Cuál es su tipo de membresía?: ");
        String membresia = scanner.nextLine().toLowerCase();

        System.out.println("¿Cuál es su edad?: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Cuál es su tipo de evento? (Internacional o Nacional): ");
        String evento = scanner.nextLine().toLowerCase(); // Normalizamos la entrada


        if (membresia.equals("premium")) {
            if (evento.equals("internacional") && edad < 18) {
                System.out.println("Se niega la venta para eventos internacionales.");
            } else if (edad >= 18 && edad < 25) {
                System.out.println("Para eventos internacionales se le da 20% de descuento.");
                System.out.println("Para eventos nacionales, se le ofrece un descuento del 10%.");
            } else if (edad >= 25) {
                System.out.println("Para eventos internacionales se le da 25% de descuento.");
                System.out.println("Para eventos nacionales, se le ofrece un descuento del 15%.");
            }
        }

        else if (membresia.equals("estándar")) {
            if (evento.equals("internacional") && edad < 18) {
                System.out.println("Se niega la venta para eventos internacionales.");
            } else {
                if (evento.equals("nacional")) {
                    System.out.println("Para eventos nacionales se le da un 5% de descuento.");
                } else {
                    System.out.println("Para eventos internacionales no tiene descuentos.");
                }
            }
        }

        else {
            System.out.println("No tiene descuentos disponibles.");
            if (evento.equals("internacional")) {
                System.out.println("No puede comprar boletos para eventos internacionales.");
            }
        }

        scanner.close();

        // Solicitar datos al usuario
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Validar que el nombre no contenga números
        if (!nombre.matches("[a-zA-Z\\s]+")) {
            System.out.println("Error: El nombre no debe contener números.");
            return;
        }

        System.out.println("Ingrese su edad: ");
        int edad2 = scanner.nextInt();

        System.out.println("Ingrese su país de residencia: ");
        scanner.nextLine();
        String pais = scanner.nextLine().toLowerCase();

        System.out.println("Ingrese su estado civil (soltero/casado): ");
        String estadoCivil = scanner.nextLine().toLowerCase(); // Normalizar a minúsculas

        System.out.println("Ingrese sus ingresos anuales: ");
        double ingresos = scanner.nextDouble();

        System.out.println("¿Tiene hijos? (sí/no): ");
        scanner.nextLine(); // Consumir la línea pendiente
        String tieneHijos = scanner.nextLine().toLowerCase(); // Normalizar a minúsculas

        // Inicializar variables de resultado
        double descuento = 0;
        double montoFinal = 0;

        // Lógica de elegibilidad
        if (edad < 25) {
            System.out.println("No es elegible para beneficios.");
            return; // Finalizar el programa si no es elegible
        } else {
            if (pais.equals("mexico")) {
                if (estadoCivil.equals("casado")) {
                    if (ingresos < 300000) {
                        descuento = 10; // Descuento del 10%
                        if (tieneHijos.equals("sí")) {
                            descuento += 0; // Sin cambios si tiene hijos
                        } else {
                            descuento -= 5; // Descuento del 5% si no tiene hijos
                        }
                    } else {
                        descuento = 5; // Descuento del 5% si no tiene hijos
                    }
                } else if (estadoCivil.equals("soltero")) {
                    if (ingresos < 400000) {
                        descuento = 8; // Descuento del 8%
                    } else {
                        System.out.println("No recibe beneficios.");
                        return; // Finalizar el programa
                    }
                }
            } else if (pais.equals("usa")) {
                if (estadoCivil.equals("casado") && ingresos < 500000) {
                    descuento = 12; // Descuento del 12%
                    if (tieneHijos.equals("sí")) {
                        descuento += 3; // Sumar 3% adicional si tiene hijos
                    }
                } else if (estadoCivil.equals("soltero") && ingresos < 200000) {
                    descuento = 7; // Descuento del 7%
                    if (tieneHijos.equals("sí")) {
                        descuento += 3; // Sumar 3% adicional si tiene hijos
                    }
                }
            } else { // Canadá u otro país
                if (estadoCivil.equals("casado")) {
                    descuento = 5; // Descuento base del 5%
                } else {
                    descuento = 3; // Descuento base del 3%
                }
                if (ingresos < 200000) {
                    descuento += 2; // Agregar 2% adicional si ingresos son menores a 200,000
                }
            }
        }

        // Cálculo del monto final
        double costoSeguro = 100000; // Suponiendo un costo base del seguro
        montoFinal = costoSeguro * (1 - (descuento / 100)); // Aplicar el descuento

        // Mostrar resultado
        System.out.println("Nombre: " + nombre);
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Monto final a pagar: $" + montoFinal);

        scanner.close(); // Cerrar el scanner










    }
    }


