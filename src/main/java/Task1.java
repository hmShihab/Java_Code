//Suppose, a=10 and b=20. Now swap the value using a temp variable. Output: a=20, b=10
public class Task1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
        System.out.println("Before Swapping: "+ "a = "+a+", b = "+b );
        temp = b;
        b = a;
        a = temp;
        System.out.println("After Swapping: "+ "a = "+a+", b = "+b );
    }
}
