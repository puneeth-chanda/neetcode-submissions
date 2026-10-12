class Solution {
    public int[] minOperations(String boxes) {
        int balls = 0;
        int moves = 0;
        int[] ans = new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            ans[i] = balls+moves;
            if(boxes.charAt(i)=='1'){
                balls+=1;
            }
            moves = ans[i];
        }

        balls = 0;
        moves = 0;
        for(int i=boxes.length()-1;i>=0;i--){
            int totalMovesUntilNow = balls+moves;
            ans[i] += totalMovesUntilNow;
            if(boxes.charAt(i)=='1'){
                balls+=1;
            }
            moves = totalMovesUntilNow;
        }
        return ans;
    }
}