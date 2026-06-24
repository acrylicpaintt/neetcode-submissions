class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high  = Arrays.stream(piles).max().getAsInt();
        while (low < high) {
            int med = (low + high ) / 2; 
            int hours = 0;
            for (int i = 0; i < piles.length; i ++) {
                hours += Math.ceil((double) piles[i] / med);
            }
            if (hours > h) { 
                low = med + 1;
            }
            else {
                high = med;
            }
        }
        return low;
    }
}
