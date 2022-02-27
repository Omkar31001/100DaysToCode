class Solution {
    public boolean exist(char[][] board, String word) {
         for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0))
                    if(wordSearch(board,i,j, new boolean[board.length][board[0].length],word,0))
                        return true;
            }
        }
        return false;
    }
      static boolean wordSearch(char[][] board,int row,int col,boolean[][] visited,String word,int index){
        if(index==word.length()){
            return true;
        }
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || visited[row][col]) {
            return false;
        }
         if(board[row][col]==word.charAt(index)){
             visited[row][col] = true;
             if(wordSearch(board,row+1,col,visited,word,index+1)){
                 return true;
             }
             if(wordSearch(board,row-1,col,visited,word,index+1)){
                 return true;
             }
             if(wordSearch(board,row,col+1,visited,word,index+1)){
                 return true;
             }
             if(wordSearch(board,row,col-1,visited,word,index+1)){
                 return true;
             }
             visited[row][col] = false;
         }
         return false;

    }
}
    
 