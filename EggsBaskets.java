import java.util.Scanner;
public class EggsBaskets {
    //Programmer: Harvy Jones Pontillas
    public static void main(String[] args) {
        int numOfEggs, numOfBaskets, totalNumOfEggs; // Variables declaration
        Scanner keyboard = new Scanner(System.in); // Scanner assignment

        System.out.println("Enter the number of eggs in each basket:"); // Input and output number of eggs
        numOfEggs = keyboard.nextInt();                                   

        System.out.println("Enter the number of baskets:"); // Input and output number of baskets
        numOfBaskets = keyboard.nextInt();

        // Display output
        System.out.println("If you have");
        System.out.println(numOfEggs + " eggs per basket and");
        System.out.println(numOfBaskets + " baskets, then");

        totalNumOfEggs = numOfEggs * numOfBaskets; // Computation for the total number of eggs
        System.out.println("the total number of eggs is " + totalNumOfEggs + "."); // Display the total number of eggs
        System.out.println("Now we take two eggs out of each basket."); 
        System.out.println("Now you have");

        int numOfEggs_new = numOfEggs - 2; // New number of eggs taken 2 eggs per basket

        System.out.println(numOfEggs_new + " eggs per basket and"); // Display new number of eggs
        System.out.println(numOfBaskets + " baskets.");

        int totalNumOfEggs_new = numOfEggs_new * numOfBaskets; // Computation for the new total number of eggs

        System.out.println("The new total number of eggs is " + totalNumOfEggs_new); // Display new total number of eggs
        System.out.println();
        System.out.println("Thank you!");
    }
}