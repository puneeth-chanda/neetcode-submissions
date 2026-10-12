class Solution {
    public int[] minOperations(String boxes) {
        int balls = 0;
        int moves = 0;
        int[] prefix = new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            prefix[i] = balls+moves;
            if(boxes.charAt(i)=='1'){
                balls+=1;
            }
            moves = prefix[i];
        }

        balls = 0;
        moves = 0;
        int[] suffix = new int[boxes.length()];
        for(int i=boxes.length()-1;i>=0;i--){
            suffix[i] = balls+moves;
            if(boxes.charAt(i)=='1'){
                balls+=1;
            }
            moves = suffix[i];
        }

        int[] ans = new int[boxes.length()];
        for(int i=boxes.length()-1;i>=0;i--){
            ans[i] = prefix[i]+suffix[i];
        }

        return ans;
    }
}