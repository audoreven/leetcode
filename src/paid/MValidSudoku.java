package paid; //https://leetcode.com/problems/valid-sudoku/

// paid 4/25

import java.util.*;

public class MValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> all=new HashSet<>();
        // hori
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                if (Character.isDigit(board[i][j])) {
                    if (all.contains(i+"("+board[i][j]+")") ||
                            all.contains("("+board[i][j]+")"+j) ||
                            all.contains(i/3+"("+board[i][j]+")"+j/3)) {
                        return false;
                    }
                    all.add(i+"("+board[i][j]+")");
                    all.add("("+board[i][j]+")"+j);
                    all.add(i/3+"("+board[i][j]+")"+j/3);
                }
            }
        }
        return true;
    }

    // opt
    public boolean opt(char[][] board) {
        for(int i = 0; i<9; i++){
            HashSet<Character> rows = new HashSet<Character>();
            HashSet<Character> columns = new HashSet<Character>();
            HashSet<Character> cube = new HashSet<Character>();
            for (int j = 0; j < 9;j++){
                if(board[i][j]!='.' && !rows.add(board[i][j]))
                    return false;
                if(board[j][i]!='.' && !columns.add(board[j][i]))
                    return false;
                int RowIndex = 3*(i/3);
                int ColIndex = 3*(i%3);
                if(board[RowIndex + j/3][ColIndex + j%3]!='.' && !cube.add(board[RowIndex + j/3][ColIndex + j%3]))
                    return false;
            }
        }
        return true;
    }

}
