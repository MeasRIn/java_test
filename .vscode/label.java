
import java.awt.*;
import java.awt.event.*;

public class label extends Frame{
    private TextField textField;
    private Button btn=new Button("Sum");
        
    public label(){
 
        this.setVisible(true);
        this.setSize(400, 300);
        this.setTitle("Testing");
        Color c = new Color(0x00, 0x92, 0x70); 
        // this.setBackground(c);
        
        // btn =new Button("Sum");
        // add(btn);
        // exit application 
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        Label lb=new Label("Name");
        TextField tf=new TextField();

        lb.setBounds(30, 100, 100, 20);
        tf.setBounds(60,100, 300, 20);
        tf.setBackground(c);

        this.add(lb);
        this.add(tf);
        
    }
    
    // @Override
    // public void paint(Graphics g) {
        
    //     // btn =new Button("Sum");
    //     // add(btn);
    //     // Call the superclass's paint method first
    //     super.paint(g);
    //     Font font = new Font("Serif", Font.BOLD, 44);
    //     g.setFont(font); 
    //     g.setColor(Color.RED); 
    //     g.drawString("Hello", 150, 100);

    //     // Example: Change font to bold
        
  
    //     g.setColor(Color.BLUE); 
    //     g.drawString("Bold Text Example", 70, 150);
        
    // }
    public static void main(String[] args) {
        label obj=new label();
      
   

    }
}
