import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class MyPanel extends JPanel implements MouseListener {
    int ram = 100;
    int shapeSize;
    boolean

    // Cunstructer

    public MyPanel(int panelSize){
        shapeSize = panelSize - (ram*2);
        this.setBounds(0,0,panelSize,panelSize);
        this.setBackground(new Color(239,123,11));
        this.addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g){
       super.paintComponent(g);
       g.setColor(new Color(242,0,255,255 ));
       g.fillRect(10,10,570,570);
    }
}
