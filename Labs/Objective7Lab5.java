import java.util.Scanner;

public class Objective7Lab5{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int selection;
    boolean openMenu = true;

    while (openMenu) {
      System.out.println("____Menu____");
      System.out.println("1: Say Hello");
      System.out.println("2: List my favoite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();

      switch (selection) {
        case 1:
        System.out.println("Hello World");
        break;
        case 2:
        System.out.println("Apples, Bananas, Coconuts");
        break;
        case 3:
        System.out.println("Goodbye");
        openMenu = false;
        break;
      }
    }
    scanner.close();
  }
}
