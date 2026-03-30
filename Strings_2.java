package Java_Core;

public class Strings_2 {
	 public static void main(String[] args) {
	
	String fullName = "  alice marie johnson  ";

    // 1. Trim and capitalize each word
    String cleaned = fullName.trim();
    String[] words = cleaned.split(" ");
    cleaned = "";
    for (int i = 0; i < words.length; i++) {
        if (!words[i].isEmpty()) {
            // Capitalize first letter + rest lowercase
            cleaned += words[i].substring(0, 1).toUpperCase() +
                       words[i].substring(1).toLowerCase();
            if (i < words.length - 1) {
                cleaned += " ";
            }
        }
    }
    System.out.println("Cleaned: " + cleaned);

    // 2. Extract first, middle, last names using indexOf and substring
    int firstSpace = cleaned.indexOf(" ");
    int lastSpace = cleaned.lastIndexOf(" ");
    String firstName = cleaned.substring(0, firstSpace);
    String middleName = cleaned.substring(firstSpace + 1, lastSpace);
    String lastName = cleaned.substring(lastSpace + 1);
    System.out.println("First: " + firstName + "  Middle: " + middleName + "  Last: " + lastName);

    // 3. Count vowels
    String lower = cleaned.toLowerCase();
    int vowelCount = 0;
    for (int i = 0; i < lower.length(); i++) {
        char ch = lower.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowelCount++;
        }
    }
    System.out.println("Vowel count: " + vowelCount);

    // 4. Reverse the string character by character
    String reversed = "";
    for (int i = cleaned.length() - 1; i >= 0; i--) {
        reversed += cleaned.charAt(i);
    }
    System.out.println("Reversed: " + reversed);
}

}
