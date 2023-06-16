//Write a program that will take integer numbers as user input continuously and print the sum of numbers until user input q from the keyboard. When user input q, program will be quit. If user inputs another character, then the program will ask to input the number again.
import java.util.Scanner;
public class Task18 {
    public static void main(String[] args) {
     int sum = 0;

     Scanner sc = new Scanner(System.in);
     while(sc.hasNextInt()){
         int input = sc.nextInt();
         sum = sum + input;

     }
        System.out.print("Your sum is "+sum);
    }
}
