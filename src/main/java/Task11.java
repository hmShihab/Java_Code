//Find out the second largest element of the given array
//        numbers=[5,3,9,7,4,1,8]
import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int numbers[] = {5,3,9,7,4,1,8};
        Arrays.sort(numbers);
        int max = findMax(numbers);

        System.out.println(max);

    }

    static int findMax(int[] number) {
        int max = number[0];
        for (int j = 0; j < number.length; j++) {
            if (number[j] > max) {
                max = number[j-1];
            }
        }
        return max;
    }

}
