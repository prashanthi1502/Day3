public class TitleCaseConverter {
    public static String toTitleCase(String str){
        String[] words = str.split("\\s+");

        StringBuilder titleCaseString = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                String titleCasedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                titleCaseString.append(titleCasedWord).append(" ");
            }
        }
        return titleCaseString.toString().trim();
    }

    public static void main(String[] args) {
        // Example string
        String str = "hello world! this is a test.";
        String result = toTitleCase(str);
        System.out.println("Title Case: " + result);
    }
}