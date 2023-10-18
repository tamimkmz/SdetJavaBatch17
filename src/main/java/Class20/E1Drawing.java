package Class20;

import javax.swing.*;
import java.awt.*;

public class E1Drawing {
    public static void main(String[] args) {
        JFrame frame=new JFrame();

        frame.setSize(200,200);
        MyCanvaa c=new MyCanvaa();
        frame.add(c);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
class MyCanvaa extends Canvas{
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(200, 200, 500, 500);
        g.setColor(Color.RED);
        g.fillRect(800,200,300,300);
    }
}