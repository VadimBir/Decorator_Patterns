import TypeOS.*;
import TypePC.*;
import TypeControl.*;

public class CorsairOne extends Computer{

    public CorsairOne() 
    {
        System.out.print("\n \n Corsair One i140");
        typeOS = new Win10();
        typePC = new Desktop();
        typeControl = new TypeControl[2];
        typeControl[0] = new Mouse();
        typeControl[1] = new Keyboard();
    }
}
    

