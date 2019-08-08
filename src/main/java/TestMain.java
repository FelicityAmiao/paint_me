import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static com.note_book.common.Constance.*;

class TestMain extends Frame {

    TestMain() {
        TextArea text = getTextArea();
        add(text);

        JButton button = getSubmitButton(text);
        add(button);

        configNoteBookNormalInfo();
        setLayout();
        closeWindow();
    }

    private void setLayout() {
        setLayout(new FlowLayout());
    }

    private void configNoteBookNormalInfo() {
        setBounds(NOTE_BOOK_POSITION_X, NOTE_BOOK_POSITION_Y, NOTE_BOOK_WIDTH, NOTE_BOOK_HEIGHT);
        setTitle(NOTE_BOOK_TITLE);
        setVisible(true);
    }

    private JButton getSubmitButton(TextArea text) {
        JButton button = new JButton(SUBMIT_BUTTON_NAME);
        button.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        button.addActionListener(e -> System.out.println(text.getText()));
        return button;
    }

    private TextArea getTextArea() {
        return new TextArea(TEXT_ROWS, TEXT_COLS);
    }

    private void closeWindow() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String args[]) {
        TestMain f = new TestMain();
    }
}