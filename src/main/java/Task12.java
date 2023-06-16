//Write a program that will shuffle (values will randomly change their position) from the given array
//
//        numbers=[1,2,3,4,5,6,7,8,9,0]
//
//        random output: 3 5 0 1 7 9 6 4 2 8
public class Task12 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,0};
//        int random = (int) Math.random();
        for(int i = 0; i < array.length; i++){
            int random = (int) (Math.random() * array.length);
            int temp =  array[i];
            array[i] = array[random];
            array[random] = temp;
            System.out.print(array[i] + " , ");
        }

    }
}
