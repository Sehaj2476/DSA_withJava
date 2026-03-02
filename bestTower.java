class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {

        int[] ans = {-1, -1};
        int maxQuality = -1;

        for (int i = 0; i < towers.length; i++) {
            int x = towers[i][0];
            int y = towers[i][1];
            int quality = towers[i][2];

            int dis = Math.abs(x - center[0]) + Math.abs(y - center[1]);

            if (dis <= radius) {

                if (quality > maxQuality) {
                    maxQuality = quality;
                    ans[0] = x;
                    ans[1] = y;
                }
                else if (quality == maxQuality &&
                        (x < ans[0] || (x == ans[0] && y < ans[1]))) {
                    ans[0] = x;
                    ans[1] = y;
                }
            }
        }
        return ans;
    }
}
