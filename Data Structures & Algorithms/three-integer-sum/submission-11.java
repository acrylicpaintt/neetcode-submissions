class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); //all in ascending order now
        int indOne = 0;
        int indTwo = 1;
        int indThree = nums.length - 1;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        //now the target is 0 - indOne and we need to find indTwo and indThree that add up to it (hence two sum)
        for (int j = 0; j < nums.length; j ++) {
            indOne = j;
            int target = 0 - nums[indOne];
            if (target < 0) {
                break;
            }
            if (j > 0 && nums[j] == nums[j - 1]) continue;

            indTwo = j +1;
            indThree = nums.length - 1;
        
            while (indTwo < indThree ) {
                if (nums[indTwo] + nums[indThree] < target) {
                    indTwo ++;
                }
                else if (nums[indTwo] + nums[indThree] > target) {
                    indThree --;
                }
                else if (nums[indTwo] + nums[indThree] == target ){
                    List<Integer> temp = new ArrayList<Integer>();
                    if (indOne < indTwo) {
                        temp.add(nums[indOne]);
                        temp.add(nums[indTwo]);
                        temp.add(nums[indThree]);
                    }
                    else if (indOne < indThree){
                        temp.add(nums[indTwo]);
                        temp.add(nums[indOne]);
                        temp.add(nums[indThree]);
                    }
                    else {
                        temp.add(nums[indTwo]);
                        temp.add(nums[indThree]);
                        temp.add(nums[indOne]);
                    }
                    if (!ans.contains(temp)){
                        ans.add(temp);
                }
                        indTwo++;
                        indThree --;
                    while (indTwo < indThree && nums[indTwo] == nums[indTwo - 1]) {
                        indTwo++;
                    }           
                }
            }
        }
        return ans;
        
    }
}
