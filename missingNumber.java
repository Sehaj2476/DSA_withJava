class Solution {
    public int missingNumber(int[] nums) {
        int missing = 0;
        Arrays.sort(nums);
        if(nums[0]!=0){
            return missing;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
}
