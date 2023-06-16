//Suppose a=15.5276. print the value upto 2 decimal point. Output: a=15.52
public class Task3 {
    public static void main(String[] args) {
        double a = 15.5276;
        double b = a * 100;
        int c = (int) b;
        double d = (double)c/ 100;
        System.out.println("a = "+d);
    }
}
