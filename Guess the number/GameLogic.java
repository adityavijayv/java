package JavaClasses.src;

import java.util.*;
public class GameLogic {
    public GameLogic() {
    }

    static int gen_number() {
        Random random = new Random();
        int num = random.nextInt(50);
        return num;
    }

    static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        int gen = gen_number();

        int i;
        for(i = 0; i < 5; ++i) {
            System.out.println("You have " + (5 - i) + " chances left.");
            System.out.println("Enter your input number: ");
            int guess = sc.nextInt();
            if (guess == gen) {
                System.out.println("You guessed it correctly, YOU WON!!");
                break;
            }

            if (guess > gen) {
                System.out.println("You entered a bigger number");
                System.out.println("         ");
            } else if (guess < gen) {
                System.out.println("You entered a smaller number");
                System.out.println("           ");
            }
        }

        if (i == 5) {
            System.out.println("Your Chances are over,YOU FAILED!!");
            System.out.println("       ");
            System.out.println("The correct no. is:" + gen);
        }

    }
}