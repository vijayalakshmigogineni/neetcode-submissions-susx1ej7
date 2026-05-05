class Solution {
    public static boolean checkRow(int i,char[][] board){
       HashSet<Character> dup = new HashSet<>();
        for(int j = 0;j<9;j++){
            char ch = board[i][j];

            if(ch!='.'){
                if(dup.contains(ch)) {
                    return false;}
                    dup.add(ch);
                }

        }
        return true;
    }
    public static boolean checkCol(int j,char[][] board){
        int len = board.length;
        HashSet<Character> dup = new HashSet<>();

        for(int i = 0;i<len;i++){
            char ch = board[i][j];
            if(ch!='.'){
                 if(dup.contains(board[i][j])) return false;
            dup.add(ch);
            }

        }
        return true;
    }
    public static boolean checkSub(int startRow ,int startCol,char[][] board){
        int len = board.length;
        HashSet<Character> dup = new HashSet<>();
        for(int i = startRow;i<startRow+3;i++){
            for(int j = startCol;j<startCol+3;j++){
                char ch = board[i][j];
                if(ch!='.'){
                    if(dup.contains(ch)) return false;
                    dup.add(ch);  
                }
            }
        }
        return true;

    }
    public boolean isValidSudoku(char[][] board) {

        //check all the rows
        for(int i = 0;i<9;i++){
            if(!checkRow(i,board)) return false;
        }
        //check all the cols
        for(int j = 0;j<9;j++){
            if(!checkCol(j,board)) return false;
        }
        //check for all the subgrids
        for(int i = 0;i<9;i+=3){
            for(int j = 0;j<9;j+=3){
                if(!checkSub(i,j,board)) return false;
            }
        }
        return true;
        
    }
}
