import javax.swing.*;

import java.awt.*;

import static java.lang.Math.abs;

class Bishop extends Piece
{
    public Bishop(boolean w)
    {
        if (w)
        {
            icon = new ImageIcon("wbishop.gif");
            isW = true;
            color = Color.white;
        }
        else
        {
            icon = new ImageIcon("bbishop.gif");
            isW = false;
            color = Color.black;
        }
    }


    boolean canMove()
    {
        int x = abs(BoardMouseListener.startx-BoardMouseListener.endx);
        int y = abs(BoardMouseListener.starty-BoardMouseListener.endy);

        if (x!=y)
        {
            return false;
        }
//        else if (Chess.position[BoardMouseListener.startx][BoardMouseListener.starty].color==Chess.position[BoardMouseListener.endx][BoardMouseListener.endy].color)
//        {
//              return false;
//        }
        else
        {
            return true;
        }
    }
}

