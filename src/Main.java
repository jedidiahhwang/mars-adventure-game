import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("The game is about to start...");
        System.out.println("Booting up...");
        try {
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Ready");
        System.out.println("Hi there. What is your name?");
        String userInputName = scanner.nextLine();
        System.out.println(String.format("Hello, %s -- Welcome to the Mars Adventure Game.", userInputName));
        System.out.println("Yesterday, you received a call from your good friend at NASA.");
        System.out.println("They need someone to go to Mars this weekend, and you've been chosen.");

        System.out.println("Are you excited? Type Y or N");

        while(true) {
            String userReply = scanner.nextLine();
            userReply = userReply.toUpperCase();
            if(userReply.equals("Y")) {
                System.out.println("I knew you'd say that. It's so cool that you're going to Mars!");
                break;
            } else if(userReply.equals("N")) {
                System.out.println("Okay. Goodbye.");
                return;
            } else {
                System.out.println("Please answer Y or N.");
            }
        }

        System.out.println("It's time to pack for your trip to Mars.\nHow many suitcases do you plan to bring?");
        int numSuitcases;
        while(true) {
            try {
                numSuitcases = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                System.out.println("Please input a number.");
                continue;
            }

            if(numSuitcases > 2 || numSuitcases < 0) {
                System.out.println("Please try to fit your stuff in 2 suitcases.");
            } else {
                break;
            }
        }

        System.out.println("You're allowed to bring one companion animal with you.\nWhat kind of animal would you like to bring?");
        scanner.nextLine();
        String companion = scanner.nextLine();

        System.out.println("What is your companion's name?");
        String companionName = scanner.nextLine();

        System.out.println(String.format("Cool, so you're bringing %s the %s", companionName, companion));

        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("NASA has an interior design team offering to outfit your space ship.\nYou have a couple of options for the interior decor of your ship.\n");

        System.out.println("Your options are:\n A Sleek, modern minimalism\n B Retro/vintage space age\n C SF Hippie chic\n");
        System.out.println("Which decor would you like? Choose A, B, or C.");
        String selection;
        String decor;
        while(true) {
            selection = scanner.nextLine();
            selection = selection.toUpperCase();
            switch(selection) {
                case "A":
                    decor = "sleek, modern, minimalistic";
                    break;
                case "B":
                    decor = "retro, vintage, space age";
                    break;
                case "C":
                    decor = "SF hippie chic";
                    break;
                default:
                    System.out.println("Please select A, B, or C.");
                    continue;
            }
            break;
        }

        try {
            System.out.println("Good choice.");
                Thread.sleep(1000);
            System.out.println("I can see it now:");
                Thread.sleep(1000);
            System.out.println(String.format("%s and %s surfing the celestial abyss...\nin a %s", userInputName, companionName, decor));
                Thread.sleep(1000);
            System.out.println(String.format("%s -- the day is here!", userInputName));
                Thread.sleep(1000);
            System.out.println(String.format("You crawl into the spaceship with %s", companionName));
                Thread.sleep(1000);
            System.out.println("Brace for take off!");
                Thread.sleep(1000);
            System.out.println("5...");
                Thread.sleep(1000);
            System.out.println("4...");
                Thread.sleep(1000);
            System.out.println("3...");
                Thread.sleep(1000);
            System.out.println("2...");
                Thread.sleep(1000);
            System.out.println("1...");
                Thread.sleep(1000);
            System.out.println("* LIFTOFF *");
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}
