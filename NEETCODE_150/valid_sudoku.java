class Solution {

    private boolean isValidBox(int row,int col,char val,char[][] board){

        int n = board.length;
        int m = board[0].length;

        for(int i=0;i<m;i++){
            if(i!=col && board[row][i]==val)return false;
        }

        for(int i=0;i<n;i++){
            if(i!=row && board[i][col]==val)return false;
        }

        int br = row;
        int bc = col;

        if(row<3)br = 0;
        else if(row<6)br = 3;
        else br = 6;

        if(col<3)bc = 0;
        else if(col<6)bc = 3;
        else bc = 6;

        for(int i=br;i<br+3;i++){
            for(int j=bc;j<bc+3;j++){
                if((i!= row || j!=col) && board[i][j]==val)return false;
            }
        }

        return true;

    }
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]>='1' && board[i][j]<='9'){
                    if(!isValidBox(i, j, board[i][j], board))return false;
                }
            }
        }

        return true;
    }
}


Approach :- We can use a helper function to check if the current cell is valid.


Time Complexity :- O(n^2)
Space Complexity :- O(1)








