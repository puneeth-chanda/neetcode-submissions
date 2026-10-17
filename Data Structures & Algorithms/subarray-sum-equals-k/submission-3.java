class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> seenElements = new HashMap<>();
        int prefix[] = new int[nums.length+1];
        prefix[0] = 0;
        for(int i=1;i<nums.length+1;i++){
            prefix[i] = prefix[i-1] + nums[i-1];
        }
        seenElements.put(0,1);
        int count = 0;
        // int r = 1; //of the prefix array
        for(int r=1;r<prefix.length;r++){
            int reqElement = prefix[r]-k;
            if(seenElements.containsKey(reqElement)){
                count = count + seenElements.get(reqElement);
            }
            seenElements.put(prefix[r],seenElements.getOrDefault(prefix[r],0)+1);
        }
        return count;
    }
}