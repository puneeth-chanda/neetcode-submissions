class Solution {
    public int maxArea(int[] nums) {
        int maxHeight = Integer.MIN_VALUE;
        int i = 0;
        int j = nums.length-1;

        while(i<j){
            int currentWidth = j-i;
            int currentMaxHeight = Math.min(nums[i],nums[j]);
            int currentArea = currentWidth * currentMaxHeight;
            
            maxHeight = Math.max(maxHeight,currentArea);
            if(nums[j]<nums[i]){
                j--;
            } else {
                i++;
            }

        }
        return maxHeight;
    }
}
