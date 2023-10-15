public class PangramChecker {
    public static boolean isPangram(String s) {
        if (s == null || s.length() < 26) {
            return false; // If the string is too short, it can't be a pangram.
        }

        boolean[] alphabet = new boolean[26]; // Array to mark letters encountered.

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            } else if (c >= 'A' && c <= 'Z') {
                alphabet[c - 'A'] = true;
            }
        }

        // Check if all letters have been encountered.
        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(sentence);
        System.out.println("Is the input a pangram? " + isPangram);
    }
}
