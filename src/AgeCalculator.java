import java.util.Scanner;
import java.time.LocalDate;

public class AgeCalculator {

    public static void main(String[] args) {

        System.out.println(LocalDate.now()); // Muestra la fecha actual utilizando LocalDate

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu año de nacimiento: "); // Solicita al usuario ingresar el año de nacimiento
        int yearOfBirth = scanner.nextInt(); // Lee el año de nacimiento ingresado por el usuario
        int currentYear = LocalDate.now().getYear(); // Obtiene el año actual utilizando LocalDate
        int age = currentYear - yearOfBirth; //
        System.out.println("Tu edad es: " + age + " años"); //
        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}
