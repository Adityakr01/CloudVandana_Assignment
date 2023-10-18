import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // here create a hashmap to store the values of Roman numerals
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral string in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = romanMap.get(s.charAt(i));

            
            if (curValue < prevValue) {
                result -= curValue;
            } else {
                
                result += curValue;
            }

            
            prevValue = curValue;
        }

        return result;
    }

    public static void main(String[] args) {
        
        String romanNumeral = "IX";
        int integerEquivalent = romanToInt(romanNumeral);
        System.out.println("Integer equivalent of " + romanNumeral + " is: " + integerEquivalent); // Output: 9
    }
}
