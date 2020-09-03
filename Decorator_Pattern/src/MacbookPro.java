import TypeOS.*;
import TypePC.*;
import TypeControl.*;


public class MacbookPro extends Computer {
    public MacbookPro() {
        //typeOS = new TypeOS(); 
        System.out.print("\n \n Macbook Pro 15:");
        typeOS = new MacOS();
        typePC = new Laptop();
        typeControl = new TypeControl[1];
        typeControl[0] = new TrackPad();
    }
    
}