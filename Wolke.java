import sas.*;
import java.awt.Color;
import java.util.Random;

public class Wolke
{
    public View Fenster;
    public Boden boden;
    private int i;
    public Schnee schnee;
    private Circle w1, w2, w3, w4, w5, w6;
    public int XPos;
    private int YPos;
    private double Speed;
    
    public Wolke(int startx,int starty, double speed)
    {  
     
     XPos=startx;
      YPos=starty;
      Speed = speed;
      Random rand = new Random();
      int tempradw1 =rand.nextInt(10)+10;
      w1 = new sas.Circle(startx-tempradw1,starty-tempradw1, tempradw1);
      w1.setColor(new Color (245, 245, 245));
      
      int tempradw2 =rand.nextInt(20)+20;
      w2 =new sas.Circle(startx+tempradw1-tempradw2, starty-tempradw2, tempradw2);
      w2.setColor(new Color (245, 245, 245));
      
      int tempradw3 =rand.nextInt(40)+20;
      w3 =new sas.Circle(startx+tempradw1+tempradw2-tempradw3, starty-tempradw3, tempradw3);
      w3.setColor(new Color (245, 245, 245));
      
      int tempradw4 =rand.nextInt(40)+20;
      w4 =new sas.Circle(startx+tempradw1+tempradw2+tempradw3-tempradw4, starty-tempradw4, tempradw4);
      w4.setColor(new Color (245, 245, 245));
      
      int tempradw5 =rand.nextInt(20)+20;
      w5 =new sas.Circle(startx+tempradw1+tempradw2+tempradw3+tempradw4-tempradw5, starty-tempradw5, tempradw5);
      w5.setColor(new Color (245, 245, 245));
      
      int tempradw6 =rand.nextInt(10)+10;
      w6 =new sas.Circle(startx+tempradw1+tempradw2+tempradw3+tempradw4+tempradw5-tempradw6, starty-tempradw6, tempradw6);
      w6.setColor(new Color (245, 245, 245));
      i = 0;     
     
      if(i>94){ 
      schnee = new Schnee();
      schnee.run();

     }
  }
   public void move()
    {
        
            w1.move(Speed*0.001);
            w2.move(Speed*0.001);
            w3.move(Speed*0.001);
            w4.move(Speed*0.001);
            w5.move(Speed*0.001);
            w6.move(Speed*0.001);
            XPos += Speed*0.001;   
        
    }
}