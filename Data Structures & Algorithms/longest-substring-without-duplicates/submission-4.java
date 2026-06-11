class Solution {
    public int lengthOfLongestSubstring(String s) {
        int p1 = 0;
        int p2 = 1;
        int max = 0;

        HashSet<Character> letters = new HashSet<>();

        if(s.length()<=1){
            return s.length();
        }

        letters.add(s.charAt(p1));

        while(p1<s.length() && p2<s.length()){
            while(letters.contains(s.charAt(p2))){
                letters.remove(s.charAt(p1));
                p1++;
            } 
            

            letters.add(s.charAt(p2));
            max = Math.max(max,1+p2-p1);
            p2++;
            

        }

        return max;
    }
}
