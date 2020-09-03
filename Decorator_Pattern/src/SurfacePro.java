import TypeOS.*;
import TypePC.*;
import TypeControl.*;


public class SurfacePro extends Computer {
    public SurfacePro() {
        //typeOS = new TypeOS(); 
        System.out.print("\n \n Surface Pro 3:");
        typeOS = new Win10();
        typePC = new Desktop();
        typeControl = new TypeControl[1];
        typeControl[0] = new TouchScreen();
    }
    
}
