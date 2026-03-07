// Brute force for leetcode
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean bool = false;
        if(nums.length==1){
            return false;
        }
        int l = 0;
        
        
        while(l<nums.length ){
            int j = l+1;
            while(j<nums.length){
                if(nums[l]==nums[j] && Math.abs(l-j)<=k){
                    return true;
            }
            j++;
            }
            l++;  
        }
        return false;
    }
}
