class Solution {
    private void reverse(int st, int end, int arr[]) {
        while (st < end) {
            int temp = arr[st];
            arr[st++] = arr[end];
            arr[end--] = temp;
        }
    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(0, nums.length - 1, nums);
        reverse(0, k - 1, nums);
        reverse(k, nums.length - 1, nums);
    }
}