import javax.swing.*;
import java.awt.*;

abstract class Piece
{
        ImageIcon icon;
        Boolean isW;
        Color color;

        public Piece()
        {
        }
        abstract boolean canMove();

        void drawPiece(int x, int y, Graphics g)
        {
            g.drawImage(icon.getImage(),x*44,y*44,null);
        }
}