import java.util.HashSet;
import java.util.Set;

public class StringPermutations {
    public static Set<String> findPermutations(String str) {
        Set<String> result = new HashSet<>();
        char[] chars = str.toCharArray();
        generatePermutations(chars, 0, result);
        return result;
    }
    private static void generatePermutations(char[] chars, int index, Set<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            generatePermutations(chars, index + 1, result);
            swap(chars, index, i);
        }
    }
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        // Example string
        String str = "ABC";
        Set<String> permutations = findPermutations(str);
        System.out.println("Permutations of the string: ");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
}