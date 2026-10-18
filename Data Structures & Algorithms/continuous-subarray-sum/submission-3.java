class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix[] = new int[nums.length+1];
        prefix[0] = 0;
        map.put(0,0);
        for(int i=1;i<nums.length+1;i++){
            prefix[i] = prefix[i-1] + nums[i-1];
            int reminder = prefix[i]%k;
            if(map.containsKey(reminder)){
                int firstRIndex = map.get(reminder);
                if(i-firstRIndex>1){
                    return true;
                }
            }
            else {
                map.put(reminder,i);

            }
        }
        return false;
    }
}