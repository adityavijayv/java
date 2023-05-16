import java.util.ArrayList;
import java.util.Scanner;

public class library {
    public static void main(String[] args) {
        int a,issue,returnedi;
        Scanner sc = new Scanner(System.in);
        ArrayList <String> returned = new ArrayList<>();
        ArrayList <String> books = new ArrayList<>();
        books.add("mathematics");
        books.add("chemistry");
        books.add("physics");
        books.add("biology");
        books.add("zology");
        books.add("economics");
        books.add("accounts");

        while (true){
        System.out.println("Welcome");
        System.out.println("Books:-");
        for(int i = 0 ; i< books.size(); i++ ){
            System.out.println((i+1)+". "+books.get(i));
        }
        System.out.println("Enter your choice");
            System.out.println("1.Issue \n2.Return \n3.Exit");
        a = sc.nextInt();
        if(a==1){
            System.out.println("books are:");
            for(int i = 0 ; i< books.size(); i++ ){
                System.out.println((i+1)+". "+books.get(i));
            }
            System.out.println("Enter book no. to be issued");
            issue = sc.nextInt();
            System.out.println("Book issued:"+books.get(issue-1));
            returned.add(books.get(issue-1));
            books.remove(issue-1);
        }
        else if(a == 2){
            System.out.println("return books:");
            for(int i = 0 ; i< returned.size(); i++ ){
                System.out.println((i+1)+". "+returned.get(i));
            }
            System.out.println("Enter no of book to be returned:");
            returnedi = sc.nextInt();
            System.out.println("Book returned:"+returned.get(returnedi-1));
            books.add(returned.get(returnedi-1));
            returned.remove(returnedi-1);
        }else if(a ==3){
            break;
        }}

    }
}
