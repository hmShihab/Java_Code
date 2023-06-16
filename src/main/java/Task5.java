//Write a program that will find your key is found in the given array using linear search method
//        numbers=[1,6,9,3,5,4,7]
//        key=5
public class Task5 {
    public static void main(String[] args) {
        int numbers[] = {1, 6, 9, 3, 5, 4, 7}; //{1,3,4,5,6,7,9}
        int key = 5;
        int findKey = linearSearch(numbers, key);
        System.out.println("Your key " + numbers[findKey] + " is found at index " + findKey);

    }
    static int linearSearch(int[] number, int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return 0;
    }
}

