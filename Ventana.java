
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class Ventana extends JFrame
{
    private Lienzo dibujo;
    private Timer tiempo;
    public Ventana(int ancho, int alto){
        this.setSize(ancho, alto);
        dibujo=new Lienzo();
        //dibujo.addKeyListener(dibujo);
        this.add(dibujo);
        EscuchadorTeclado escuchaTeclado= new EscuchadorTeclado();
        this.addKeyListener(escuchaTeclado);
        
        EscuchadorTiempo esc=new EscuchadorTiempo();
        tiempo=new Timer(1000,esc);
        tiempo.start();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    class EscuchadorTeclado implements KeyListener{
    @Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyChar()=='d'){
            tiempo.stop();
        }
        else if(e.getKeyChar()=='i'){
            dibujo.muevePelota();
        }
        System.out.println("KP KP KP KP KP  "+ e.getKeyChar());
    }
    @Override
    public void keyReleased(KeyEvent e){
        System.out.println("KP KP KP KP KP 2  "+ e.getKeyChar());
    }
    @Override
    public void keyTyped(KeyEvent e){
        System.out.println("KP KP KP KP KP 3  "+ e.getKeyChar());
    }
    }
    public class EscuchadorTiempo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            System.out.println("asd asd asd asd asd  ");
        }
    }
}
