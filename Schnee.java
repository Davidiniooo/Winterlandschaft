import sas.*;
import java.awt.Color;

public class Schnee
   {
    private Circle[] s1;
    private double[] velocity;
    private int zähler = 0;
    private Rectangle Schneeboden = new sas.Rectangle(0, 950, 1800, 600);
    
    public Schnee()
    {
     s1 = new Circle[250];
     velocity = new double[250];

     Schneeboden.setColor(new Color (245, 245, 245));

     for(int i = 0;i<249;i++)
     {
         velocity[i] = Tools.randomNumber(30,80);
         velocity[i] = velocity[i]/100;
     }

     for(int i = 0;i<249;i++){
      s1[i] = new Circle (Tools.randomNumber(-400,1700),0,6);
      s1[i].setColor(Color.white); 
      s1[i].setHidden(true);
      s1[i].setDirection(150);
     }
    }
    
     public void run()
    {
     while(true){

      if(zähler > 1500){
        Schneeboden.move(0,-0.01);
      }
      if(zähler > 17000){
        Schneeboden.move(0,0.01);
      }
      zähler = zähler+1;

      for(int i = 0;i<249;i++){
       s1[i].setHidden(false);
       if(s1[i].getCenterY()>950){
          s1[i].moveTo(Tools.randomNumber(-400, 1700),0);
            }
       else{    
          s1[i].move(velocity[i]);
            } 
        }
      try{
            Thread.sleep(5);
            }catch(InterruptedException ie){} 
        }
       }  
    }
