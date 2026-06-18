class Solution {
    public int search(int[] nums, int target) {
        int lower = 0;
        int higher = nums.length;
        while (lower < higher) {
            int med = (lower + higher) / 2;
            if (target > nums[med]) {
                lower = med + 1;
            }
            else if (target < nums[med]) {
                higher = med;
            }
            else {
                return med;
            }
        }
        return -1;
    }
}
