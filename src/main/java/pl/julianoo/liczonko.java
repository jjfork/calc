package pl.julianoo;

import java.util.Objects;
import java.util.Scanner;

public class liczonko {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("lets calc, use number then +,-,*,/,% and next number");

        var x = 2;
        var operation = "%";
        var y = 5;
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

    }

}
