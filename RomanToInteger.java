import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = values.get(s.charAt(i));

            // If the current value is less than the next value, subtract it; otherwise, add it
            if (i + 1 < s.length() && currentVal < values.get(s.charAt(i + 1))) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));     // 3
        System.out.println(romanToInt("LVIII"));   // 58
        System.out.println(romanToInt("MCMXCIV")); // 1994
    }
}
