class Solution {
    public int diagonalSum(int[][] mat) {
        int ps = 0;
        int sd = 0;
        for(int i=0;i<mat.length;i++){
                    ps+= mat[i][i];
                    if(i!=mat.length-1-i)
                        sd+= mat[i][mat.length-1-i];
                
        }
        return ps+sd;
    }
}
