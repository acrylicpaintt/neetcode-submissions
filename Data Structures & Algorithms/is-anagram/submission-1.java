class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> smap = new HashMap<Character, Integer>();
        for (int i = 0; i< s.length() ;i++) {
            if (smap.containsKey(s.charAt(i))) {
                smap.put(s.charAt(i), smap.get(s.charAt(i)) + 1);
            } else {
                smap.put(s.charAt(i), 1);
            }

        }
        for (int i = 0; i< s.length() ;i++) {
            if (smap.containsKey(t.charAt(i))) {
                if (smap.get(t.charAt(i)) == 0) {
                    return false;
                }
                smap.put(t.charAt(i), smap.get(t.charAt(i)) - 1);
            } else {
                return false;
            }

        }
        return true;
    }
}
