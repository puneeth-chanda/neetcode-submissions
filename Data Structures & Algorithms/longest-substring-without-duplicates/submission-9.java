class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        for(int r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(left));
                left++; //decrase size from left until r;
            }
            set.add(s.charAt(r));
            int length = r-left+1;
            maxLength = Math.max(maxLength,length);
        }
        return maxLength;
    }
}
