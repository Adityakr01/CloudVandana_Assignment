public class PangramChecker {
    public static boolean isPangram(String str) {
        // Create a boolean array to mark the presence of letters from A to Z
        boolean[] alphabetPresence = new boolean[26];
        int totalAlphabets = 26;

        // convert all the character to lower case and then check 
        for (char c : str.toLowerCase().toCharArray()) {
            if ('a' <= c && c <= 'z') {
                alphabetPresence[c - 'a'] = true;
            }
        }

        // Check if all letters from A to Z are present
        for (boolean isPresent : alphabetPresence) {
            if (!isPresent) {
                // If any letter is not present, it's not a pangram
                return false;
            }
            totalAlphabets--;
        }

        // If totalAlphabets is 0, it's a pangram
        return totalAlphabets == 0;
    }

    public static void main(String[] args) {
        
        String input = "The quick brown fox jumps over the lazy dog";
        boolean result = isPangram(input);
        if (result) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
