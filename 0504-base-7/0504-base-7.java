class Solution {
    public String convertToBase7(int num) {
        String temp = "";
        boolean negative = false;
        if(num == 0)
            return "0";
        if(num < 0){
            negative = true;
            num = Math.abs(num);
        }

        while (num > 0){
            int reminder = num % 7;
            temp = String.valueOf(reminder) + temp;
            num /= 7;
        }
        if(negative){
            temp = '-'+temp;
        }
        return temp;
    }
}