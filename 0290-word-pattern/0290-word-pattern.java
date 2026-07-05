class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if(pattern.length() != word.length)
            return false;
        
        HashMap<Character, String> charToWord = new HashMap<>();
        HashSet<String> seemWord = new HashSet<>();
        for(int i = 0; i < word.length; i++){
            char c = pattern.charAt(i);
            String w = word[i];
            if(charToWord.containsKey(c)){
                if(!charToWord.get(c).equals(w))
                    return false;
            }else{
                if(seemWord.contains(w))
                    return false;
                charToWord.put(c, w);
                seemWord.add(w);
            }
            System.out.println(charToWord);
        }
        return true;
    }
}