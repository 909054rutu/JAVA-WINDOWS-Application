import java.awt.*;
class demo extends Frame
{
Label l1;
Checkbox c1,c2,c3,c4;
Button b1;

demo()
{
setVisible(true);
setSize(500,500);
setLocation(400,300);
setTitle("Checkbox");
//setLayout(new FlowLayout());
setLayout(new GridLayout(6,1));
setBackground(Color.red);
c1=new Checkbox("Java");
c2=new Checkbox("DSA");
c3=new Checkbox("Python");
c4=new Checkbox("php");
l1=new Label("select subject");

b1=new Button("Submit");
add(l1);
add(c1);
add(c2);
add(c3);
add(c4);
add(b1);
}
public static void main(String arg[])
{
demo ob=new demo();
}
}

