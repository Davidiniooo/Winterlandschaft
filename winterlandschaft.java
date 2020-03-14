import sas.*;
import java.awt.Color;

public class winterlandschaft
{
    public View Fenster;
    public Wolke wolke;
    public Schneemann schneemann;
    public Haus haus;
        
    public winterlandschaft()
     {
       schneemann = new Schneemann();
       haus = new Haus();
       wolke=new Wolke();
      
     }
}
