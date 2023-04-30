package Word_Game.src.Word_Game.src;
import java.util.*;
public class SptGame {
    static String[] option = {"stone", "paper", "scissor"};

    static String gen_word() {
        Random random = new Random();
        int index = random.nextInt(option.length);
        return option[index];
    }

    static void guessOption() {
        Scanner sc = new Scanner(System.in);

        int usercnt=0;
        int comcnt=0;
        int i=1;
        System.out.println("You have 3 chances:");
        while (i!=4) {
            String ans = gen_word();
            System.out.println("enter your pick "+i);
            String guess = sc.nextLine();

            System.out.println("Computer's Pick: "+ans);
            if (guess.equalsIgnoreCase("stone") && ans.equalsIgnoreCase("paper")) {

                comcnt++;
            } else if (guess.equalsIgnoreCase("paper") && ans.equalsIgnoreCase("scissor")) {

                comcnt++;
            } else if (guess.equalsIgnoreCase("stone") && ans.equalsIgnoreCase("scissor")) {

                comcnt++;
            } else if (guess.equalsIgnoreCase("paper") && ans.equalsIgnoreCase("stone")) {

                usercnt++;
            } else if (guess.equalsIgnoreCase("scissor") && ans.equalsIgnoreCase("paper")) {

                usercnt++;
            } else if (guess.equalsIgnoreCase("scissor") && ans.equalsIgnoreCase("stone")) {

                comcnt++;
            }
            i++;
        }
        if(usercnt>comcnt) {
            System.out.println("you win!");
        } else if (usercnt==comcnt) {
            System.out.println("Draw");
        } else System.out.println("computer win");


    }
}
