
package gameoflifeproject;

/**
 *
 * @author jambo
 */
public class GameOfLifeProject {
//system class GameOfLife {
   static int countcells(int[][] board, int x, int y) {
        int count = 0;
        int[][] cells =       {{x - 1, y - 1},
                               {x - 1, y    },
                               {x - 1, y + 1},
                               {x    , y - 1},
                               {x    , y + 1},
                               {x + 1, y - 1},
                               {x + 1, y    },
                               {x + 1, y + 1}};
        for (int i[]: cells) {
            try {
                if (board[i[0]][i[1]] == 1) {
                    count++;
                }
            }
            catch (ArrayIndexOutOfBoundsException ex) {}
        }
        return count;
    }

   static void printBoard(int[][] board) {
        for (int[] i: board) { //enhanced for loop
            for (int j: i) {
                if (j == 1) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] nextBoard =  {{0, 0, 0, 0, 0, 0, 0, 1, 0,0},
                              {0, 0, 0, 0, 0, 0, 0, 0, 0,0},
                              {0, 0, 0, 0, 0, 0, 0, 0, 0,0},
                              {0, 0, 0, 1, 0, 1, 0, 0, 0,0},
                              {1, 0, 1, 1, 1, 1, 1, 0, 0,0},
                              {0, 0, 0, 1, 0, 0, 1, 0, 0,0},
                              {0, 0, 0, 0, 0, 0, 0, 0, 0,0},
                              {0, 0, 0, 0, 0, 0, 0, 0, 0,0},
                              {0, 0, 0, 0, 0, 0, 0, 0, 0,0},
                              {0, 0, 1, 0, 0, 0, 0, 0, 0,1},};
        int[][] board = new int[nextBoard.length][nextBoard[0].length];
        for (int gen = 0; gen < 25; gen++) {
            for (int i = 0; i < nextBoard.length; i++) {
                for (int j = 0; j < nextBoard[i].length; j++) {
                    board[i][j] = nextBoard[i][j];
                }
            }
            printBoard(board);
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == 1 && !(countcells(board, i, j) == 2 || countcells(board, i, j) == 3)) {
                        nextBoard[i][j] = 0;
                    }
                    else if    (board[i][j] == 0 && countcells(board, i, j) == 3) {
                        nextBoard[i][j] = 1;
                    }
                }
            }
        }
    }
}
    
    

