import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

public class Chess {
    public static Piece[][] position = new Piece[8][8];
    public static JFrame window = new JFrame();
    public static Board_Component boardComponent;

    public static void main(String[] args) {

//        JFrame window = new JFrame();
        window.setSize(370 , 395);
        Board_Component boardComponent;
        boardComponent = new Board_Component();
        window.add(boardComponent);
        window.setVisible(true);
        window.repaint();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        position[0][0] = new Rook(false);
        position[1][0] = new Knight(false);
        position[2][0] = new Bishop(false);
        position[3][0] = new King(false);
        position[4][0] = new Queen(false);
        position[5][0] = new Bishop(false);
        position[6][0] = new Knight(false);
        position[7][0] = new Rook(false);
        position[0][1] = new Pawn(false);
        position[1][1] = new Pawn(false);
        position[2][1] = new Pawn(false);
        position[3][1] = new Pawn(false);
        position[4][1] = new Pawn(false);
        position[5][1] = new Pawn(false);
        position[6][1] = new Pawn(false);
        position[7][1] = new Pawn(false);
        position[0][6] = new Pawn(true);
        position[1][6] = new Pawn(true);
        position[2][6] = new Pawn(true);
        position[3][6] = new Pawn(true);
        position[4][6] = new Pawn(true);
        position[5][6] = new Pawn(true);
        position[6][6] = new Pawn(true);
        position[7][6] = new Pawn(true);
        position[0][7] = new Rook(true);
        position[1][7] = new Knight(true);
        position[2][7] = new Bishop(true);
        position[3][7] = new King(true);
        position[4][7] = new Queen(true);
        position[5][7] = new Bishop(true);
        position[6][7] = new Knight(true);
        position[7][7] = new Rook(true);

        for(int x=0; x<8; x=x+1)
        {
            for(int y=2; y<6; y=y+1)
            {
                position[x][y] = null;
            }
        }
        System.out.println(Arrays.deepToString(position[2]));
        window.addMouseListener(new BoardMouseListener());
    }
}