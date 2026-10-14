class Solution {
    public int numRescueBoats(int[] weight, int limit) {
        int i = 0;
        int j = weight.length-1;
        int count = 0;

        Arrays.sort(weight);

        while(i<=j){
            if(weight[i]+weight[j]>limit){
                j--;
                count++;
            } else {
                i++;
                j--;
                count++;
            }
        }

        return count;

    }
}