public class StringRotation {
    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenatedStr = str1 + str1;
        return concatenatedStr.contains(str2);
    }

    public static void main(String[] args) {
        // Example strings
        String str1 = "ABCD";
        String str2 = "DABC";
        if (isRotation(str1, str2)) {
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println(str2 + " is NOT a rotation of " + str1);
        }
    }
}