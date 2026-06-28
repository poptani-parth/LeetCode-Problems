class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0)
            return false;
        int sum = 0;
        int copied = x;
        while( x != 0){
            sum = sum * 10 + (x % 10);
            x /= 10;
        }
        return sum == copied;
    }
}