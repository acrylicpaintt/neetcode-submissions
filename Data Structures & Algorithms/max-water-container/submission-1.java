class Solution {
    public int maxArea(int[] heights) {
        int ansArea = 0;
        int barOneInd = 0;
        int barTwoInd = heights.length - 1;
        int width, height;
        while (barOneInd < barTwoInd) {
            width = barTwoInd - barOneInd;
            height = Math.min(heights[barOneInd], heights[barTwoInd]);
            ansArea = Math.max(height * width, ansArea);
            if (heights[barOneInd] < heights[barTwoInd]) {
                barOneInd++;
            }
            else {
                barTwoInd --;
            }
        }
        return ansArea;
        
    }
}
