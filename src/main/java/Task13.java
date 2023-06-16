//Take any number as input and print the reverse of the number
//        input: 12345
//        output: 54321
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = sc.nextInt();
        while(input != 0){
            int remainder = input%10;
            System.out.print(remainder);
            input = input/10;
        }
    }
}
