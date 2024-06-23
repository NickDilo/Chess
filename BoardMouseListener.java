import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
public class BoardMouseListener implements MouseListener
{
    Random random = new Random();

    // Initialize integers for selected positions upon mouse press and release
    public static int startx;
    public static int endx;
    public static int starty;
    public static int endy;

    public void mouseClicked(MouseEvent e)
    {
//        System.out.println("Mouse clicked. ");
    }


    // When mouse is pressed, initial position is gathered
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed. ");
        startx = (e.getX()-7)/44;
        starty = (e.getY()-30)/44;
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released. ");
        // Position of mouse release gathered
        endx = (e.getX()-7)/44;
        endy = (e.getY()-30)/44;

            // Code for player

        // Check that end position is on board
        if((startx<0 || startx>7) || (starty<0 || starty>7) || (endx<0 || endx>7) || (endy<0 || endy>7))
        {
            return;
        }
        // Check that end position is different from start position
        else if ((startx==endx) && (starty==endy))
        {
            return;
        }
        // Check that start position is not null (make sure there is a piece at start position)
        else if (Chess.position[startx][starty]==null)
        {
            return;
        }
        // Check that end position does not contain a piece of the same color
//        else if (Chess.position[endx][endy].isW)
//        {
//            System.out.println("White");
//            return;
//        }
        // Check for valid move
        else if (!Chess.position[startx][starty].canMove())
        {
            startx=0;
            starty=0;
            return;
        }
        else
        {
            // Sets new position for moved piece and repaints window
            Chess.position[endx][endy] = Chess.position[startx][starty];
            Chess.position[startx][starty] = null;
            Chess.window.repaint();
        }

            // Code for robot

        // loops until a valid move is made
        while (true)
        {
            // Sets random start and end positions
            startx = random.nextInt(0,7);
            starty = random.nextInt(0,7);
            endx = random.nextInt(0,7);
            endy = random.nextInt(0,7);

            // Check for a piece in start position
            if(Chess.position[startx][starty]==null)
            {
                continue;
            }
            // Check that end position is not same as start position
            else if (startx==endx & starty==endy)
            {
                continue;
            }
            // Check for valid piece move
            else if (!Chess.position[startx][starty].canMove())
            {
                continue;
            }
            // Changes position of selected piece, repaints window, breaks loop
            else
            {
                Chess.position[endx][endy] = Chess.position[startx][starty];
                Chess.position[startx][starty] = null;
                Chess.window.repaint();
                return;
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        System.out.println("Mouse entered. ");
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        System.out.println("Mouse exited. ");
    }
}
