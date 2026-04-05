class Solution {
    private int mini(int nums[]) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
                index = i;
            }
        }
        return index;
    }

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int min = mini(nums);
            nums[min] *= multiplier;
        }
        return nums;
    }
}