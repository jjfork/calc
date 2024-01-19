package pl.julianoo;

import pl.julianoo.Fraction;

import java.util.Scanner;

public class lepszykalkulator {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("(IF USE FRACTIONS IN THIS SYSTEM X / Y. SPACEBAR IS NESSESARY) Give number in first line, then +.-.*,/ then in next line next number");
        String runAgain;
        do {

            var numerator = scanner.nextInt();
            scanner.next();
            var denominator = scanner.nextInt();
            scanner.nextLine();
            var x = new Fraction(numerator, denominator);

            var operation = scanner.nextLine();

            numerator = scanner.nextInt();
            scanner.next();
            denominator = scanner.nextInt();
            scanner.nextLine();
            var y = new Fraction(numerator, denominator);

            Fraction result;
            if (operation.equals("+")) {
                result = x.add(y);
            } else if (operation.equals("-")) {
                result = x.subtract(y);
            } else if (operation.equals("*")) {
                result = x.multiply(y);
            } else if (operation.equals("/")) {
                result = x.divide(y);
            } else {
                System.out.println("why");
                result = new Fraction(0);
            }
            System.out.println("Result: " + result.getFractionAsDecimal());

            System.out.println("Your want more? Press y or n.");
            runAgain = scanner.nextLine();
        } while (runAgain.equals("y"));
        scanner.close();
    }
}
