//Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
//        "I live in Bangladesh"
//        Output:
//        Number of words: 4
//        Number of chars without spaces: 17
//        Number of vowels: 7
//        Number of consonant: 10

public class Task15 {
    public static void main(String[] args) {
        String str = "I live in Bangladesh";
        str = str.toUpperCase();
//         char[] arr = str.toCharArray();
        int vowel = 0;
        int consonant = 0;
        int words = 1;
        int withoutSpace = 0;
        for (int i = 0; i < str.length(); i++) {
            char count = str.charAt(i);
//            char word = str.charAt(i+1);
            if (count != ' ') {
                if (count == 'A' || count == 'E' || count == 'I' || count == 'O' || count == 'U') {
                    vowel++;
                }
                else {
                   consonant++;

               }
            }
            else if (str.charAt(i+1)!= ' ') {
                words++;
            }
        }
        withoutSpace = vowel + consonant;
        System.out.println("Number of words: "+ words);
        System.out.println("Number of Vowels: " + vowel);
        System.out.println("Number of chars without spaces: " + withoutSpace);
        System.out.println("Number of Consonants: "+ consonant);
    }
}

