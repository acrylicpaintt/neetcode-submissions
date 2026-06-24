class Solution {
    public int search(int[] nums, int target) {
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
        
        if (target == nums[l]) {
            return l;
        }
        else if (target == nums[nums.length - 1]) {
            return nums.length -1;
        }
        else if (target < nums[nums.length - 1] && target > nums[l]) {
            r = nums.length - 1;
        }
        else {
            r = l -1;
            l = 0;
        }
        while (l < r) { 
            int m = (l + r) / 2;
            if (nums[m] < target) {
                l = m + 1;
            }
            else if (nums[m] > target) {
                r = m ;
            }
            else {
                return m;
            }
        }
        if (nums[l] == target) {
            return l;
        }
        return -1;
    }
}
