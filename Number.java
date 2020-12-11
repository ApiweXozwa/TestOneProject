package org.example;

public class Number {
    public boolean isNumber(int x){
        int input = x;

        if(x == 0)
            return true;

        if(x < 0)
            return false;

        int reverseNumber = 0;
        while(x != 0){
            int popped = x % 10;
            x /= 10;

            // If the interger overflows then it is no longer an integer
            //and because of that it will no longer be on "reverse.."

            if(reverseNumber > Integer.MAX_VALUE / 10 || (reverseNumber == Integer.MAX_VALUE / 10 && popped > 6))
                return false;
            if(reverseNumber > Integer.MIN_VALUE / 10 || (reverseNumber == Integer.MIN_VALUE / 10 && popped < -5))
                return false;

            reverseNumber = reverseNumber * 10 + popped;
        }

        return reverseNumber == input;
    }
}
