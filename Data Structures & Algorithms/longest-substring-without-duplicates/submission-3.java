class Solution {
    public int lengthOfLongestSubstring(String s) {
        int pointer1 = 0;
        int pointer2 = 0;
        int max = 0;
        Hashtable<String, Integer> curr = new Hashtable<>();
        while (pointer2 < s.length()) {
            if (curr.containsKey(s.substring(pointer2, pointer2 + 1)) && curr.get(s.substring(pointer2, pointer2 + 1)) >= pointer1) {
                pointer1 = curr.get(s.substring(pointer2, pointer2 + 1)) + 1;
                curr.put(s.substring(pointer2, pointer2 + 1), pointer2);
            }
            else {
                curr.put(s.substring(pointer2, pointer2 + 1), pointer2);
            }
            max = Math.max(pointer2 + 1 - pointer1, max);
            pointer2++;
        }
        return max;
    }
}
