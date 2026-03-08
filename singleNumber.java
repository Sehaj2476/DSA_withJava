class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[] = new int[2];
        int j = 0;
        HashMap<Integer,Integer> number = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(number.containsKey(nums[i])){
                number.remove(nums[i]);
            }else{
                number.put(nums[i],1);
            }
        }
        for(int key : number.keySet()){
            arr[j] = key;
            j++;
        }
        return arr;
    }
}
