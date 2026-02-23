class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;
        int closestSum = nums[0] + nums[1] + nums[2];
        for(int i=0;i<n;i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                   sum = nums[i]+ nums[j] + nums[k];
                   if(Math.abs(target-sum)<Math.abs(target-closestSum)){
                    closestSum = sum;
                   } 
                   if(sum<target){
                    j++;
                   }else{
                    k--;
                   }
            }
        }
        return closestSum;
    }
}
