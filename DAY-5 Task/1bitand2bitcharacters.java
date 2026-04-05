class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int ind = 0;
        while (ind < bits.length - 1) {
            if (bits[ind] == 1)
                ind += 2;
            else
                ind++;
        }
        return ind == bits.length - 1;
    }
}