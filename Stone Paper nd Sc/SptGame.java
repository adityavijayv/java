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
        String ans = gen_word();
        int usercnt=0;
        int comcnt=0;
        int i=3;
        while (i!=0) {
            System.out.println("enter your option");
            String guess = sc.nextLine();
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

                usercnt++;
            }
            i--;
        }
        if(usercnt>comcnt) {
            System.out.println("you win!");
        }
        else System.out.println("computer win");


    }
}
