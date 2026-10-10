class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            int reminder = sum%k;

            if(map.containsKey(reminder)){
                int right = map.get(reminder);
                if(i-right>1){
                    return true;
                }
            } else {
                map.put(reminder,i);
            }

        }
        return false;
    }
}