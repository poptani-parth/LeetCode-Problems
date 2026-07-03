class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        if(s.isEmpty()){
            return true;
        }
        while(start <= end){
            char cf = s.charAt(start);
            char ce = s.charAt(end);
            if(!Character.isLetterOrDigit(cf)){
                start++;
            }else if(!Character.isLetterOrDigit(ce)){
                end--;
            }else{
                if(Character.toLowerCase(cf) != Character.toLowerCase(ce)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}