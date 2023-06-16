//Write a program that will find your key is found in the given array using binary search method
//numbers=[1,6,9,3,5,4,7]
import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
        int numbers[] = {1, 6, 9, 3, 5, 4, 7}; //{1,3,4,5,6,7,9}
        int key = 5;
        Arrays.sort(numbers);
        int foundKey = Arrays.binarySearch(numbers, key);
        for (int j = 0; j < numbers.length; j++) {

            System.out.print(numbers[j] + " , ");
        }
        if(numbers[foundKey] == key) {
            System.out.println("Your key "+numbers[foundKey]+ " is found at index "+ foundKey );
        }
        else {
            System.out.println("Your key "+numbers[foundKey]+ " is not in the array ");
        }
    }
}
