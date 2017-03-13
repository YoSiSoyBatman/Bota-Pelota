
import java.awt.Graphics;
import java.awt.Rectangle;
public class Pelota
{
    private int posx;
    private int posy;
    private int radio;
    private int dirX;
    private int dirY;
    
    public Pelota( int x, int y,int r){
        posx=x;
        posy=y;
        radio=(int)(Math.random()*2*r);
        int hw=(int)(Math.random()*2);
        dirX=hw;
        hw=(int)Math.random();
        dirY=hw;
    }
    
    public void dibujarse(Graphics g){
        g.drawOval(posx,posy,radio*2,radio*2);
    }
    public void moverse(Rectangle r){
        if(posx>=r.getMaxX()){
            dirX=0;
        }
        else if(posx<=r.getMinX()){
            dirX=1;
        }
        if(posy>=r.getMaxY()){
            dirY=0;
        }
        else if(posy<=r.getMinY()){
            dirY=1;
        }
        if(dirX==1){
            posx+=10;
        }
        else{
            posx-=10;
        }
        if(dirY==1){
            posy+=10;
        }
        else{
            posy-=10;
        }
    }
}
