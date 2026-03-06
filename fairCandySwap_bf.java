// Leetcode 888
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        // array to store result
        int result[]= new int[Math.max(aliceSizes.length,bobSizes.length)];
        // calculate sum of aliceSizes
        int SumA = 0; int SumB = 0;
        for(int i=0;i<aliceSizes.length;i++){
            SumA += aliceSizes[i];
        }
        // calculate sum of bobSizes
        for(int i=0;i<bobSizes.length;i++){
            SumB += bobSizes[i];
        }
        // Calculate the index where they both are equal after swapping of candies
        for(int i=0;i<aliceSizes.length;i++){
            for(int j=0;j<bobSizes.length;j++){
                if(SumA-aliceSizes[i]+bobSizes[j]==SumB-bobSizes[j]+aliceSizes[i]){
                    return new int[] {aliceSizes[i],bobSizes[j]};
                }
            }
        }
        return new int[0];
    }
}
