class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = {-1,-1};
        int j = 0;
        boolean found = false; 
        for(int i=0;i<nums.length;i++){
                if(nums[i]==target){
                    // Store first occurrence
                    if(result[0] == -1) {
                    result[0] = i;
                    }
                    result[1] = i;
                }
        }
        return result;
    }
}
