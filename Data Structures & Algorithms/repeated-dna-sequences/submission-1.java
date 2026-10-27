class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        List<String> ans = new ArrayList<>();
        int i = 0;
        int j = 10;

        while(j<=s.length()){
            String subString = s.substring(i,j);
            if(seen.contains(subString)){
                if(!repeated.contains(subString)){
                    ans.add(subString);
                    repeated.add(subString);
                }
            } else {
                seen.add(subString);

            }
            i++;
            j++;
        }
        return ans;
    }
}
