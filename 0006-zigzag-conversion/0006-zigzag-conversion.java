class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() <= numRows){
            return s;
        }
        int len = s.length();
        StringBuilder zigzag = new StringBuilder();
        int cycle = 2*numRows-2;
        for (int row = 0; row<numRows; row++){
            int temp = row;
            while (temp < len){
                zigzag.append(s.charAt(temp));
                //diagonal character
                int diagonal = temp + cycle - 2 * row;
               
               if (row != 0 && row != numRows-1 && diagonal < len){
                    zigzag.append(s.charAt(diagonal));
               }
               temp += cycle;
            }
        }
        return zigzag.toString();
    }
}