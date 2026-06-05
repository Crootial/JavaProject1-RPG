
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the openworld rpg");
        classSelect();

    }
    public static void classSelect() {
        Scanner userInput = new Scanner(System.in);
        try {
            System.out.println("Choose your class");
            System.out.println("1: Warrior\n2: Ranger\n3: Mage");
            System.out.print("Your Input: ");
            int userChoice = userInput.nextInt();

            if (userChoice == 1){
                System.out.println("You Have chosen Warrior. Are you sure?\n1: Yes 2: No");
                int decision = userInput.nextInt();
                if (decision == 1) {
                    System.out.println("Welcome to the world!");
                    chapterOne();
                } else {
                    System.out.println("Please try Again.");
                    classSelect();
                }

            } else if ( userChoice == 2) {
                System.out.println("You Have chosen Ranger. Are you sure?\n1: Yes 2: No");
                int decision = userInput.nextInt();
                if (decision == 1) {
                    System.out.println("Welcome to the world!");
                    chapterOne();
                } else {
                    System.out.println("Please try Again.");
                    classSelect();
                }
            } else if (userChoice == 3) {
                System.out.println("You Have chosen Mage. Are you sure?\n1: Yes 2: No");
                int decision = userInput.nextInt();
                if (decision == 1) {
                    System.out.println("Welcome to the world!");
                    chapterOne();
                } else {
                    System.out.println("Please try Again.");
                    classSelect();
                }
            } else {
                System.out.println("Please try again.");
                classSelect();
            }
        } catch (InputMismatchException e) { // Catch specific exception for invalid input
            System.out.println("Invalid input. Please enter a number.");
            userInput.next(); // Consume the invalid input
            classSelect();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred. Please try again.");
            classSelect();
        }
    }

    public static void chapterOne() {
        Scanner userInput = new Scanner(System.in);
        int input = -1; // Declare input outside the loop and initialize it

        System.out.println("You wake up from the shore. You are cold. You are wet. You are lost.\n" +
                           "You check your surroundings and see a shipwreck in the distance. To the left of it, you see a house on a dock.\n" +
                            "What is your next move?");

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("1: Head towards the shipwreck.\n" +
                        "2: Head towards the house.\n" +
                        "Your Input: ");
                input = userInput.nextInt();
                validInput = true; // Input was valid, exit loop
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter 1 or 2.");
                userInput.next(); // Consume the invalid input
            } catch (Exception e) {
                System.out.println("An unexpected error occurred. Please try again.");
                userInput.next(); // Consume any remaining invalid input
            }
        }

        switch(input) {
            case 1: // Shipwreck option
                System.out.println("You decided on headings towards the shipwreck. With night setting, you think that it'll be a good place to camp for the night. ");
                break;
            case 2: // House option
                System.out.println("You head towards the house.");
                break;
            default:
                System.out.println("That's not a valid choice. Please try again.");
                chapterOne();
                break;
        }
    }


    public static void monsterEncounter() {

        int min = 1, max = 100;

        // Monster Value for spawn
        int monster_Ogre = 1;
        int monster_Slime = 2;
        int monster_Direwolf = 3;
        int monster_Skeleton = 4;
        int monster_Goblin = 5;
        int monster_MasterJerry = 100;
    }

    }