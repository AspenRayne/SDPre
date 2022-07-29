import java.util.Scanner;

public class Objective9Lab3{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;
    boolean openMenu = true;

    while(openMenu) {
      printMenu();
      selection = scanner.nextInt();
      openMenu = menuSelection(selection);
  }
    scanner.close();
}

public static boolean menuSelection(int selection) {
  switch (selection) {
    case 1:
    System.out.println("Hello World");
    break;
    case 2:
    System.out.println("Apples, Bananas, Coconuts");
    break;
    case 3:
    System.out.println("Goodbye");
    return false;
  }
  return true;
}
public static void printMenu() {
    System.out.println("____Menu____");
    System.out.println("1: Say Hello");
    System.out.println("2: List my favorite foods");
    System.out.println("3: Exit");
  }
}
