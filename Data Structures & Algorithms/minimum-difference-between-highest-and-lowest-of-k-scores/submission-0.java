class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int windowSize = k;
        int i = 0;
        int j = k-1;
        int maxDiff = Integer.MAX_VALUE;
        while(j<nums.length){
            int difference = nums[j] - nums[i];
            maxDiff = Math.min(maxDiff,difference);
            j++;
            i++;
        }
        return maxDiff;
    }
}