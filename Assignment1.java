// Import libraries here
// Nicolas Salinetti

import java.util.Scanner;
import java.util.Random;

public class Assignment1 {
  public static void main(String[] args) {
    // Add your code here

    String input;
    double tempF;
    double tempC;
    int randNum;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    System.out.println("NNN   NNN    SSSSSSSS");
    System.out.println("NNNN  NNN   SSSS");
    System.out.println("NNNNN NNN    SSSS");
    System.out.println("NNN NNNNN       SSSS");
    System.out.println("NNN  NNNN        SSSS");
    System.out.println("NNN   NNN   SSSSSSSS");

    System.out.println("Please enter a 5-character string:");
    input = scan.nextLine();
    System.out.println("Please enter a number in Fahrenheit:");
    tempF = scan.nextDouble();
    System.out.println("Random number generated. Continuing...");

    tempC = ((5 * (tempF - 32.0)) / 9);

    
  }
}
