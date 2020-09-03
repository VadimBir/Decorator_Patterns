//package Decorator_Pattern;

public class Main {
    public static void main(String[] args) 
    {
        Computer Macbook = new MacbookPro();
        Macbook.doInfo();
        Computer Surface = new SurfacePro();
        Surface.doInfo();
        Computer Corsair = new CorsairOne();
        Corsair.doInfo();
        Computer NewPC = new SomeNewComputer();
        NewPC.doInfo();
        
        
        
        //for executable
        //Scanner myObj = new Scanner(System.in);
    }

}