class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length -1] ++;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] >= 10) {
                if (i == 0) {
                    int[] newdigits = new int[digits.length + 1];
                    for (int j = digits.length - 1; j >= 0; j--) {
                        newdigits[j + 1] = digits[j];
                    }
                    newdigits[0] += newdigits[1]/10;
                    newdigits[1] %= 10;
                    return newdigits;
                }
                digits[i - 1] += digits[i]/10;
                digits[i] = digits[i]%10;
            }
            else {
                break;
            }
        }
            
        return digits;
    }
}
