class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";

        for(String word : words){
            if(isInRow(word, first) || isInRow(word, second) || isInRow(word, third)){
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
    private boolean isInRow(String s, String row){
        for(char ch : s.toCharArray()){
            if(row.indexOf(Character.toLowerCase(ch)) == -1){
                return false;
            }
        }
        return true;
    }
}