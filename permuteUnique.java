// leetcode 47
class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean [nums.length];
        backtrack(nums, result, new ArrayList<>(), used);
        return result;
    }
    private void backtrack(int[] nums, List<List<Integer>> result, List<Integer> current, boolean[] used){
        // base case
        if(nums.length==current.size()){
            result.add(new ArrayList<>(current));
            return;
        }
         for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            // 🔥 skip duplicates
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;
            used[i] = true;
            current.add(nums[i]);
            backtrack(nums, result, current, used);
            // Backtrack
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}
