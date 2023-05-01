package Hangman.Game_Logic;
/* Project_Name Hangman_Game
   Project_By Tushar, Aditya & Himanshu                           */
import java.util.*;
public class HangmanLogic {

    static String[] animals={"dog","horse","rabbit","cat","deer","hippopotamus","monkey","lion","tiger","gorilla","giraffe","wolf","kangaroo","alligator","eel","jellyfish"};
    static int chances=1;

    static void position(int size,char[] ansArray)
    {   chances++;
        for(int i=0;i<size;i++)
        {
            // this loop is used for showing the position of input you have entered
            if(ansArray[i]!=0)
            {
                System.out.print(ansArray[i]+"  ");
            }
            else{
                System.out.print("_ " + "  ");

            }

        }
        System.out.print("      Chances left "+chances+"/"+(size+5) );
    }

    static int input(int size,char[] wordarray,char[] ansArray,int check){
        int k=1;                             //this method is used for taking input
        Scanner sc=new Scanner(System.in);
        while(k!=size+5)
        {


            System.out.print("Enter your guess :- ");
            char ans=sc.next().charAt(0);
            System.out.println("                                                                                            ");

            for(int i=0;i<size;i++)
            {
                if(wordarray[i]==ans )
                {
                    ansArray[i]=ans;    //this is used for inserting input in ans1 array
                    check++;


                }

            }
            position(size,ansArray);     //this method is used for giving the positions of the characters after input

            System.out.print("\n");

            if(check==size)
            {
                System.out.println("You won the game!!!! :-)");
                break;
            }
            k++;
        }
        return check;
    }
    static int genNum(){
        Random random=new Random();
        int genNum=random.nextInt(animals.length);  //this method is used for generating the random num for indexing of string
        return genNum;
    }

    static String getSt(){                       //with the random number return the rendom string
        String st=animals[genNum()];
        return st;
    }

    static void intro(int size)                  //introduction of the hangman game
    {
        System.out.println("                                                                          ");
        System.out.println("Guess the animal name !!! ---->");
        System.out.println("This is created by Aditya Vj");
        for(int i=0;i<size;i++)
        {
            System.out.print("_ "+"  ");
        }
        System.out.println("");
    }
    protected static void result(){

        System.out.println("\n  WELCOME TO HANGMAN WORLD  ");
        String word=getSt();        // calling the random string
        char[] ansArray;
        ansArray=new char[word.length()];

        int size= word.length();
        char [] wordarray=word.toCharArray();
        intro(size);
        int check=0;
        check=input(size,wordarray,ansArray,check);
        if (check!=size)
        {
            System.out.println("Oh Nooo!!! You Lost, Better luck Next Time :-(");
        }


    }

}
