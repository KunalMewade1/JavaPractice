public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbcccc";
        String compressed = compressString(str);

        System.out.println("Original: " + str);
        System.out.println("Compressed: " + compressed);
    }

    private static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i)).append(count);
                count = 1;
            }
        }

        compressed.append(str.charAt(str.length() - 1)).append(count);

        return compressed.toString();
    }
}
