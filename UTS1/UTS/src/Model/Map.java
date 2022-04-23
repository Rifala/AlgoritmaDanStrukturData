package Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Map extends JPanel implements ActionListener {

    private Dimension d;
    private Boolean inGame = false;
    private Boolean mati = false;

    private final int block_Size = 20;
    private final int jmlTitik = 10;
    private final int screenSize = block_Size * jmlTitik;

    private int ghost = 4;
    private int score;
    private int []dx,dy;
    private int []ghost_x,ghost_y,ghost_dx,ghost_dy;

    private int food = 3;
    private int[]food_x,food_y;

    private Image up,down,left,right;

    private int pacman_x;
    private int pacman_y;
    private int pacman_dx;
    private int pacman_dy;
    private int req_dx;
    private int req_dy;

    private Timer timer;


    private final short map[] = {
      1,1,1,1,1,0,0,0,0,1,
      1,1,0,1,1,1,1,1,1,1,
      1,1,0,1,1,1,1,1,1,1,
      1,1,0,1,1,1,1,0,1,1,
      1,1,1,1,1,1,1,0,1,1,
      0,0,0,0,0,1,1,0,1,1,
      1,1,0,1,1,1,1,0,1,1,
      1,1,0,1,1,1,1,1,1,1,
      1,1,0,1,1,0,0,0,0,1,
      1,1,1,1,1,1,1,1,1,1
    };


    private void variable(){
        d = new Dimension(400,400);
        ghost_x = new int[ghost];
        ghost_y = new int[ghost];
        ghost_dx = new int[ghost];
        ghost_dy = new int[ghost];
        dx = new int[4];
        dy = new int[4];

        timer = new Timer(30,this);
        timer.restart();
    }

    private void game(){
        ghost = 4;
        score = 0;

        pacman_x = 7 * block_Size;
        pacman_y = 6 * block_Size;
        pacman_dx = 0;
        pacman_dy = 0;
    }

    private void food(){
        int random;

        for (int i=0 ; i<food; i++){
            food_x[i] = 3 * block_Size;
            food_y[i] = 3 * block_Size;

            random = (int) Math.random() * food;
            if (random > food){
                random = food;
            }
        }
    }

    class TAdapter extends KeyAdapter{
        public void KeyPressed(KeyEvent e){
            int key = e.getKeyCode();

            if (inGame){
                if (key == KeyEvent.VK_LEFT){
                    req_dx = -1;
                    req_dy = 0;
                }
                else if(key == KeyEvent.VK_RIGHT){
                    req_dx = 1;
                    req_dy = 0;
                }
                else if(key == KeyEvent.VK_UP){
                    req_dx = 0;
                    req_dy = -1;
                }
                else if(key == KeyEvent.VK_DOWN){
                    req_dx = 0;
                    req_dy = 1;
                }
                else if(key == KeyEvent.VK_ESCAPE && timer.isRunning()){
                    inGame = false;
                }
            }else {
                if (key == KeyEvent.VK_SPACE){
                    inGame = true;
                    game();
                }
            }
        }
    }


    public Map(){
        addKeyListener(new TAdapter());
        variable();
        game();
        food();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
