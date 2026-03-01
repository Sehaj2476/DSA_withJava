class Solution {
    public int maxProfit(int[] prices) {
        int bp1 = Integer.MIN_VALUE;
        int bp2 = Integer.MIN_VALUE;
        int sp1 = 0;
        int sp2 = 0;
        for(int i=0;i<prices.length;i++){
            bp1 = Math.max(bp1, -prices[i]);
            sp1 = Math.max(sp1, bp1+prices[i]);
            bp2 = Math.max(bp2, sp1 -prices[i]);
            sp2 = Math.max(sp2, bp2+prices[i]);
        }
        return sp2;
    }
}
