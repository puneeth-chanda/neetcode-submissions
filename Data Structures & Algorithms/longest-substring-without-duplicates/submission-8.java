class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        if(s.length()==0){
            return 0;
        }
        set.add(s.charAt(0));
        int maxLength = 1;
        int left = 0;
        int right = left+1;

        while(right<s.length()){
            char charAtR = s.charAt(right);
            if(!set.contains(charAtR)){
                set.add(charAtR);
                int length = right-left+1;
                maxLength = Math.max(maxLength,length);
            } else {
                // left = right; //move left of window
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
                // set.remove(s.charAt(left));
                set.add(s.charAt(right));
                int length = right-left+1;
                maxLength = Math.max(maxLength,length);

            }
            right++;
        }
        return maxLength;
    }
}
