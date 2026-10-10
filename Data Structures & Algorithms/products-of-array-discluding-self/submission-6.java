class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for(int i=1;i<nums.length;i++){
             res[i] = res[i-1] * nums[i-1];
        }

        int suffixProd = 1; //instead of maintaining an array just use an element to track the sum of right elements
        // int sufProdUntilNow = suffix[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
            res[i] = suffixProd * res[i];
            suffixProd *= nums[i]; 
        }
        return res;
    }
}  
