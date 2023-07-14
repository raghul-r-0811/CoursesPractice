package Recursion;

import java.io.PrintStream;

public class _8QueensBacktracking {
    public static final boolean available = true;
    public static final int squares =4;
    public static final int norm = squares - 1;
    public static int[] positionInRow = new int [squares];
    public static boolean[] column = new boolean[squares];
    public static boolean[] leftDiagonal = new boolean[squares * 2 - 1];
    public static boolean[] rigthDiagonal = new boolean[squares * 2 - 1];
    public static int howMany = 0;

    public static void Queens(){
        for(int i = 0; i < squares; i++){
            positionInRow[i] = -1;
            column[i] = available;
        }
        for(int i = 0; i < squares * 2 - 1; i++){
            leftDiagonal[i] = rigthDiagonal[i] = available;
        }
    }
    void PrintBoard(PrintStream out){

    }

    void PutQueen(int row){
        for(int col = 0; col< squares; col++){

            if( column[col] == available    &&      leftDiagonal[row+col] == available      &&       rigthDiagonal[row- col +norm] == available)
            {
                positionInRow[row] = col;
                column[col] = !available;
                leftDiagonal[row+col] = !available;
                rigthDiagonal[row- col +norm] = !available;

                if(row < squares-1){
                    PutQueen(row+1);
                }
                else {
                    PrintBoard(System.out);
                    }
                column[col] = available;
                leftDiagonal[row+col] = available;
                rigthDiagonal[row-col+norm] = available;
            }

            }
        }

    public static void main(String[] args) {
        _8QueensBacktracking queens = new _8QueensBacktracking();
        queens.PutQueen(4);
        System.out.println(queens +" solutions found");
    }
    }

