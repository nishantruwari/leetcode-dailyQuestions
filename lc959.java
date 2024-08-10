class Solution {
    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        int[][] newgrid = new int[n * 3][n * 3];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                char ch = grid[r].charAt(c);

                if (ch == '/') {

                    newgrid[r * 3][c * 3 + 2] = 1;
                    newgrid[r * 3 + 1][c * 3 + 1] = 1;
                    newgrid[r * 3 + 2][c * 3] = 1;
                } else if (ch == '\\') {
                    newgrid[r * 3][c * 3] = 1;
                    newgrid[r * 3 + 1][c * 3 + 1] = 1;
                    newgrid[r * 3 + 2][c * 3 + 2] = 1;
                }

            }
        }

        int res = 0;
        for (int r = 0; r < n*3; r++) {
            for (int c = 0; c < n*3; c++) {
                if (newgrid[r][c] == 0) {
                    ++res;
                    dfs(newgrid, r, c, n * 3);
                }
            }
        }
        return res;

    }

    private void dfs(int[][] grid, int r, int c, int N) {
        if (r < 0 || c < 0 || r >= N || c >= N || grid[r][c] == 1) {
            return;
        }
        grid[r][c] = 1;
        dfs(grid, r + 1, c, N);
        dfs(grid, r - 1, c, N);
        dfs(grid, r, c + 1, N);
        dfs(grid, r, c - 1, N);
    }
}