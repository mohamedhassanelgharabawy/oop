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
public class Car
{
    private int doors;
    String color;
    String type;
    int birthdate;
    double speed;
    
    public Car(){};
    
    public Car (int d,String c,String t,int p, double s)
    {
        doors = d;
        color = c;
        type = t;
        birthdate = p;
        speed = s;
    }
   
    
    public void setDoor(int doors)
    {
        this.doors = doors;
    }
    
    int getDoor()
    {
        return doors;
    }
    
    String getColor()
    {
        return color;
    }
    
    String getType()
    {
        return type;
    }
    
    int getbirthdate()
    {
        return birthdate;
    }
    
    double getSpeed()
    {
        return speed;
    }
}
