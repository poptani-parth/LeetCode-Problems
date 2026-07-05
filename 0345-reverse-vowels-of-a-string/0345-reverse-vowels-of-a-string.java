class Solution {
    public String reverseVowels(String s) {
        int left = 0 ;
        int right = s.length() - 1;
        char[] ch = s.toCharArray();
        while(left < right){
            if(!isVowel(ch[left]))
                left++;
            else if(!isVowel(ch[right]))
                right--;
            else{
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        String str = String.valueOf(ch);
        return str;
    }
    private boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' ||  c == 'e' || c == 'i' ||  c == 'o' || c == 'u';
    }
}