class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        int i = 0;
        int j = 10;

        while(j<=s.length()){
            String subString = s.substring(i,j);
            map.put(subString, map.getOrDefault(subString,0)+1);
            i++;
            j++;
        }

        map.forEach((key, value) -> {
            if(value>=2){
                ans.add(key);
            }
        });
        return ans;
    }
}
