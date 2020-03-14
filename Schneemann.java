import sas.*;
import java.awt.Color;

public class Schneemann
{
    private Circle Unten,Mitte,Oben,KnopfU,KnopfM,KnopfO,AugeL,AugeR;
    private Rectangle HutU,HutO;
    private Polygon Nase;

    public Schneemann()
    {
       Unten = new sas.Circle(350,850,50);
       Unten.setColor(new Color (245, 245, 245));
       Mitte = new sas.Circle(360,800,40);
       Mitte.setColor(new Color (245, 245, 245));
       Oben = new sas.Circle(370,760,30);
       Oben.setColor(new Color (245, 245, 245));
       KnopfU = new sas.Circle(395,870,4);
       KnopfU.setColor(new Color (51, 51, 51));
       KnopfM = new sas.Circle(395,850,4);
       KnopfM.setColor(new Color (51, 51, 51));
       KnopfO = new sas.Circle(395,830,4);
       KnopfO.setColor(new Color (51, 51, 51));
       AugeL = new sas.Circle(385, 780, 4);
       AugeL.setColor(new Color (51, 51, 51));
       AugeR = new sas.Circle(406, 780, 4);
       AugeR.setColor(new Color (51, 51, 51));
       HutU = new sas.Rectangle(370, 760, 60, 10);
       HutO = new sas.Rectangle(383, 743, 35, 17);
       Nase = new sas.Polygon(400,793);
       Nase.add(-15, 7);
       Nase.add(0, 5);
       Nase.setColor(new Color(210, 105, 30));
    }
    }

