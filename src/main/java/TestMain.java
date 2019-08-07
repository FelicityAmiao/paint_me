import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class First extends Frame {
    First() {
        TextArea text = new TextArea(5,20);
        add(text);
        setBounds(800, 340, 400, 400);
        setTitle("Pretty Novel Note Book");
        setLayout(new FlowLayout());//no layout manager
        setVisible(true);//now frame will be visible, by default not visible

        //set close window event listening
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String args[]) {
        First f = new First();
    }
}