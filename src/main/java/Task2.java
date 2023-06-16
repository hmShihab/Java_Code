//Suppose, a=10 and b=20. Now swap the value without a temp variable. Output: a=20, b=10
public class Task2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping: "+ "a = "+a+", b = "+b );
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping: "+ "a = "+a+", b = "+b );
    }
}
