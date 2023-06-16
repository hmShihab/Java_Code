//Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be same.
//        Input: Civic
//        Output: true
//        Input: One
//        Output: false
import java.util.Scanner;
public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0;
        int j = str.length()-1;
        int flag = 0;
        while(i < j && flag ==0) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = 1;
                break;
            }
            i = i + 1;
            j = j - 1;
        }
            if(flag == 0){
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }
    }

//    static String reverseString(String str){
//        char ch[] = str.toCharArray();
//        String rev = "";
//        for(int i = ch.length-1; i >= 0; i--){
//            rev+=ch[i];
//        }
//        return rev;
//    }

