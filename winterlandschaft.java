import sas.*;
import java.awt.Color;

public class winterlandschaft
{
    public View Fenster;
    public Wolke[] wolke = new Wolke[10];
    public Schneemann schneemann;
    public Haus haus;
    public Boden boden;
        
    public winterlandschaft()
     {
       boden = new Boden();
       Fenster = new View (1800, 1000, "Winterlandschaft");
       Fenster.setBackgroundColor(new Color (175, 238, 238)); 
       schneemann = new Schneemann();
       haus = new Haus();
       for(int i = 0;i<9;i++){
        wolke[i] = new Wolke(-750+(10*i),400,i*10);
        }
       this.run();
    }
    void run(){
        while(true){
            for(int i = 0;i<9;i++){
                if(wolke[i].XPos > 1800)
                {   
                    wolke[i].XPos = -100;
                }
                else{wolke[i].move();}
    }
    }
}
}
