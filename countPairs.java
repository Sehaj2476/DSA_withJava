class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.size()-1;
        while(left<right){
            if ((long)nums.get(left) + nums.get(right) < target){
                count+=right-left;
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
}
