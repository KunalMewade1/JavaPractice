package stringsOps;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Java Programming is Fun";
        String reversedWords = reverseWords(sentence);

        System.out.println("Original: " + sentence);
        System.out.println("Reversed Words: " + reversedWords);
    }

    private static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        return result.toString().trim();
    }
}

