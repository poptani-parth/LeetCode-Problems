class Solution {
    public int reverse(int x) {
        int reminder = 0;
        int sum = 0;
        while(x != 0){
            reminder = x % 10;
           
            // Check for overflow
            if (sum > Integer.MAX_VALUE / 10 ||
               (sum == Integer.MAX_VALUE / 10 && reminder > 7))
                return 0;

            // Check for underflow
            if (sum < Integer.MIN_VALUE / 10 ||
               (sum == Integer.MIN_VALUE / 10 && reminder < -8))
                return 0;

            sum = sum * 10 + reminder;
            x /= 10;
        }
        return sum;
    }
}