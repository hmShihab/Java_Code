//Write a program that will breakdown the amount and count notes for any given amount. Here is the notes in the given array:
//        notes=[1000,500,200,100,50,20,10,5,2,1]
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User input : ");
        int input = sc.nextInt();
        int count = 0;
        int notes[] = {1000,500,200,100,50,20,10,5,2,1};
        for (int i = 0; i < notes.length; i++){
            count = input/notes[i];
            if(count != 0) {
                System.out.println(notes[i] + " " + count);
                input = input % notes[i];
            }
        }
    }
}
