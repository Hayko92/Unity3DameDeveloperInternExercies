public class Problem4 {
    public static void main(String[] args) {

    }

    static void moveDown(int[][] board, int height, int width) {
        board = new int[height][width];
        //moving blocks down
        for (int i = 0; i < height-1 ; i++) {
            for (int j = 0; j < width; j++) {
               if(board[i][j]==1&&board[i+1][j]==0) {
                   board[i][j] = 0;
                   board[i+1][j] = 1;
               }
            }
        }
        for (int i = 0; i <height ; i++) {
            for (int j = 0; j <width ; j++) {
                if (board[i][j])
            }
        }

    }
}
