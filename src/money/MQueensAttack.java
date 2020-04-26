package money; // https://leetcode.com/problems/queens-that-can-attack-the-king/

import java.util.*;

public class MQueensAttack {
    List<List<Integer>> ans=new ArrayList<List<Integer>>();

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        boolean[][] board=new boolean[8][8];
        for (int i=0; i<queens.length; i++) {
            board[queens[i][0]][queens[i][1]]=true;
        }
        // diags
        int i=king[0]; int j=king[1];
        while (i>0 && j>0) {
            i--; j--;
            if (board[i][j]) {
                ArrayList<Integer> add=new ArrayList<Integer>();
                add.add(i); add.add(j);
                ans.add((List) add.clone());
                break;
            }
        }
        i=king[0]; j=king[1];
        while (i<7 && j>0) {
            i++; j--;
            if (board[i][j]) {
                ArrayList<Integer> add=new ArrayList<Integer>();
                add.add(i); add.add(j);
                ans.add((List) add.clone());
                break;
            }
        }
        i=king[0]; j=king[1];
        while (i<7 && j<7) {
            i++; j++;
            if (board[i][j]) {
                ArrayList<Integer> add=new ArrayList<Integer>();
                add.add(i); add.add(j);
                ans.add((List) add.clone());
                break;
            }
        }
        i=king[0]; j=king[1];
        while (j<7 && i>0) {
            j++; i--;
            if (board[i][j]) {
                ArrayList<Integer> add=new ArrayList<Integer>();
                add.add(i); add.add(j);
                ans.add((List) add.clone());
                break;
            }
        }

        i=king[0]; j=king[1];
        while (j>0) {
            j--;
            if (board[i][j]) {
                ArrayList<Integer> add=new ArrayList<Integer>();
                add.add(i); add.add(j);
                ans.add((List) add.clone());
                break;
            }
        }
        i=king[0]; j=king[1];
        while (i>0) {
            i--;
            if (board[i][j]) {
                ArrayList<Integer> add=new ArrayList<Integer>();
                add.add(i); add.add(j);
                ans.add((List) add.clone());
                break;
            }
        }
        i=king[0]; j=king[1];
        while (i<7) {
            i++;
            if (board[i][j]) {
                ArrayList<Integer> add=new ArrayList<Integer>();
                add.add(i); add.add(j);
                ans.add((List) add.clone());
                break;
            }
        }
        i=king[0]; j=king[1];
        while (j<7) {
            j++;
            if (board[i][j]) {
                ArrayList<Integer> add=new ArrayList<Integer>();
                add.add(i); add.add(j);
                ans.add((List) add.clone());
                break;
            }
        }

        return ans;
    }

    // opt
    /*
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[][] seen = new boolean[8][8];
        for (int[] queen : queens) seen[queen[0]][queen[1]] = true;
        int[] dirs = {-1, 0, 1};
        for (int dx : dirs) {
            for (int dy : dirs) {
                if (dx == 0 && dy == 0) continue;
                int x = king[0], y = king[1];
                while (x + dx >= 0 && x + dx < 8 && y + dy >= 0 && y + dy < 8) {
                    x += dx;
                    y += dy;
                    if (seen[x][y]) {
                        result.add(Arrays.asList(x, y));
                        break;
                    }
                }
            }
        }
        return result;
    } */
}
