class Solution {
    public boolean detectCapitalUse(String word) {

        // return word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()) || word.equals(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase()); 

        // count 
        int c = 0;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
                c++;
        }
        if(c == word.length())
            return true;
        if(c == 0)
            return true;
        if(c == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'){
            return true;
        }
        return false;
    }
}