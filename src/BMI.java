import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
//        System.out.println("HelloWorld");
        Scanner sc = new Scanner(System.in);
        System.out.println("Check your BMI index");
        System.out.println("Input your weight (kg): ");
        double weight = sc.nextDouble();
        System.out.println("Input your height (m): ");
        double height = sc.nextDouble();
        double yourBMI;
        yourBMI = weight / (height*height);

        if (yourBMI<18.5){
            System.out.println("Underweight");
        }else if (yourBMI<25){
            System.out.println("Normal");
        }else if (yourBMI<30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
