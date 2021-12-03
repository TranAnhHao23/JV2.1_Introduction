import java.util.Scanner;

public class MoneyConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double usd,vnd;

        System.out.println("Input your money value (USD): ");
        usd = sc.nextDouble();
        vnd = usd*23000;
        System.out.println("Exchange USD to VND = "+vnd);
    }
}
