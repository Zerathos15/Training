class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            if (n > 9)
                sum -= n;
            else
                sum += n;
        }
        return sum != 0;
    }
}