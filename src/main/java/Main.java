import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        boolean readyToExit = false;
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        while(!readyToExit) {
            String line = scanner.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(line);
            String command = tokenizer.nextToken();

            int arg1 = 0;
            if (tokenizer.hasMoreTokens()) {
                arg1 = Integer.parseInt(tokenizer.nextToken());
            }

            int arg2 = 0;
            if(tokenizer.hasMoreTokens()) {
                arg2 = Integer.parseInt(tokenizer.nextToken());
            }

            switch(command) {
                case "exit":
                    readyToExit = true;
                    break;
                case "add":
                    System.out.println(calc.add(arg1, arg2));
                    break;
                case "subtract":
                    System.out.println(calc.subtract(arg1, arg2));
                    break;
                case "multiply":
                    System.out.println(calc.multiply(arg1, arg2));
                    break;
                case "divide":
                    System.out.println(calc.divide(arg1, arg2));
                    break;
                case "fibonacci":
                    System.out.println(calc.fibonacciNumberFinder(arg1));
                    break;
                case "binary":
                    System.out.println(calc.intToBinaryNumber(arg1));
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}
