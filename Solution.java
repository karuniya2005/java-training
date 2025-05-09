import java.util.HashMap;

public class Solution {
    public String longestSubstringWithoutRepeating(String s) {
        HashMap<Character, Integer> seen = new HashMap<>();
        int left = 0, maxLength = 0, start = 0;

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (seen.containsKey(letter) && seen.get(letter) >= left) {
                left = seen.get(letter) + 1;
            } else {
                if (i - left + 1 > maxLength) {
                    maxLength = i - left + 1;
                    start = left;
                }
            }
            seen.put(letter, i);
        }

        return s.substring(start, start + maxLength) + " " + maxLength;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String input = "abcabcbb";
        String result = sol.longestSubstringWithoutRepeating(input);
        System.out.println(result);
    }
}