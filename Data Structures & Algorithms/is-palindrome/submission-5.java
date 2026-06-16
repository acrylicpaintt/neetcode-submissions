class Solution {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toLowerCase().toCharArray();
        StringBuilder front = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if ("1234567890abcdefghijklmnopqrstuvwxyz".contains(charArray[i] + "")) {
                front.append( charArray[i]);
            }
            
        } 
        return front.toString().equals(front.reverse().toString());
    }
}
