import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
//        System.out.println("HelloWorld");
        Scanner sc = new Scanner(System.in);

        System.out.print("Input your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
