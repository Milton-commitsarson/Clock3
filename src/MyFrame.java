import javax.swing.*;

public class MyFrame extends JFrame {
    int xPos = 500;
    int yPos= 300;
    int frameSize = 600;

    //COnsructer

    public MyFrame(){
        this.setBounds(xPos,yPos,frameSize,frameSize);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("TE21D Clicker");

        MyPanel panel = new MyPanel(frameSize);
        this.add(panel);
        // this.add(new Mypanel(frameSize));
    }
}
