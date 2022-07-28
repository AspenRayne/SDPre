import java.util.Scanner;

public class Objective4Lab2{
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0;
        double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

        System.out.println("Please enter the first whole number you would like to add.");
        int inputNum1 = keyboard.nextInt();

        System.out.println("Please enter the second whole number you would like to add.");
        int inputNum2 = keyboard.nextInt();

        System.out.println("Please enter the third whole number you would like to add.");
        int inputNum3 = keyboard.nextInt();

        System.out.println("Please enter the first decimal number you would like to add.");
        double inputDub1 = keyboard.nextDouble();

        System.out.println("Please ever the second decimal number you would like to add.");
        double inputDub2 = keyboard.nextDouble();

        System.out.println("Please enter the third decimal number you would like to add.");
        double inputDub3 = keyboard.nextDouble();

        int sum = inputNum1 + inputNum2 + inputNum3;
        System.out.println("The sum of " + inputNum1 + " + " + inputNum2 + " + " + inputNum3 + " = " + sum);

        double product = inputDub1 + inputDub2 + inputDub3;
        System.out.println("The sum of " + inputDub1 + " + " + inputDub2 + " + " + inputDub3 + " = " + product);

        scanner.close();
    }
}
