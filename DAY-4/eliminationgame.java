class Solution {
    public int lastRemaining(int n) {
        int start = 1;
        int step = 1;
        boolean left = true;
        while (n != 1) {
            if (left || n % 2 != 0) {//n % 2== 1 odd
                start += step;
            } 
            n /= 2;
            step *= 2;
            left = !left;
        }
        return start;
    }
}