class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] pointer = new int[2];
        pointer[0] = 0;
        pointer[1] = numbers.length - 1;
        int sum = numbers[pointer[0]] + numbers[pointer[1]];
        while (sum != target) {
            if (sum > target) {
                pointer[1] --;
            }
            else { // sum < target
                pointer[0] ++;
            }
            sum = numbers[pointer[0]] + numbers[pointer[1]]; 
        }
        pointer[0]++;
        pointer[1]++;
        return pointer;
    }
}
