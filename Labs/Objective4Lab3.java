import java.util.Scanner;
import java.time.LocalDate;

public class Objective4Lab3{
    public static void main(String[] args){
        int birthYear, age, currentYear;

        birthYear = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("how old are you?");
        int inputAge = input.nextInt();

        currentYear = LocalDate.now().getYear();
        birthYear = currentYear - inputAge;

        System.out.println("You were born in " + birthYear);
        input.close();

        scanner.close();
    }
}
