class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix[] = new int[nums.length];
        int prev = 1;
        for(int i=0;i<nums.length;i++){
            prefix[i] = prev;
            prev = prev*nums[i];
        }

        // int suff[] = new int[nums.length];
        // int suffProd = 1;
        // for(int i=nums.length-1;i>=0;i--){
        //     suff[i] = suffProd;
        //     suffProd = suffProd*nums[i];
        // }
        
        int ans[] = new int[nums.length];
        int suffProd = 1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i] = suffProd*prefix[i];
            suffProd = suffProd * nums[i];
        }
        return ans;
    }
}  
