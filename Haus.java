import sas.*;
import java.awt.Color;

public class Haus
{
    private Rectangle Haus, Dach1, Dach2;
    private Polygon Dach;
    public Baum baum;
    
    public Haus()
    {
      Haus = new sas.Rectangle(1100,600,500,400);
      Haus.setColor(new Color(238,216,174 ));
      Dach1 = new sas.Rectangle(1450,420,30,90);
      Dach2 = new sas.Rectangle(1440,410,50,10);
      Dach = new sas.Polygon(1100,600);
      Dach.add(500,0);
      Dach.add(250,-200);
      Dach.setColor(new Color(205,79,57 ));
      baum = new Baum();
    }

}
