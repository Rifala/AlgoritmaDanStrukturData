import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener extends Frame implements KeyListener {
    //pada Frame tekan alt + enter pilih import class
    //pada KeyListener tekan alt+enter pilih implement method
    Label l;
    TextArea area;

    KeyboardListener(){
        l = new Label();
        l.setBounds(20,50,200,20);                        //set location/size(maybe?) of label

        area = new TextArea();                                              //creating text area
        area.setBounds(20,80,300,300);                    //setting the location of text area
        area.addKeyListener(this);                                       //adding KeyListener to the text area

        //menambahkan label dan text area ke frame
        add(l);
        add(area);

        //setting frame
        setTitle("Keyboard Listener");
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        String text = area.getText();

        //splitting the string in words
        String words[] = text.split("\\s");

        //printing the number of words and characters of the string
        l.setText ("Words: " + words.length + "Characters:" + text.length());
    }

    public static void main(String[] args) {
        new KeyboardListener();
    }
}
