import javax.swing.*;
import java.awt.*;

public class Tester
{
    public static void main(String[] args)
    {
        JFrame screen = new JFrame("JoopyBird");
        Container contentPane;
        Graphics g;
        
        //int timePassed = 0;
        int score = 0;
        String strScore = "";
        boolean test = true;

        screen.setSize(750,500);
        screen.setLocation(100,100);
        screen.setVisible(true);
        screen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        contentPane = screen.getContentPane();
        g = contentPane.getGraphics();

        try
        {Thread.sleep(400);}
        catch
        (Exception e)
        {}
        
        MotorBird joooooooCranDatSeouljaBoi = new MotorBird(screen, /*contentPane, g,*/ 200);
        
        //    joooooooCranDatSeouljaBoi.colorBackground();
        joooooooCranDatSeouljaBoi.drawBird(); //draws initial bird
        

        VanPipes seouljaBoiHitEmOhh = new VanPipes(screen);
        seouljaBoiHitEmOhh.drawTopPipe(); //draws initial pipes
        seouljaBoiHitEmOhh.drawBotPipe();
        seouljaBoiHitEmOhh.drawTopPipe2();
        seouljaBoiHitEmOhh.drawBotPipe2();
        seouljaBoiHitEmOhh.drawTopPipe3();
        seouljaBoiHitEmOhh.drawBotPipe3();
        
        //             try //repaints bird
        //             {
        //                 Thread.sleep(400);
        //                 screen.repaint();
        //                 g.setColor(new Color(255, 255, 0));
        //                 g.fillOval(100, joooooooCranDatSeouljaBoi.height, 100, 100);
        //                 Thread.sleep(400);
        //             }
        //             catch(Exception e) {}

        do //movement of bird and pipes
        {
            if(seouljaBoiHitEmOhh.pipe1x == 110 || seouljaBoiHitEmOhh.pipe1x == 150 || seouljaBoiHitEmOhh.pipe2x == 110 || seouljaBoiHitEmOhh.pipe2x == 150 || seouljaBoiHitEmOhh.pipe3x == 110 || seouljaBoiHitEmOhh.pipe3x == 150) //x point hitbox
            {
                if(joooooooCranDatSeouljaBoi.height + 50 >= seouljaBoiHitEmOhh.y + 300 || joooooooCranDatSeouljaBoi.height - 185 <= seouljaBoiHitEmOhh.y) // y point hitbox
                {
                    g.drawString("u l00z j00p", 350, 250);
                    //joooooooCranDatSeouljaBoi.clearRect(100,joooooooCranDatSeouljaBoi.height,50,50);
                    break; //ends game
                }
            }
            if(seouljaBoiHitEmOhh.pipe1x == 110 || seouljaBoiHitEmOhh.pipe2x == 110 ||  seouljaBoiHitEmOhh.pipe3x == 110) //x point hitbox
            {
                score++;
            }

            joooooooCranDatSeouljaBoi.flap();
            try
            {Thread.sleep(400);}
            catch 
            (Exception e)
            {}
            seouljaBoiHitEmOhh.movePipe();
            try
            {Thread.sleep(15);}
            catch 
            (Exception e)
            {}
            //timePassed++; //records time passed
            //score = (int)(timePassed / 30); //turns time > #ofPipes
            strScore = "" + score; //changes int --> String
            g.setColor(screen.getContentPane().getBackground()); //used to clear the old score number
            g.drawString(strScore, 350, 50);
                        try
            {Thread.sleep(15);}
            catch 
            (Exception e)
            {}
             g.setColor(new Color(0,0,0));
            g.drawString(strScore, 350, 50);
        }
        while(test = true);
        //         porygon.fillRect(pipe1x,y+300,100,height + 50);
    }
}