import javax.swing.*;

import java.awt.*;

import static java.lang.Math.abs;

class Pawn extends Piece
{
    public Pawn(boolean w)
    {
        if(w)
        {
            icon = new ImageIcon("wpawn.gif");
            isW = true;
            color = Color.white;
        }
        else
        {
            icon = new ImageIcon("bpawn.gif");
            isW = false;
            color = Color.black;
        }
    }

    boolean canMove()
    {
        int x = abs(BoardMouseListener.startx-BoardMouseListener.endx);
        int y = abs(BoardMouseListener.starty-BoardMouseListener.endy);
        int num_moves= 0;
        if (x!=0 || y>2)
        {
            return false;
        }
//        else if (Chess.position[BoardMouseListener.startx][BoardMouseListener.starty].color==Chess.position[BoardMouseListener.endx][BoardMouseListener.endy].color)
//        {
//            System.out.println("Same color");
//            return false;
//        }
        else
        {
            num_moves = num_moves +1;
            return true;
        }
    }
}
