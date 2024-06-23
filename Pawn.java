import javax.swing.*;

import java.awt.*;

import static java.lang.Math.abs;

class Pawn extends Piece
{
    // Calls correct icon file based on bool w and sets color
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
    // Checks for valid move from pawn
    boolean canMove()
    {
        int x = abs(BoardMouseListener.startx-BoardMouseListener.endx);
        int y = abs(BoardMouseListener.starty-BoardMouseListener.endy);
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
            return true;
        }
    }
}
