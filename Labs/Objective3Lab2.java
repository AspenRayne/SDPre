public class Objective3Lab2{
    public static void main(String[] args){
        double num1 = 10, num2 = 8; 
        double sum = (num1 * num1) + (num2 * num2);
        double result = Math.sqrt(sum);

        System.out.println("The hypotenuse of a triangle with sides " + num1 + " and " + num2 + " is " + result);
    }
}