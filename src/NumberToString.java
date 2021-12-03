import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
//        System.out.println("HelloWorld");
        Scanner sc = new Scanner(System.in);

        int number;
        int tens, ones, hundred;
        String numberString = "";
        System.out.print("Input your number: ");
        number = sc.nextInt();

        hundred = number/100;
        tens = (number - hundred*100)/10;
        ones = number%10;
        if (number <= 20) {
            switch (number) {
                case 1:
                    numberString = "one";
                    break;
                case 2:
                    numberString = "two";
                    break;
                case 3:
                    numberString = "three";
                    break;
                case 4:
                    numberString = "four";
                    break;
                case 5:
                    numberString = "five";
                    break;
                case 6:
                    numberString = "six";
                    break;
                case 7:
                    numberString = "seven";
                    break;
                case 8:
                    numberString = "eight";
                    break;
                case 9:
                    numberString = "nine";
                    break;
                case 10:
                    numberString = "ten";
                    break;
                case 11:
                    numberString = "eleven";
                    break;
                case 12:
                    numberString = "twelve";
                    break;
                case 13:
                    numberString = "thirteen";
                    break;
                case 14:
                    numberString = "fourteen";
                    break;
                case 15:
                    numberString = "fifteen";
                    break;
                case 16:
                    numberString = "sixteen";
                    break;
                case 17:
                    numberString = "seventeen";
                    break;
                case 18:
                    numberString = "eighteen";
                    break;
                case 19:
                    numberString = "nineteen";
                    break;
                case 20:
                    numberString = "twenty";
                    break;
            }
        } else if (number < 1000) {
            switch (hundred){
                case 1:
                    numberString += "one hundred and ";
                    break;
                case 2:
                    numberString += "two hundred and ";
                    break;
                case 3:
                    numberString += "three hundred and ";
                    break;
                case 4:
                    numberString += "four hundred and ";
                    break;
                case 5:
                    numberString += "five hundred and ";
                    break;
                case 6:
                    numberString += "six hundred and ";
                    break;
                case 7:
                    numberString += "seven hundred and ";
                    break;
                case 8:
                    numberString += "eight hundred and ";
                    break;
                case 9:
                    numberString += "nine hundred and ";
                    break;
            }
            switch (tens) {
                case 2:
                    numberString += "twenty ";
                    break;
                case 3:
                    numberString += "thirty ";
                    break;
                case 4:
                    numberString += "forty ";
                    break;
                case 5:
                    numberString += "fifty ";
                    break;
                case 6:
                    numberString += "sixty ";
                    break;
                case 7:
                    numberString += "seventy ";
                    break;
                case 8:
                    numberString += "eighty ";
                    break;
                case 9:
                    numberString += "ninety ";
                    break;
            }
            switch (ones) {
                case 1:
                    numberString += "one";
                    break;
                case 2:
                    numberString += "two";
                    break;
                case 3:
                    numberString += "three";
                    break;
                case 4:
                    numberString += "four";
                    break;
                case 5:
                    numberString += "five";
                    break;
                case 6:
                    numberString += "six";
                    break;
                case 7:
                    numberString += "seven";
                    break;
                case 8:
                    numberString += "eight";
                    break;
                case 9:
                    numberString += "nine";
                    break;
            }
        }
        System.out.println(numberString);
    }
}
