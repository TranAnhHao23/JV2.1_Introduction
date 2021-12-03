import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
//        System.out.println("HelloWorld");
        Scanner sc = new Scanner(System.in);
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        System.out.println("Input number a: ");
        double a = sc.nextDouble();
        System.out.println("Input number b: ");
        double b = sc.nextDouble();
        if (a != 0) {
            System.out.println("The equation = " + (-b / a));
        } else if (b == 0) {
            System.out.println("The equation hass infinite results");
        } else {
            System.out.println("The equation has no result");
        }
    }
}
