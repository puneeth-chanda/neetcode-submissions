class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length-1;
        int lMax = height[i];
        int rMax = height[j];
        int result = 0;
        while(i<j){
            if(height[i]<height[j]){
                i++;
                int diff = lMax - height[i];
                result += Math.max(0,diff);
                lMax = Math.max(height[i],lMax);
            } else {
                j--;
                int diff = rMax - height[j];
                result += Math.max(0,diff);
                rMax = Math.max(height[j],rMax);
            }
        }
        return result;
    }
}
