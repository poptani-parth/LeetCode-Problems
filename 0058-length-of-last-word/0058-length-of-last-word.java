class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        boolean found = false;
        for(int i = s.length() - 1; i>=0; i--){
            if(s.charAt(i) == ' '){
                if(found){
                    return len;
                }
                continue;
            }
            len++;
            found = true;
        }
        return len;
    }
}