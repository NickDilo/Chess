import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
public class BoardMouseListener implements MouseListener
{
    Random random = new Random();
    public static int startx;
    public static int endx;
    public static int starty;
    public static int endy;
    @Override
    public void mouseClicked(MouseEvent e)
    {
//        System.out.println("Mouse clicked. ");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed. ");
        startx = (e.getX()-7)/44;
        starty = (e.getY()-30)/44;
        System.out.println(Chess.position[startx][starty].isW);
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released. ");
        endx = (e.getX()-7)/44;
        endy = (e.getY()-30)/44;
        if((startx<0 || startx>7) || (starty<0 || starty>7) || (endx<0 || endx>7) || (endy<0 || endy>7))
        {
            return;
        }
        else if ((startx==endx) && (starty==endy))
        {
            return;
        }
        else if (Chess.position[startx][starty]==null)
        {
            return;
        }
        else if (Chess.position[endx][endy].isW)
        {
            System.out.println("White");
            return;
        }
        else if (!Chess.position[startx][starty].canMove()) {
            return;
        }
        else
        {
            Chess.position[endx][endy] = Chess.position[startx][starty];
            Chess.position[startx][starty] = null;
            Chess.window.repaint();
        }

        while (true)
        {
            startx = random.nextInt(0,7);
            starty = random.nextInt(0,7);
            endx = random.nextInt(0,7);
            endy = random.nextInt(0,7);
            if(Chess.position[startx][starty]==null)
            {
                continue;
            }
            else if (startx==endx & starty==endy)
            {
                continue;
            }
            else if (!Chess.position[startx][starty].canMove())
            {
                continue;
            }
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
