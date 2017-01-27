import javax.swing.*;
import java.awt.*;

public class VanPipes
{
    JFrame blastoise;
    Container victreebel;
    Graphics porygon;
    int pipe1x = 750;
    int pipe2x = 1050;
    int pipe3x = 1350;

    int y = 0;
    int height = 200;

    public VanPipes(JFrame blastoise)
    {
        this.blastoise = blastoise;
        victreebel = blastoise.getContentPane();
        porygon = victreebel.getGraphics();
    }

    public void drawTopPipe() //draws first top pipe
    {
        //         try
        //         {Thread.sleep(5);}
        //         catch 
        //         (Exception e)
        //         {}
        porygon.setColor(new Color(220,20,60));
        porygon.fillRect(pipe1x,y,100,height);
    }

    public void drawBotPipe() //draws first bottom pipe
    {
        //         try
        //         {Thread.sleep(5);}
        //         catch 
        //         (Exception e)
        //         {}
        porygon.setColor(new Color(220,20,60));
        porygon.fillRect(pipe1x,y+300,100,height+50);
    }

    public void drawTopPipe2() //draws second top pipe
    {
        //         try
        //         {Thread.sleep(5);}
        //         catch 
        //         (Exception e)
        //         {}
        porygon.setColor(new Color(220,20,60));
        porygon.fillRect(pipe2x,y,100,height);
    }

    public void drawBotPipe2() //draws second bottom pipe
    {
        //         try
        //         {Thread.sleep(5);}
        //         catch 
        //         (Exception e)
        //         {}
        porygon.setColor(new Color(220,20,60));
        porygon.fillRect(pipe2x,y+300,100,height+50);
    }

    public void drawTopPipe3() //draws third top pipe
    {
        //         try
        //         {Thread.sleep(5);}
        //         catch 
        //         (Exception e)
        //         {}
        porygon.setColor(new Color(220,20,60));
        porygon.fillRect(pipe3x,y,100,height);
    }

    public void drawBotPipe3() //draws third bottom pipe
    {
        //         try
        //         {Thread.sleep(5);}
        //         catch 
        //         (Exception e)
        //         {}
        porygon.setColor(new Color(220,20,60));
        porygon.fillRect(pipe3x,y+300,100,height+50);
    }

    public void movePipe()
    {
        porygon.clearRect(pipe1x,y,100,height); //clears pipes
        porygon.clearRect(pipe1x,y+300,100,height+50);
        porygon.clearRect(pipe2x,y,100,height);
        porygon.clearRect(pipe2x,y+300,100,height+50);
        porygon.clearRect(pipe3x,y,100,height);
        porygon.clearRect(pipe3x,y+300,100,height+50);
        //         try
        //         {Thread.sleep(400);}
        //         catch 
        //         (Exception e)
        //         {}
        pipe1x = pipe1x - 20; //the actual "move" of pipes
        pipe2x = pipe2x - 20; 
        pipe3x = pipe3x - 20; 
        
        //height = (int)Math.random()*500;
        if(pipe1x < -100) //resets location of pipe if reached end
        {
            pipe1x = 750;
            //height = (int)(Math.random()*500);
            //y = (int)Math.random()*500; //supposed to randomize the position of pipes
        }
        if(pipe2x < -100)
        {
            pipe2x = 750;
            //height = (int)(Math.random()*500);
            //y = (int)Math.random()*500; //supposed to randomize the position of pipes
        }
        if(pipe3x < -100)
        {
            pipe3x = 750;
            //height = (int)(Math.random()*500);
            //y = (int)Math.random()*500; //supposed to randomize the position of pipes
        }

        drawTopPipe(); //redraws pipes
        drawBotPipe();
        drawTopPipe2();
        drawBotPipe2();
        drawTopPipe3();
        drawBotPipe3();
    }
}