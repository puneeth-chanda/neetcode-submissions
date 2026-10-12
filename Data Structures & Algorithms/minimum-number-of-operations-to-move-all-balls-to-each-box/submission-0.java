class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        // List<Integer> ans = new ArrayList<>();
        List<Integer> ones = new ArrayList<>();
        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i) == '1'){
                ones.add(i);
            }
        }

        // for (int one : ones) {
            
        // }

        for(int i =0;i<boxes.length();i++){
            int count = 0;
            for(int oneIndex : ones){
                count += Math.abs(i - oneIndex);
            }
            ans[i] = count;
        }

        return ans;
    }
}