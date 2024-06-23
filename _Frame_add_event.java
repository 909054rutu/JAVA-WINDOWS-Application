import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4;

    Demo()
    {
        Font f1=new Font("Arial",Font.BOLD,25);
        setFont(f1);
        setVisible(true);
        setSize(400,400);
        setTitle("Event Handle ADD");
        // setLayout(new GridLayout(5,2));
       
        setLayout(new FlowLayout());
        Color c1=new Color(120,69,78);
        setBackground(c1);

        l1=new Label("Enter First Number");
        l2=new Label("Enter Sec Number");
        l3=new Label("Result");
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        b1=new Button("Add");
        b2=new Button("Sub");
        b3=new Button("Clear");
        b4=new Button("Exit");

        add(l1); add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
        add(b1);add(b2);
        add(b3);add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed (ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String s1=t1.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(t1.getText());
            int c=a+b;
            t3.setText(""+c);
        }
        if(ae.getSource()==b2)
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=a-b;
            t3.setText(""+c);
        }
        if(ae.getSource()==b3)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
        if(ae.getSource()==b4)
        {
            dispose();
        }

    }
    public static void main(String arg[])
    {
        Demo ob=new Demo();
    }

}