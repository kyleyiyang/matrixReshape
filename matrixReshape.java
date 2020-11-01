class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if (row*col>r*c) return nums;
        else if (row==r && c>=col) return nums;
        else if (row*col%r!=0) return nums;
        else if (c>(int)row*col/r) return nums;
        else {
            
            int[] temp = new int[row*col];
            int ind = 0;
            for (int i=0; i<row; i++) {
                for (int j=0; j<col; j++) {
                    temp[ind]=nums[i][j];
                    ind++;
                }
            }
            int[][] out=new int[r][c];
            ind=0;
            for (int k=0; k<r; k++) {
                for (int l=0; l<c; l++) {
                    out[k][l]=temp[ind];
                    ind++;
                }
            }
        
        return out;
        }
    }
}
