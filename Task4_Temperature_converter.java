import java.util.Scanner;

public class Task4_Temperature_converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Convert to (1) Celsius or (2) Fahrenheit? ");
        int choice = sc.nextInt();100

        if (choice == 1) {
            double celsius = (temp - 32) * 5 / 9;
            System.out.println("In Celsius: " + celsius + " °C");
        } else if (choice == 2) {
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println("In Fahrenheit: " + fahrenheit + " °F");
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        sc.close();
    }
}

