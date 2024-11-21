import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // Example string
        String s = "leetcode";
        int index = firstUniqChar(s);
        System.out.println("The first non-repeating character is at index: " + index);
    }
}