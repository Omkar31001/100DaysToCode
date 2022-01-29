class Solution {
    public boolean isValidSudoku(char[][] board) {
       HashSet<String> values = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char current = board[i][j];
                if(current!='.'){
                     if(!values.add(current + "found in row" + i) || !values.add(current + "found in col" + j) || !values.add(current + "found in subox" + i/3 + "-" +  j/3) ){
                         return false;
                     }
                }
               
            }
        }
        return true;
    }
}