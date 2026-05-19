import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Weight conversion program
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Welcome to the weight conversion program!");
        System.out.println("1: Convert pounds to kilograms");
        System.out.println("2: Convert kilograms to pounds");

        System.out.print("Please enter your choice: ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Please enter the weight in pounds: ");
            weight = scanner.nextDouble();

            newWeight = weight * 0.45359237;

            System.out.printf("The new weight in kilograms is: %.2f%n", newWeight);

        } else if (choice == 2) {
            System.out.print("Please enter the weight in kilograms: ");
            weight = scanner.nextDouble();

            newWeight = weight / 0.45359237;

            System.out.printf("The new weight in pounds is: %.2f%n", newWeight);

        } else {
            System.out.println("Not a valid option.");
        }

        scanner.close();
    }
}