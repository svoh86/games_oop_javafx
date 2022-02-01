package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (monoHorizontal(board) || monoVertical(board))) {
                return true;
            }
        }
        return false;
    }

    public static boolean monoHorizontal(int[][] board) {
        boolean rsl = false;
        for (int[] row : board) {
            if (row[0] == 1) {
                for (int j = 1; j < board.length; j++) {
                    rsl = row[j] == 1;
                }
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(int[][] board) {
        boolean rsl = false;
        for (int j = 0; j < board.length; j++) {
            if (board[0][j] == 1) {
                for (int i = 1; i < board.length; i++) {
                    if (board[i][j] == 1) {
                        rsl = true;
                    }
                }
                break;
            }
        }
        return rsl;
    }
}
