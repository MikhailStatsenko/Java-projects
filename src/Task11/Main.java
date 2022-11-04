package Task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the variable: ");
        double x = in.nextDouble();
        in.close();

        // x^2 - 2x + 1
        System.out.println(
        new Add(new Subtract(new Multiply(new Variable("x"), new Variable("x")), new Multiply(new Const(2), new Variable("X"))), new Const(1)).evaluate(x));
    }
}
