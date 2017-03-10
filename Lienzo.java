import java.awt.Graphics;
import javax.swing.JPanel;
public class Lienzo extends JPanel
{
    private Pelota pel;
    public Lienzo(){
        pel=new Pelota(100,100,10);
    }
    
    @Override
    public void paintComponent(Graphics g){
        pel.dibujarse(g);
    }
    public void muevePelota(){
        pel.moverse();
        this.repaint();
    }
}
