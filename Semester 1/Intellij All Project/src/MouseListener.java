import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseListener extends MouseMotionAdapter {
    Frame f;

    MouseListener() {
        //creating the frame with the title
        f = new Frame("Mouse Motion Adapter");

        //adding MouseMotionListener to the Frame
        f.addMouseMotionListener(this);

        //setting the size, layout and visibility of the frame
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(),e.getY(),20,20);
    }

    public static void main(String[] args) {
        new MouseListener();
    }
}
