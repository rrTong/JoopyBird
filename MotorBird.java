import javax.swing.*;
import java.awt.*;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class MotorBird implements KeyListener
{
    JFrame lsd;
    Container xtc;
    Graphics shrm;  
    int height = 200;
    int hFlapment = 0;

    public MotorBird(JFrame lsd, /*Container xtc, Graphics shrm,*/ int height)
    {	
        this.lsd = lsd;
        xtc = lsd.getContentPane();
        shrm = xtc.getGraphics();
        this.height = height;
        lsd.addKeyListener(this);
    }

    public void drawBird() //draws bird
    {
        //for(height = 100; height > 0; height = height + 10) 
        //{
        //         try
        //         {Thread.sleep(400);}
        //         catch
        //         (Exception e)
        //         {}
        shrm.setColor(new Color(255, 255, 0));
        shrm.fillOval(100, height, 50, 50);
        //         {
        //            Thread.sleep(400);
        //             lsd.repaint();
        //         }
        //         catch(Exception e) {}
        //}
    }

    //     public void colorBackground() //colors background
    //     {
    //         shrm.setColor(new Color(255,255,255));
    //         shrm.fillRect(0,0,750,500);
    //     }

    public void flap() //erases and draws bird
    {
        //for(hFlapment = 0; hFlapment >= 0; hFlapment += 50) //test thingy
        {
            shrm.clearRect(100,height,50,50);
            try
            {Thread.sleep(1);}
            catch 
            (Exception e)
            {}
            height = height + hFlapment;

            drawBird();
        }
    }

    public void keyPressed(KeyEvent klefki) //spacebar = ^
    {
        int key = klefki.getKeyCode();
        if(key == KeyEvent.VK_SPACE)
        {
            hFlapment = -20;
            try
            {Thread.sleep(400);}
            catch 
            (Exception e)
            {}
        }
    }  

    public void keyReleased(KeyEvent klefki) //no spacebar = v
    {
        int key = klefki.getKeyCode();
        if(key == KeyEvent.VK_SPACE)
        {
            hFlapment = 30;
        }
    }

    public void keyTyped(KeyEvent klefki)
    {
    }
}