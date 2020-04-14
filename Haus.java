import sas.*;
import java.awt.Color;

public class Haus
{
    private Rectangle Haus, Dach1, Dach2, Tür, Fenster;
    private Polygon Dach;
    private Circle Türklinke;
    public Baum baum;
    
    public Haus()
    {
      Haus = new sas.Rectangle(1100,600,500,400);
      Haus.setColor(new Color(238, 216, 174));
      Dach1 = new sas.Rectangle(1450,420,30,90);
      Dach2 = new sas.Rectangle(1440,410,50,10);
      Dach1.setColor(new Color(36, 36, 36));
      Dach2.setColor(new Color(36, 36, 36)); 
      Dach = new sas.Polygon(1100,600);
      Dach.add(500,0);
      Dach.add(250,-200);
      Dach.setColor(new Color(205,79,57));
      Tür = new sas.Rectangle(1320,860,65,90);
      Tür.setColor(new Color(135,65,15));
      Türklinke = new sas.Circle(1368,905,5);
      Türklinke.setColor(new Color(40,40,40));
      Fenster = new sas.Rectangle(1200,680,300,100);
      Fenster.setColor(new Color(74 ,	112 ,	139));
      baum = new Baum();
    }
}
