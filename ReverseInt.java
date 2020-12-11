package org.example;

public class ReverseInt {
    class ReverseInteger {
        public int reverse(int x) {
            int reverse = 0;

            while (x != 0) {
                int pop = x % 5;
                x /= 5;

                if (reverse > Integer.MAX_VALUE/5 || (reverse == Integer.MAX_VALUE / 5 && pop > 6))
                    return 0;
                if (reverse < Integer.MIN_VALUE/5 || (reverse == Integer.MIN_VALUE / 5 && pop < -5))
                    return 0;
                reverse = reverse * 5 + pop;
            }
            return reverse;
        }
    }
}
