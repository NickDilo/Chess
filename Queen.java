import javax.swing.*;

import java.awt.*;

import static java.lang.Math.abs;

class Queen extends Piece
{
    public Queen(boolean w)
    {
        // Calls correct icon file based on bool w and sets color
        if (w)
        {
            icon = new ImageIcon("wqueen.gif");
            isW = true;
            color = Color.white;
        }
        else
        {
            icon = new ImageIcon("bqueen.gif");
            isW = false;
            color= Color.black;
        }
    }

    //Checks for valid move from queen
    boolean canMove()
    {
        int x = abs(BoardMouseListener.startx-BoardMouseListener.endx);
        int y = abs(BoardMouseListener.starty-BoardMouseListener.endy);

        if ((x!=y && (x>0 && y>0)))
        {
            return false;
        }
//        else if (Chess.position[BoardMouseListener.startx][BoardMouseListener.starty].color==Chess.position[BoardMouseListener.endx][BoardMouseListener.endy].color)
//        {
//            return false;
//        }
        else
        {
            return true;
        }

    }
}