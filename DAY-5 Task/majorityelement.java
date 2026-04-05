class Solution {
    public int majorityElement(int[] a) {
        
        int ctr = 0, m = 0;
        for (int x : a) {
            if (ctr == 0) {
                m = x;
                ctr = 1;
            } else {
                ctr += (m == x) ? 1 : -1;
            }
        }
        return m;
    }
}