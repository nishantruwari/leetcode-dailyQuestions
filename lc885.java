lass Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] res = new int[rows * cols][2];
        int[][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int d = 0;
        int steps = 0;
        int flag = 0;
        res[flag][0] = rStart;
        res[flag][1] = cStart;
        flag=1;

        while (flag != rows * cols) {
            if (d == 0 || d == 2)
                steps++;
            for (int count = 0; count < steps; count++) {
                rStart += dir[d][0];
                cStart += dir[d][1];
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    res[flag][0] = rStart;
                    res[flag][1] = cStart;
                    ++flag;
                }
            }
            d = (d + 1) % 4;

        }
        return res;

    }
}