class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
          int m = mat.length, n = mat[0].length;
        if(m*n!= r*c)
            return mat;
        int[] temp = new int[m*n];
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               temp[k++] = mat[i][j]; 
            }
        }
        int[][] res = new int[r][c];
        int l=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               res[i][j] = temp[l++]; 
            }
        }
        return res;
    }
}