import javax.swing.*;

import java.awt.*;

import static java.lang.Math.abs;

class Knight extends Piece
{
    public Knight(boolean w)
        {
            if (w)
            {
                icon = new ImageIcon("wknight.gif");
                isW = true;
                color = Color.white;
            }
            else
            {
                icon = new ImageIcon("bknight.gif");
                isW = false;
                color = Color.black;
            }
        }



    boolean canMove()
    {
        int x = abs(BoardMouseListener.startx-BoardMouseListener.endx);
        int y = abs(BoardMouseListener.starty-BoardMouseListener.endy);

        if ((x==2 && y==1) || (x==1 && y==2))
        {
            return true;
        }
//        else if (Chess.position[BoardMouseListener.startx][BoardMouseListener.starty].color==Chess.position[BoardMouseListener.endx][BoardMouseListener.endy].color)
//        {
//            return false;
//        }
        else
        {
            return false;
        }
    }
}