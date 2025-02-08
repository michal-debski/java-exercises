package pl.edu.agh.java.exercises.strings;

/**
 * Given a string, return the longest substring that appears at both the beginning and end of the string without
 * overlapping. For example, sameEnds("abXab") is "ab".
 * <p>
 * Dla danego ciągu znaków zwróć najdłuższy podciąg, który występuje na początku i na końcu, bez nachodzenia na siebie.
 * Przykłądowo, sameEnds("abXab") to "ab".
 *
 * @see http://codingbat.com/prob/p131516
 */
public class StringSameEnds {
    public String sameEnds(String string) {

        int length = string.length();
        if (length == 0) {
            return "";
        } else if (length == 1) {
            return "";
        } else if (length == 2 && string.charAt(0) == string.charAt(1)) {
            return string.substring(1);
        } else {
            for (int i = 0; i < length; i++) {
                for (int j = length - 1; j > 0; j--) {
                    if (string.charAt(i) == string.charAt(j)) {
                        return String.valueOf(string.charAt(i));
                    }
                }
            }
        }
        return null;
    }
}
