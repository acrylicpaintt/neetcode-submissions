class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) { 
            int m = (l + r) / 2;
            //nums[l], nums[r], nums[m]
            if (nums[r] < nums[m]) {
                l = m + 1;
            }
            else if (nums[m] < nums[r]) {
                r = m ;
            }
        }
        return nums[l];
    }
}
