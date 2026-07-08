class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String temp = "", ans ="";
        int i = s.length()-1;
        while(i >= 0){
            char c = s.charAt(i);
            if(c != '-'){
                temp += Character.toUpperCase(c);
            }
            i--;
        }
        int c = k;
        for(int j = 0; j < temp.length(); j++){
            char ch = temp.charAt(j);
            if(c == 0){
                c = k;
                ans = '-' + ans;
            }
            ans = ch + ans;
            c--;
        }
        return ans;
    }
}