//Summary: If two strings are considered close by the following criteria:
//  Swap any two exisiting characters
//  Transform every occurance of one existing character into another existing character
//  Return true if 'word1' and 'word2' are close, and false otherwise. The operations can be used on either string as many times as necessary.
//Abstract: First, check if the two strings have the same length. If not, automatically RETURN false. Then use two hash maps with key type CHARACTER and value type INTEGER. For each character in both words, merge into the respective maps. Check if the keys are equal between the two maps. If not, return false. Then create array lists to store just the values for both words. Sort them and return true or false if they equal one another.
//Solution:
class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;

        Map<Character, Integer> count1 = new HashMap<>();
        Map<Character, Integer> count2 = new HashMap<>();

        for (final char c : word1.toCharArray())
            count1.merge(c, 1, Integer::sum);

        for (final char c : word2.toCharArray())
            count2.merge(c, 1, Integer::sum);

        if (!count1.keySet().equals(count2.keySet()))
            return false;

        List<Integer> freqs1 = new ArrayList<>(count1.values());
        List<Integer> freqs2 = new ArrayList<>(count2.values());

        Collections.sort(freqs1);
        Collections.sort(freqs2);
        return freqs1.equals(freqs2);
  }
}
