package Java_Core;

public class Strings {
	public static int countVowels(String s) {
		
        int count = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    // 2. Reverse string using for loop
    public static String reverseString(String s) {
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }
        return reversed;
    }

    // 3. Check palindrome (ignore case and spaces)
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replace(" ", "");
        String reversed = reverseString(s);
        return s.equals(reversed);
    }

    // 4. Count occurrences of a word in text
    public static int countOccurrences(String text, String word) {
        int count = 0;
        text = text.toLowerCase();
        word = word.toLowerCase();

        String[] words = text.split(" ");

        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }

    // Main method to test all functions
    public static void main(String[] args) {

        String str = "A man a plan a canal Panama";
        System.out.println(str );
        System.out.println("Vowel count: " + countVowels(str));

        System.out.println("Reversed string: " + reverseString(str));

        System.out.println("Is palindrome: " + isPalindrome(str));
        
        String word = "a";
        System.out.println("Occurrences of '" + word + "': " + countOccurrences(str, word));
    }


}
