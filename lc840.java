class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int rowRound = grid.length - 2;
        int colRound = grid[0].length - 2;
        if (rowRound < 1)
            return 0;
        if (colRound < 1)
            return 0;
        int count = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;
        int sum7 = 0;
        int sum8 = 0;
        int flag=0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < rowRound; i++) {
            for (int j = 0; j < colRound; j++) {

                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; ++l) {
                        // if(set.contains(grid[k+i][l+j]))
                        if(grid[k+i][l+j]<1|| grid[k+i][l+j]>9){
                            flag=1;
                            break;
                        }
                        set.add(grid[k + i][l + j]);
                        if (k == 0) {
                            sum3 += grid[k + i][l + j];
                        }
                        if (k == 1) {
                            sum4 += grid[k + i][l + j];
                        }
                        if (k == 2) {
                            sum5 += grid[k + i][l + j];
                        }
                        if (l == 0) {
                            sum6 += grid[k + i][l + j];
                        }
                        if (l == 1) {
                            sum7 += grid[k + i][l + j];
                        }
                        if (l == 2) {
                            sum8 += grid[k + i][l + j];
                        }
                        if (k == l)
                            sum1 += grid[k + i][l + j];
                        if (l + k == 2)
                            sum2 += grid[k + i][j + l];

                    }
                }
                
                if (sum1 == sum2 && sum2 == sum3 && sum3 == sum4 && sum4 == sum5 && sum5 == sum6 && sum6 == sum7
                        && sum7 == sum8 && set.size() == 9&& flag!=1)
                    ++count;
                sum1 = sum2 = sum3 = sum4 = sum5 = sum6 = sum7 = sum8 = 0;
                set.clear();
                flag=0;

            }
        }

        return count;

    }
}