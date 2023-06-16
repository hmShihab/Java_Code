//A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount? [Extract the digits from the paragraph and calculate the price]

public class Task20 {
    public static void main(String[] args) {
        String str = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount? [Extract the digits from the paragraph and calculate the price";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        System.out.println(str);
        String[] arr= (str.split(" "));
        double laptop_price =  Double.parseDouble(arr[1]);
        double mouse_price =  Double.parseDouble(arr[2]);
        double discount = (laptop_price+mouse_price)*Double.parseDouble(arr[4])/100;
        double total_price =  laptop_price + mouse_price - discount;
        System.out.println(total_price);

    }

}
