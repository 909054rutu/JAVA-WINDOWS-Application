import java.awt.*;
class demo extends Frame
{
Label l1 ,l2,l3;
TextField t1,t2,t3;
Button b1,b2,b3,b4;
 demo()
{
setVisible(true);
setSize(500,600);
setLocation(100,300);
setTitle("Addition program");
setBackground(Color.pink);
//setLayout(new GridLayout(5,2));
setLayout(new FlowLayout());

l1=new Label("Enter no1");
l2=new Label("Enter no2");
l3=new Label("Result");

t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);

b1=new Button("Add");
b2=new Button("Sub");
b3=new Button("Clear");
b4=new Button("Exit");

add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(b1);
add(b2);
add(b3);
add(b4);
}
public static void main(String arg[])
{
demo ob=new demo();
}
}


