/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication71;

/**
 *
 * @author HP
 */
public class JavaApplication71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Car mercedes = new Car(4,"red","Manual",2010,300);
        Car bmw = new Car(2,"black","Manual",2018,350);
        
        bus b = new bus();
        b.chairs = 4;
        
        bus y = new bus();
        y.setDoor(5);
        
        System.out.println("The Doors of bus is "+ y.getDoor());
        
        van v = new van();
        v.size = 20;
        v.setDoor(4);
        System.out.println("The Doors of van is "+ v.getDoor());
        
        microbus m = new microbus ();
        m.setDoor(2);
        
        System.out.println("The Doors of microbus is "+ m.getDoor());
    }
    
}
