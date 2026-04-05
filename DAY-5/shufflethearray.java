class Solution {
    public int[] shuffle(int[] nums, int n) {
        // int ans[] = new int[2 * n];
        // for (int i = 0; i < n; i++) {
        //     ans[i * 2] = nums[i];
        // }
        // int k = 1;
        // for (int j = n; j < nums.length; j++) {
        //     ans[k] = nums[j];
        //     k += 2;
        // }
        // return ans;

        int ans[] = new int[2 * n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            ans[j++] = nums[i];
            ans[j++] = nums[i + n];
        }
        return ans;

    }
}