class Solution {
    public String reverseWords(String s) {
        // char[] ch = s.toCharArray();
        // int n = ch.length;
        // int l = 0;
        // for(int right = 0; right <= n; right++){
        //     if(right == n || ch[right] == ' '){
        //         reverse(ch, l, right - 1);
        //         l = right + 1;
        //     }
        // }
        // return new String(ch);

        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length; i++){
            sb.append(new StringBuilder(str[i]).reverse());
            if(i != str.length - 1)
                sb.append(" ");
        }
        return sb.toString();
    }
    // private void reverse(char[] c, int left, int right){
    //     while(left < right){
    //         char temp = c[left];
    //         c[left] = c[right];
    //         c[right] = temp;
    //         left++;
    //         right--;
    //     }
    // }
}