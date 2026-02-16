class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int sortedSquares[] = new int [n];
        for(int i=0;i<n;i++){
            sortedSquares[i] = nums[i]*nums[i];
        }
        Arrays.sort(sortedSquares);
        return sortedSquares;
    }
}
