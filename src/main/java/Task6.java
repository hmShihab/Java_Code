//Generate random 10 integer numbers in an array and print out all the numbers from array and also print the max and min number from the array
import java.util.Random;
public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
//        int rand  = random.nextInt(50);
        int arr[]= new int[10];
        for (int j = 0; j < arr.length; j++) {
            int rand  = random.nextInt(50);
            arr[j] = rand;
            System.out.print(arr[j] + " , ");
        }
        int max = findMax(arr);
        int min = findMin(arr);
        System.out.println("\nMaximum value : " + max);
        System.out.println("Minimum value : " + min);

    }

    static int findMax( int[] array){
        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        return max;
    }

    static int findMin( int[] array){
        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        return min;
    }


}
