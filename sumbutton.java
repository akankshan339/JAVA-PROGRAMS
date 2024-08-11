import java.awt.*;
import java.awt.event.*;
public class sumbutton extends Frame implements ActionListener {
    Label lblnum1 , lblnum2 , lblRes;
    TextField txtnum1 , txtnum2;
    Button btnSum;
    sumbutton()
    {
        setTitle("ADD 2 NOs");
        setSize(800 ,500);
        setLayout(new FlowLayout());
        lblnum1 = new Label("Enter number 1:");
        lblnum2 = new Label("Enter number 2:");
        lblRes = new Label("          ");
        txtnum1 = new TextField(10);
        txtnum2 = new TextField(10);
        
        add(lblnum1);
        add(txtnum1);
        add(lblnum2);
        add(txtnum2);
        add(btnSum);
        add(lblRes);
        setVisible(true);

        /*addWindowListener(new WindowAdapter()
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });*/
        btnSum.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        int num1=Integer.parseInt(txtnum1.getText());
        int num2=Integer.parseInt(txtnum2.getText());
        lblRes.setText("Sum :" +(num1 +num2));

    }
    public static void main(String args[])
    {
        sumbutton b =new sumbutton();
    }  
}
