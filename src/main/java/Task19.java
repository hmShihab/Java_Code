//Extract the OTP from the SMS. "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S"

public class Task19 {
    public static void main(String[] args) {
        String sms = "Your one time password is 246148. Don't share this code with anyone \\r\\nBvwt3f8js2S";
        String otp = sms.replaceAll("[^0-9]", "").substring(0,7);
        System.out.println("Your OTP is: "+ otp);
    }
}
