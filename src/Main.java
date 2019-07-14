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
class ts extends shape{
    ts(){
        obj[1][0]='#';
        obj[1][1]='#';
        obj[1][2]='#';
        obj[2][1]='#';

    }

}
class ls extends shape{
    ls(){
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
}
