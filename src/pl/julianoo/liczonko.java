package pl.julianoo;

import java.util.Objects;
import java.util.Scanner;

public class liczonko {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("lets calc, use number then +,-,*,/,% and next number");
        String runAgain;
        do {
            var x = scanner.nextDouble();
            scanner.nextLine();
            var operation = scanner.nextLine();
            var y = scanner.nextDouble();
            scanner.nextLine();
            double result;
            switch (operation) {
                case "+" -> result = x + y;
                case "-" -> result = x - y;
                case "*" -> result = x * y;
                case "/" -> result = x / y;
                case "%" -> result = x % y;
                default -> {
                    System.out.println("stop doing that");
                    result = 0;
                }
            }
            System.out.println("thats:" + result);
            System.out.println("you want more? press yes or no");
            runAgain = scanner.nextLine();
        } while (Objects.equals(runAgain, "yes"));
        scanner.close();
    }

}
