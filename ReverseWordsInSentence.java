public class ReverseWordsInSentence {

    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");

        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }

    public static void main(String[] args) {
        // Example sentence
        String sentence = "Java is a programming language";
        String result = reverseWords(sentence);
        System.out.println("Reversed sentence: " + result);
    }
}