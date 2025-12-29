class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int ans[][] = new int[rows*cols][2];
        ans[0][0] = rStart;
        ans[0][1] = cStart;
        boolean[][] vis = new boolean[rows][cols];
        helper(rStart, cStart, rows, cols, ans, vis, 1, 1);
        return ans;
    }

    void helper(int curr_row, int curr_col, int rows, int cols, int[][] ans, boolean[][] vis, int count, int ind){        
        int row = curr_row;
        int col = curr_col;
        boolean flag = false;
        for(int i = 1; i <= count; i++){
            row = row;
            col = col + 1;
            if(col < cols && col >= 0 && row >= 0 && row < rows){
                flag = true;
                ans[ind][0] = row;
                ans[ind][1] = col;
                vis[row][col] = true;
                ind++;
            } 
        }

        for(int i = 1; i <= count; i++){
            row = row + 1;
            col = col;
            if(row < rows && row >= 0 && col >= 0 && col < cols){
                flag = true;
                ans[ind][0] = row;
                ans[ind][1] = col;
                vis[row][col] = true;
                ind++;
            }
        }
        count++;

        for(int i = 1; i <= count; i++){
            row = row;
            col = col - 1;
            if(col >= 0 && col < cols &&  row >= 0 && row < rows){
                flag = true;
                ans[ind][0] = row;
                ans[ind][1] = col;
                vis[row][col] = true;
                ind++;
            }
        }

        for(int i = 1; i <= count; i++){
            row = row - 1;
            col = col;
            if(row >= 0 && row < rows && col >= 0 && col < cols){
                flag = true;
                ans[ind][0] = row;
                ans[ind][1] = col;
                vis[row][col] = true;
                ind++;
            }
        }

        if(flag) helper(row, col, rows, cols, ans, vis, count + 1, ind);
    }
}