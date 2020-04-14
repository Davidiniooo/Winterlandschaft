import sas.*;
import java.awt.Color;

public class Baum
{
    private Rectangle stamm;
    private Polygon Grün, Grün2, Grün3;
    public Baum()
    {
     stamm = new sas.Rectangle(650,900,30,50);
     stamm.setColor(new Color (139, 69, 19));
     Grün = new sas.Polygon(580,900);
     Grün.setColor(new Color (34, 139, 34));
     Grün.add(170, 0);
     Grün.add(85, -90);
     Grün2 = new sas.Polygon(600,840);
     Grün2.setColor(new Color (34, 139, 34));
     Grün2.add(130, 0);
     Grün2.add(65, -90);
     Grün3 = new sas.Polygon(620,780);
     Grün3.setColor(new Color (34, 139, 34));
     Grün3.add(90, 0);
     Grün3.add(45, -90);
    }
}
