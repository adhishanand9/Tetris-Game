import java.lang.*;
import java.util.*;

class shape{
    char [][] obj=new char[4][4];
    shape(){
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                obj[i][j]=' ';
            }
        }
    }
    void clear(){
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                obj[i][j]=' ';
            }
        }
    }
    void display(){
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(obj[i][j]);
            }
            System.out.println();
        }
    }

}
class line extends shape{
   line(){
       obj[0][2]='#';
       obj[1][2]='#';
       obj[2][2]='#';
       obj[3][2]='#';

   }
   void rotate(){
        clear();
        obj[1][0]='#';
        obj[1][1]='#';
        obj[1][2]='#';
        obj[1][3]='#';
    }

}
class square extends shape{
    square(){
        obj[0][0]='#';
        obj[0][1]='#';
        obj[1][0]='#';
        obj[1][1]='#';

    }
}
class tshape extends shape{
    tshape(){
        obj[1][0]='#';
        obj[1][1]='#';
        obj[1][2]='#';
        obj[2][1]='#';

    }

}
class lshape extends shape{
    lshape(){
        obj[1][1]='#';
        obj[2][1]='#';
        obj[3][1]='#';
        obj[3][2]='#';
    }
}
class zig extends shape{
    zig(){
        obj[0][1]='#';
        obj[1][1]='#';
        obj[1][2]='#';
        obj[2][2]='#';
    }
    void rotate(){
        clear();
        obj[2][1]='#';
        obj[1][1]='#';
        obj[1][2]='#';
        obj[2][0]='#';
    }
}
public class Main {

    public static char board[][] = new char[30][70];
    public static void main(String[] args)
    {
        createBoard();
        displayBoard();
        int rows=30;
        int columns=70;
        int flag = randomshape();
        int location = randomlocation(columns-10);
        if(flag==0)
        {
            line l = new line();
            l.createline(location);
            l.PutLineOnBoard(board, board_rows, board_cols);
        }
        else if(flag==1)
        {
            square sq = new square();
            sq.createsquare(location);
            sq.PutSquareOnBoard(board, board_rows, board_cols);
        }
        else if(flag==2)
        {
            tshape ts = new tshape();
            ts.createT(location);
            ts.PutTshapeOnBoard(board, board_rows, board_cols);
        }
        else if(flag==3)
        {
            zig ss = new zig();
            ss.createS(location);
            ss.PutSshapeOnBoard(board, board_rows, board_cols);
        }
        else
        {
            lshape ls = new lshape();
            ls.createL(location);
            ls.PutLshapeOnBoard(board, board_rows, board_cols);
        }
    }
    private static void createBoard(){
        for(int i=0;i<30;i++){
            for(int j=0;j<70;j++){
                if(i==0 || j==0 ||i==29 ||j==69){
                    board[i][j]='*';
                }
                else{
                    board[i][j]=' ';
                }
            }
        }
    }
    private static void displayBoard(){
        for(int i=0;i<30;i++)
        {
            for(int j=0;j<70;j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    static int randomshape()
    {
        Random random = new Random();
        return random.nextInt(5);
    }
    static int randomlocation(int range)
    {
        Random random = new Random();
        return random.nextInt(range);
    }
}
