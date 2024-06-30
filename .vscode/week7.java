import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class week7 extends Frame {

    public week7() {
        setTitle("Testing");
        setSize(300, 150);

        // Setting layout manager (FlowLayout) explicitly
        setLayout(new FlowLayout());

        Label lbl = new Label("Name:");
        TextField txtField = new TextField(20);
        txtField.setEchoChar('*'); // Sets echo character to '*'

        add(lbl);
        add(txtField);

        // Window listener to handle window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new week7();
    }
}
