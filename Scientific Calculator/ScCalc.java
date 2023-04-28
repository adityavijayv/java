package JavaClasses.src;

import java.util.Scanner;

public class ScCalc {
    public static void main(String[] args) {

        char operation;
        Double result;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operation: Sin(a),Cos(b), Tan(c)");
        operation = input.next().charAt(0);

        double number=0;
        if(operation >= 'a' && operation <= 'c') {
            System.out.println("Enter degrees");
            number = input.nextDouble();
            number = Math.toRadians(number);
        }


        switch (operation) {
            case 'a' -> {
                result = Math.sin(number);
                System.out.println("Sin of given degrees is " + result);
                break;
            }
            case 'b' -> {
                result = Math.cos(number);
                System.out.println("Cos of given degrees is " + result);
                break;
            }
            case 'c' -> {
                result = Math.tan(number);
                System.out.println("Tan of given degrees is " + result);
                break;
            }
            default ->
            { System.out.println("Invalid operation!");}
        }

    }
}
