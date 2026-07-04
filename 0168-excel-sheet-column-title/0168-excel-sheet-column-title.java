class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            int r = columnNumber % 26; // A - 1, Z - 26, AA - 27
            char letter = (char)('A' + r);
            sb.append(letter);
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}