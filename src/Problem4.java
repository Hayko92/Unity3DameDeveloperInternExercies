import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem4 {
    public static void main(String[] args) {
        int[][] test =       {{0,0,0,0,0},
                              {0,0,0,1,0},
                              {0,0,1,1,1},
                              {0,0,1,1,1},
                              {1,0,1,1,1},
                              {1,1,1,1,1},};
        System.out.println("before moving=================");
        for (int i = 0; i < test.length ; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.print(test[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("after moving===================");
  moveDown(test,6,5);
    }

    static void moveDown(int[][] board, int height, int width) {
       // board = new int[height][width];
        //moving blocks down
        for (int i = 0; i < height-1 ; i++) {
            for (int j = 0; j < width; j++) {
               if(board[i][j]==1&&board[i+1][j]==0) {
                   board[i][j] = 0;
                   board[i+1][j] = 1;
               }
            }
        }
        // checking is there ara full lines in board
        for (int i = height-1; i >=0 ; i--) {
          boolean isFull = true;
             for(int x: board[i]) {
                 if(x!=1) isFull = false;
             }
             // removing full line from the board and adding new new empty line
             if(isFull) {
          List<int[]> list = new ArrayList(Arrays.asList(board));
          list.remove(list.size()-1);
          int[] newLine = new int[width];
          Arrays.fill(newLine,0);
          list.add(0,newLine);
          board = list.toArray(new int[height][width]);
          i++;
             }
        }
        // just typing to check result visually))
        for (int i = 0; i <height ; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

}
