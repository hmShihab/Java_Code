//Write a program that will give following output:
//        12345
//        2345
//        345
//        45
//        5
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
