/*
 import Decorator_Pattern.TypeOS.*;
import Decorator_Pattern.TypePC.*;
import Decorator_Pattern.TypeControl.*;
 package Decorator_Pattern;
 */


import java.lang.reflect.Array;

import TypeOS.*;
import TypePC.*;
import TypeControl.*;
public abstract class Computer {
    
    TypeOS typeOS;
    TypePC typePC;
    TypeControl[] typeControl;
    public Computer(){}
    public void doInfo()
    {
        if (typeOS != null){
            typeOS.NameOS();
        } else NameOS();

        if (typePC != null){
            typePC.NameTypePC();
        } else NameTypePC();
        if (typeControl != null){
            System.out.print("\n Controls: ");
            for (int i = 0; i < Array.getLength(typeControl); i++){
                typeControl[i].NameTypeControl();
            }
            System.out.println();
        } else NameTypeControl();

    }
    public void NameOS() 
    {
        System.out.print("\n Undefined OS Type");
    }
    
    public void NameTypePC() 
    {
        System.out.print("\n Undefined PC Type");
    }
    public void NameTypeControl()
    {
        System.out.print("\n Unknown Type of Control");
    }

}
