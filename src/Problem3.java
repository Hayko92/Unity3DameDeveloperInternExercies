public class Problem3 {
    public static void main(String[] args) {
        System.out.println(minMoves(1 ,3 ,1 ,5, 6, 8 ));
    }
    static int minMoves (int x1, int y1, int x2, int y2, int x3, int y3) {

// checking possibility to solve problem
// problem can not be solved if one figure one the black square and others on the white

        //first figure is on the white square
        if(x1%2==1^y1%2==1) {
         if((!(x2%2==1^y2%2==1))||(!(x3%2==1^y3%2==1))) return -1;
         //first figure on the black square
        } else {
            if((x2%2==1^y2%2==1)||(x3%2==1^y3%2==1)) return -1;
        }
        // max steps = 4
        int steps = 4;

        //going to north-west direction to check if there any figure on one line
        for (int i = x1, j =y1; i <=8&&j<=8&&i>0&j>0 ; i--,j++) {
           if((i==x2&&j==y2)||(i==x3&&j==y3)) {
               steps--;
           }
        }
        //going to north-east direction to check if there any figure on one line
        for (int i = x1, j =y1; i <=8&&j<=8&&i>0&j>0 ; i++,j++) {
            if((i==x2&&j==y2)||(i==x3&&j==y3)) {
                steps--;
            }
        }
        //going to south-east direction to check if there any figure on one line
        for (int i = x1, j =y1; i <=8&&j<=8&&i>0&j>0 ; i++,j--) {
            if((i==x2&&j==y2)||(i==x3&&j==y3)) {
                steps--;
            }
        }
        //going to south-west direction to check if there any figure on one line
        for (int i = x1, j =y1; i <=8&&j<=8&&i>0&j>0 ; i--,j--) {
            if((i==x2&&j==y2)||(i==x3&&j==y3)) {
                steps--;
            }
        }

 return steps;
    }
}
