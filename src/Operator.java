import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        System.out.println("The area of rectangle = "+(width*height));
    }
}
