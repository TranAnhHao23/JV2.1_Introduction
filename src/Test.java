import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số");
        int number = sc.nextInt();

        int hundred,tens,ones;

        hundred = number/100;
        tens = (number - hundred*100)/10;
        ones = number%10;

        System.out.println(hundred);
        System.out.println(tens);
        System.out.println(ones);

    }
}
