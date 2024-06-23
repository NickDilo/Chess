import javax.swing.*;

import java.awt.*;

import static java.lang.Math.abs;

class Rook extends Piece
{
    public Rook(boolean w)
    {
        if (w)
        {
            icon = new ImageIcon("wrook.gif");
            isW = true;
            color = Color.white;
        }
        else
        {
            icon = new ImageIcon("brook.gif");
            isW = false;
            color = Color.black;
        }
    }


    boolean canMove() {
        int x = abs(BoardMouseListener.startx - BoardMouseListener.endx);
        int y = abs(BoardMouseListener.starty - BoardMouseListener.endy);

        if (x > 0 && y > 0) {
            return false;
        }
//        else if (Chess.position[BoardMouseListener.startx][BoardMouseListener.starty].color==Chess.position[BoardMouseListener.endx][BoardMouseListener.endy].color) {
//            return false;
//        }
        else
        {
            return true;
        }
    }
}
