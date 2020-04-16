import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class MathTool {

    public static boolean isNum(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static int enterNumAndOnlyNum(String message) {
        var in = new Scanner(System.in);
        var strNum = in.nextLine();
        if (!isNum(strNum)) {
            while (!isNum(strNum)) {
                System.out.println("Incorrect Input, try again");
                System.out.println(message);
                strNum = in.nextLine();
            }
            return parseInt(strNum);
        } else {
            return parseInt(strNum);
        }
    }

    public static String enterStrAndOnlyStr(String message, String option1, String option2) {
        var in = new Scanner(System.in);
        var str = in.nextLine();
        if (!str.equals(option1) && !str.equals(option2)) {
            while (!str.equals(option1) && !str.equals(option2)) {
                System.out.println("Incorrect Input, try again");
                System.out.println(message);
                str = in.nextLine();
            }
        }
        return str;
    }


    public static void main(String[] args) {
        System.out.println("Welcome! This program adds or subtracts two numbers. Enjoy!");
        boolean done = true;
        while(done) {
            var in = new Scanner(System.in);

            //get first number
            System.out.println("Enter a number: ");
            int num1 = enterNumAndOnlyNum("Enter a number: ");

            //get second number
            System.out.println("Enter a second number: ");
            int num2 = enterNumAndOnlyNum("Enter a second number: ");

            //determine math operation
            System.out.println("Enter an operation (+ or -): ");
            var operation = enterStrAndOnlyStr("Enter an operation (+ or -): ", "+", "-");


            //determine sum or difference
            if (operation.equals("+")) {
                var sum = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 +" is: " + sum);

                //Check if the user is done
                System.out.println("Are you done? (y or n) ");
                var finished = enterStrAndOnlyStr("Are you done? (y or n) ", "y", "n");
                if (finished.equals("y")) {
                    done = false;
                }
            } else {
                var difference = num1 - num2;
                System.out.println("The difference between " + num1 + " and " + num2 +" is: " + difference);

                //Check if the user is done
                System.out.println("Are you done? (y or n) ");
                var finished = enterStrAndOnlyStr("Are you done? (y or n) ", "y", "n");
                if (finished.equals("y")) {
                    done = false;
                }
            }
        }
    }
}
