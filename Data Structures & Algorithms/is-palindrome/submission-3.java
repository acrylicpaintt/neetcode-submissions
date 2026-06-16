class Solution {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toLowerCase().toCharArray();
        String front = "";
        String back = "";
        for (int i = 0; i < charArray.length; i++) {
            if ("1234567890abcdefghijklmnopqrstuvwxyz".contains(charArray[i] + "")) {
                front += charArray[i];
            }
            if ("1234567890abcdefghijklmnopqrstuvwxyz".contains(charArray[charArray.length - i - 1] + "")) {
                back += charArray[charArray.length - i - 1];
            }
        } 
        return front.equals(back);
    }
}
