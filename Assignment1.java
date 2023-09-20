// Nicolas Salinetti

import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {

    //initialize variables
    String input = "x";
    double tempF;
    double tempC;
    int randNum;

    //initialize scanner
    Scanner scan = new Scanner(System.in);

    //print initials
    System.out.println(
        "\nNNN   NNN    SSSSSSSS"
      + "\nNNNN  NNN   SSSS"
      + "\nNNNNN NNN    SSSS"
      + "\nNNN NNNNN       SSSS"
      + "\nNNN  NNNN        SSSS"
      + "\nNNN   NNN   SSSSSSSS"
    );

    //request 5-character input from user
    for(int i = 1; i == 1;){
      System.out.println("Please enter a 5-character string:");
      input = scan.nextLine();
      int length = input.length();
      //check length of string
      if(length > 5 || length < 5){
        System.out.println("This string is not 5 characters");
      }
      else{
        i = 0;
      }
    }

    //request temperature input
    System.out.println("Please enter a number in Fahrenheit:");
    tempF = scan.nextDouble();
    System.out.println("Random number generated. Continuing...");

    //convert temperature from farenheit to celsius
    tempC = ((5 * (tempF - 32.0)) / 9);

    //generate random number between 32 and 16384
    randNum = (int)(Math.random() * 16384) + 32;

    //seperate string into individual characters
    String letter2 = input.substring(1,2);
    String letter3 = input.substring(2,3);
    String letter4 = input.substring(3,4);

    //output results in proper order
    System.out.println("Your new string is " + tempC + letter4 + letter3 + letter2 + randNum);
    scan.close();
  }
}
