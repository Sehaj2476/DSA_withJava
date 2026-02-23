class Solution {

    public void nextPermutation(int[] nums) {

        if (nums == null || nums.length <= 1) return;

        int n = nums.length;
        int piv = -1;

        // 1️⃣ Find pivot
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                piv = i;
                break;
            }
        }

        // 2️⃣ If no pivot, reverse all
        if (piv == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // 3️⃣ Find rightmost element greater than pivot
        for (int i = n - 1; i > piv; i--) {
            if (nums[i] > nums[piv]) {
                swap(nums, i, piv);
                break;
            }
        }

        // 4️⃣ Reverse suffix
        reverse(nums, piv + 1, n - 1);
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l++, r--);
        }
    }
}
