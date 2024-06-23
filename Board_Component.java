import javax.swing.*;
import java.awt.*;

public class Board_Component extends JComponent {
    public void paintComponent(Graphics g) {

        // Sets initial position and size for background squares
        int x_pos = 0;
        int y_pos = 0;
        int width = 50;
        int height = 50;
        // Sets initial colors for squares
        Color color_1 = new Color(233, 174, 95); //light
        Color color_2 = new Color(177, 113, 24); //dark


        // Sets correct color and position for each square
        for (int i = 0; i < 8; i = i + 1) {
            for (int j = 0; j < 8; j = j + 1) {
                if ((j % 2 == 0 && i % 2 == 0) || (j % 2 != 0 && i % 2 != 0)) {
                    g.setColor(color_1);
                    g.fillRect(x_pos, y_pos, width, height);
                } else {
                    g.setColor(color_2);
                    g.fillRect(x_pos, y_pos, width, height);
                }
                x_pos = x_pos + 44;
            }
            x_pos = 0;
            y_pos = y_pos + 44;

//            ImageIcon image;
//            image=new ImageIcon("wrook.gif");
//            g.drawImage(image.getImage(),0*44,7*44,null);

            // Calls method drawPiece for valid positions
            for (int x = 0; x < 8; x = x + 1) {
                for (int y = 0; y < 8; y = y + 1) {
                    if (Chess.position[x][y] != null) {
                        Chess.position[x][y].drawPiece(x, y, g);
                    }
                }
            }
        }
    }
}

