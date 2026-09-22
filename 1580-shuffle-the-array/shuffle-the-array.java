class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];

        int i = 0;
        int j = n;
        int k = 0;

        while (i < n) {
            arr[2 * i] = nums[i];
            arr[2 * i + 1] = nums[j];

            i++;
            j++;
        }

        return arr;
    }
}