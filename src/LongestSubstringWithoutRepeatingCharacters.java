import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    /*
    Given a string, find the length of the longest substring without repeating characters.

    Examples:

    Given "abcabcbb", the answer is "abc", which the length is 3.

    Given "bbbbb", the answer is "b", with the length of 1.

    Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


     */
    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("dvdf"));
    }

    public int lengthOfLongestSubstring(String s) {
        char[]      chars     = s.toCharArray();
        Set<Object> set       = new HashSet<Object>();
        Set<Object> biggerSet = set;
        for (char c : chars) {
            String[] cs = s.split(c+"");
            for (String c1 : cs) {
                System.out.println(c1);
            }

            /*if (set.contains(c)) {
                if (set.size() > biggerSet.size()) {
                    biggerSet = set;
                }
                set = new HashSet<Object>();
            }
            set.add(c);*/
        }
        System.out.println(biggerSet);
        return biggerSet.size()>set.size()?biggerSet.size():set.size();
    }
}
