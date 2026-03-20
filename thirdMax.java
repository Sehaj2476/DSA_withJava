class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>(); // keeps order
        for(int num : nums){
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for(int num : set){
            result[i++] = num;
        }
        int n = result.length;
        int swap;
        for(i=0;i<n;i++){
            for(int j=i+1; j<n; j++){
                if(result[i]<result[j]){
                    swap = result[i];
                    result[i] = result[j];
                    result[j] = swap;
                }
            }
        }
        if(n<3){
            return result[0];
        }

        return result[2];
        
    }
}
