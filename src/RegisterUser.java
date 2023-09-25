import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

public class RegisterUser {
    private static List<User> userDatabase = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(userDatabase);

        while (true) {
            System.out.println("Welcome to the User Registration System");
            System.out.println("1. Register");
            System.out.println("2. Log In");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the pending newline

            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    logIn(scanner);
                    break;
                case 3:
                    System.out.println("Thank you for using the User Registration System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }

    private static void registerUser(Scanner scanner) {
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        User newUser = new User(firstName, lastName, email, password);
        userDatabase.add(newUser);

        System.out.println("Registration successful. Welcome, " + firstName + "!");
    }

    private static void logIn(Scanner scanner) {
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        for (User user : userDatabase) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                System.out.println("Log In successful. Welcome, " + user.getFirstName() + " " + user.getLastName() + "!");
                return;
            }
        }
        System.out.print(userDatabase);
        System.out.println("Incorrect email or password. Please try again.");
    }
}