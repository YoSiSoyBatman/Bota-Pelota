
import java.awt.Graphics;
public class Pelota
{
    private int posx;
    private int posy;
    private int radio;
    
    public Pelota( int x, int y,int r){
        posx=x;
        posy=y;
        radio=r;
    }
    
    public void dibujarse(Graphics g){
        g.drawOval(posx,posy,radio*2,radio*2);
    }
    public void moverse(){
        posx+=10;
        posy+=20;
    }
}
