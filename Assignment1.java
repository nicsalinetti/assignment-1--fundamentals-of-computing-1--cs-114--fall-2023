// Nicolas Salinetti

import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {

    String input = "x";
    double tempF;
    double tempC;
    int randNum;

    Scanner scan = new Scanner(System.in);

    System.out.println(
        "\nNNN   NNN    SSSSSSSS"
      + "\nNNNN  NNN   SSSS"
      + "\nNNNNN NNN    SSSS"
      + "\nNNN NNNNN       SSSS"
      + "\nNNN  NNNN        SSSS"
      + "\nNNN   NNN   SSSSSSSS"
    );

    for(int i = 1; i == 1;){
      System.out.println("Please enter a 5-character string:");
      input = scan.nextLine();
      int length = input.length();
      if(length > 5 || length < 5){
        i = 1;
      }
      else{
        i = 0;
      }
    }

    System.out.println("Please enter a number in Fahrenheit:");
    tempF = scan.nextDouble();
    System.out.println("Random number generated. Continuing...");

    tempC = ((5 * (tempF - 32.0)) / 9);

    randNum = (int)(Math.random() * 16384) + 32;

    String letter2 = input.substring(1,2);
    String letter3 = input.substring(2,3);
    String letter4 = input.substring(3,4);

    System.out.println("Your new string is " + tempC + letter4 + letter3 + letter2 + randNum);
    scan.close();
  }
}
