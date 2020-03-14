import sas.*;
import java.awt.Color;

public class Wolke
{
    private Circle WolkeLinks1, WolkeLinks2, WolkeLinks3,WolkeLinks4, WolkeLinks5, WolkeLinks6, WolkeLinks7, WolkeLinks8, WolkeLinks9,WolkeLinks10, WolkeLinks11, WolkeLinks12, WolkeLinks13, WolkeLinks14,
    WolkeLinks15,WolkeLinks16, WolkeLinks17, WolkeLinks18, WolkeLinks19, WolkeLinks20;
    private Circle w1, w2, w3, w4, w5, w6, w7, w8, w9, w10, w11, w12, w13, w14, w15, w16, w17, w18, w19, w20;
    private Circle W1, W2, W3, W4, W5, W6, W7, W8;
    public View Fenster;
    public Boden boden;
    private int i;
    public Schnee schnee;
    
    public Wolke()
    {  
     boden = new Boden();
     
     Fenster = new View (1800, 1000, "Winterlandschaft");
     Fenster.setBackgroundColor(new Color (175, 238, 238)); 
     
     WolkeLinks1 = new sas.Circle (-110, 20, 50);
     WolkeLinks1.setDirection(90);
     WolkeLinks1.setColor(new Color (245, 245, 245));
     WolkeLinks2 = new sas.Circle (-160, 30, 50);
     WolkeLinks2.setColor(new Color (245, 245, 245));
     WolkeLinks3 = new sas.Circle (-150, 0, 50);
     WolkeLinks3.setColor(new Color (245, 245, 245));
     WolkeLinks4 = new sas.Circle (-220, 3, 50);
     WolkeLinks4.setColor(new Color (245, 245, 245));
     WolkeLinks5 = new sas.Circle (-210, 30, 50);
     WolkeLinks5.setColor(new Color (245, 245, 245));
     WolkeLinks6 = new sas.Circle (-270, 33, 50);
     WolkeLinks6.setColor(new Color (245, 245, 245));
     WolkeLinks7 = new sas.Circle (-260, 0, 50);
     WolkeLinks7.setColor(new Color (245, 245, 245));
     WolkeLinks8 = new sas.Circle (-340, 30, 50);
     WolkeLinks8.setColor(new Color (245, 245, 245));
     WolkeLinks9 = new sas.Circle (-330, 5, 50);
     WolkeLinks9.setColor(new Color (245, 245, 245));
     WolkeLinks10 = new sas.Circle (-380, 25, 50);
     WolkeLinks10.setColor(new Color (245, 245, 245));
     
     WolkeLinks11 = new sas.Circle (-500, 20, 50);
     WolkeLinks11.setColor(new Color (245, 245, 245));
     WolkeLinks12 = new sas.Circle (-550, 0, 50);
     WolkeLinks12.setColor(new Color (245, 245, 245));
     WolkeLinks13 = new sas.Circle (-540, 40, 50);
     WolkeLinks13.setColor(new Color (245, 245, 245));
     WolkeLinks14 = new sas.Circle (-620, 0, 50);
     WolkeLinks14.setColor(new Color (245, 245, 245));
     WolkeLinks15 = new sas.Circle (-600, 45, 50);
     WolkeLinks15.setColor(new Color (245, 245, 245));
     WolkeLinks16 = new sas.Circle (-680, 0, 50);
     WolkeLinks16.setColor(new Color (245, 245, 245));
     WolkeLinks17 = new sas.Circle (-670, 45, 50);
     WolkeLinks17.setColor(new Color (245, 245, 245));
     WolkeLinks18 = new sas.Circle (-745, 0, 50);
     WolkeLinks18.setColor(new Color (245, 245, 245));
     WolkeLinks19 = new sas.Circle (-730, 45, 50);
     WolkeLinks19.setColor(new Color (245, 245, 245));
     WolkeLinks20 = new sas.Circle (-790, 30, 50);
     WolkeLinks20.setColor(new Color (245, 245, 245));
     
     w1 = new sas.Circle(-910, 25, 50);
     w1.setColor(new Color (245, 245, 245));
     w2 = new sas.Circle(-960, 0, 50);
     w2.setColor(new Color (245, 245, 245));
     w3 = new sas.Circle(-970, 45, 50);
     w3.setColor(new Color (245, 245, 245));
     w4 = new sas.Circle(-1020, 0, 50);
     w4.setColor(new Color (245, 245, 245));
     w5 = new sas.Circle(-1030, 45, 50);
     w5.setColor(new Color (245, 245, 245));
     w6 = new sas.Circle(-1090, 0, 50);
     w6.setColor(new Color (245, 245, 245));
     w7 = new sas.Circle(-1100, 45, 50);
     w7.setColor(new Color (245, 245, 245));
     w8 = new sas.Circle(-1165, 0, 50);
     w8.setColor(new Color (245, 245, 245));
     w9 = new sas.Circle(-1170, 45, 50);
     w9.setColor(new Color (245, 245, 245));
     w10 = new sas.Circle(-1230, 25, 50);
     w10.setColor(new Color (245, 245, 245));
     
     w11 = new sas.Circle(-1350, 25, 50);
     w11.setColor(new Color (245, 245, 245));
     w12 = new sas.Circle(-1400, 5, 50);
     w12.setColor(new Color (245, 245, 245));
     w13 = new sas.Circle(-1410, 45, 50);
     w13.setColor(new Color (245, 245, 245));
     w14 = new sas.Circle(-1480, 0, 50);
     w14.setColor(new Color (245, 245, 245));
     w15 = new sas.Circle(-1490, 48, 50);
     w15.setColor(new Color (245, 245, 245));
     w16 = new sas.Circle(-1560, 5, 50);
     w16.setColor(new Color (245, 245, 245));
     w17 = new sas.Circle(-1560, 45, 50);
     w17.setColor(new Color (245, 245, 245));
     w18 = new sas.Circle(-1620, 0, 50);
     w18.setColor(new Color (245, 245, 245));
     w19 = new sas.Circle(-1620, 47, 50);
     w19.setColor(new Color (245, 245, 245));
     w20 = new sas.Circle(-1680, 25, 50);
     w20.setColor(new Color (245, 245, 245));
     
     W1 = new sas.Circle(-1800, 25, 50);
     W1.setColor(new Color (245, 245, 245));
     W2 = new sas.Circle(-1850, 2, 50);
     W2.setColor(new Color (245, 245, 245));
     W3 = new sas.Circle(-1860, 45, 50);
     W3.setColor(new Color (245, 245, 245));
     W4 = new sas.Circle(-1920, 2, 50);
     W4.setColor(new Color (245, 245, 245));
     W5 = new sas.Circle(-1930, 45, 50);
     W5.setColor(new Color (245, 245, 245));
     W6 = new sas.Circle(-1990, 5, 50);
     W6.setColor(new Color (245, 245, 245));
     W7 = new sas.Circle(-2000, 38, 50);
     W7.setColor(new Color (245, 245, 245));
     W8 = new sas.Circle(-2050, 25, 50);
     W8.setColor(new Color (245, 245, 245));
     i = 0;     
     while(i<906)
      {
       WolkeLinks1.move(2);
       WolkeLinks2.move(2);
       WolkeLinks3.move(2);
       WolkeLinks4.move(2);
       WolkeLinks5.move(2);
       WolkeLinks6.move(2);
       WolkeLinks7.move(2);
       WolkeLinks8.move(2);
       WolkeLinks9.move(2);
       WolkeLinks10.move(2);
       
       WolkeLinks11.move(2.08);
       WolkeLinks12.move(2.08);
       WolkeLinks13.move(2.08);
       WolkeLinks14.move(2.08);
       WolkeLinks15.move(2.08);
       WolkeLinks16.move(2.08);
       WolkeLinks17.move(2.08);
       WolkeLinks18.move(2.08);
       WolkeLinks19.move(2.08);
       WolkeLinks20.move(2.08);
       
       w1.move(2.14);
       w2.move(2.14);
       w3.move(2.14);
       w4.move(2.14);
       w5.move(2.14);
       w6.move(2.14);
       w7.move(2.14);
       w8.move(2.14);
       w9.move(2.14);
       w10.move(2.14);
       
       w11.move(2.2);
       w12.move(2.2);
       w13.move(2.2);
       w14.move(2.2);
       w15.move(2.2);
       w16.move(2.2);
       w17.move(2.2);
       w18.move(2.2);
       w19.move(2.2);
       w20.move(2.2);
       
       W1.move(2.26);
       W2.move(2.26);
       W3.move(2.26);
       W4.move(2.26);
       W5.move(2.26);
       W6.move(2.26);
       W7.move(2.26);
       W8.move(2.26);
       Fenster.wait(23);
       i = i+1;
     }
      if(i>94){ 
      schnee = new Schnee();
      schnee.run();

     }
  }
}