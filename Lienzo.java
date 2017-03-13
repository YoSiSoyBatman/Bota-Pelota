import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.util.LinkedList;
import java.awt.Rectangle;

public class Lienzo extends JPanel
{
    private LinkedList<Pelota> pelotas;
    public Lienzo(){
        pelotas=new LinkedList<Pelota>();
        pelotas.add(new Pelota(100,100,10));
        EscuchadorRaton rat=new EscuchadorRaton();
        this.addMouseListener(rat);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Pelota pel:pelotas){
            pel.dibujarse(g);
        }
    }
    public void muevePelota(){
        Rectangle r=this.getBounds();
        for(Pelota pel:pelotas){
            pel.moverse(r);
        }
        this.repaint();
    }
    class EscuchadorRaton extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent me){
            System.out.println(me.getX()+"  "+me.getY());
            Pelota pelNue=new Pelota(me.getX(),me.getY(),20);
            pelotas.add(pelNue);
        }
    }
}
