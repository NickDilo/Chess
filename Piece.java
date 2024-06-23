import javax.swing.*;
import java.awt.*;

abstract class Piece
{
        // Initializes ImageIcon for Piece subclasses
        ImageIcon icon;
        // Initializes Boolean to check color of selected piece
        Boolean isW;
        //
        Color color;

        public Piece()
        {
        }

        // Initializes abstract method to check for valid move from piece subclasses
        abstract boolean canMove();

        // Initializes method to draw pieces when called
        void drawPiece(int x, int y, Graphics g)
        {
            g.drawImage(icon.getImage(),x*44,y*44,null);
        }
}