package classwork;
// Switch cases

import java.util.Scanner;
public class Case {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a number (1-3): ");
        int choice = ob.nextInt();
        
        switch (choice) {
            case 1 -> System.out.println("You entered 1.");
            case 2 -> System.out.println("You entered 2.");
            case 3 -> System.out.println("You entered 3.");
            default -> System.out.println("Invalid choice.");
        }
    }
}
