import java.util.Scanner; //se usa para leer la entrada del usuario por consola

public class Calculator { // las clases en java encapsulan la funcionalidad y el comportamiento del programa.

    public static void main(String[] args) { //Es el punto de entrada de la aplicación Java. Cuando ejecutas un programa Java, el código en el método main es el que se ejecuta primero.
        Scanner scanner = new Scanner(System.in); //Esta línea crea una instancia de la clase Scanner llamada scanner. La System.in se utiliza como fuente de entrada, lo que significa que leerá la entrada del usuario desde la consola.
        boolean exit = false;

        while (!exit) {
            System.out.println("Brian Gelvez");
            System.out.println("Mi Calculadora :)");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Elije una opción (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    suma(scanner);
                    break;
                case 2:
                    rest(scanner);
                    break;
                case 3:
                    multiply(scanner);
                    break;
                case 4:
                    division(scanner);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Gracias por haber utilizado mi calculadora.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida (1-5).");
            }
        }

        scanner.close();
    }

    private static void suma(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Resultado: " + result);
    }

    private static void rest(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Resultado: " + result);
    }

    private static void multiply(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Resultado: " + result);
    }

    private static void division(Scanner scanner) {
        System.out.print("Ingrese el dividendo: ");
        double dividend = scanner.nextDouble();
        System.out.print("Ingrese el divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor != 0) {
            double result = dividend / divisor;
            System.out.println("Resultado: " + result);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}
