//Find out the duplicate numbers in the given array and in which position they are found.
//        numbers=[1,2,3,1,2,4,5,6,4]
//
//        Output:
//        Duplicate value: 1 at index 3
//        Duplicate value: 2 at index 4
//        Duplicate value: 4 at index 8
public class Task14 {
    public static void main(String[] args) {
        int array [] = {1,2,3,1,2,4,5,6,4};
        findDuplicate(array);
    }
    static void findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int x = i + 1; x < arr.length; x++) {
                if (arr[i] == arr[x]) {
                    System.out.println("Duplicate value: " + arr[i] + " at index " + x);
                }
            }
        }
    }
}

