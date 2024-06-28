
import java.awt.*;
import java.awt.event.*;

public class Testinclass extends Frame {
    private TextField input1;
    private TextField input2;
    private TextField input3;
    private Label resultLabel;

    public Testinclass() {
        setTitle("Delta Calculator");
        setSize(400, 300);
        setLayout(null); // Using null layout for manual component positioning

        Label x1 = new Label("A :");
        Label x2 = new Label("B :");
        Label x3 = new Label("C :");
        x1.setBounds(30, 50, 50, 20);
        x2.setBounds(30, 100, 50, 20);
        x3.setBounds(30, 150, 50, 20);

        add(x1);
        add(x2);
        add(x3);

        input1 = new TextField();
        input2 = new TextField();
        input3 =new TextField();
        input1.setBounds(80, 50, 60, 20);
        input2.setBounds(80, 100, 60, 20);
        input3.setBounds(80, 150, 60, 20);
        add(input1);
        add(input2);
        add(input3);

        Button calculateBtn = new Button("Calculate");
        calculateBtn.setBounds(30, 200, 150, 30);
        add(calculateBtn);

        resultLabel = new Label("Delta: ");
        resultLabel.setBounds(30, 250, 200, 20);
        add(resultLabel);

        calculateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateDelta();
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    private void calculateDelta() {
        try {
            float x1 = Float.parseFloat(input1.getText());
            float x2 = Float.parseFloat(input2.getText());
            float x3 = Float.parseFloat(input3.getText());

            float delta = ((x2*x2)-(2*x1*x3));
            resultLabel.setText("Delta: " + delta);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input! Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        new Testinclass();
    }
}
