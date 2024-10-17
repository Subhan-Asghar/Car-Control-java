/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labtask;

/**
 *
 * @author lenovo
 */
public class Car {
    private String name;
    private String color;
    private String model;
    private Company cmp;
    private Engine eng;
    private int rpm;

Car(){
    name="abs";
    color="black";
    model="2020";
   
    eng=null;
    cmp=null;
    
}
Car(String name,String model,String color,Company cmp,Engine eng){
    this.name=name;
    this.model=model;
    this.color=color;
    this.cmp=cmp;
    this.eng=eng;
    
}
public void Speed(int rpm){
    if(eng.getisStart()){
    this.rpm=rpm; 
    System.out.println("Car is Running at Speed of "+this.rpm+"km/h ");
    }
    else{
    System.out.println("Engine is not Start yet ");
    }
    
}
public int getSpeed(){
    return rpm;
}
 public void Start(){
     if(eng.getisStart()){
     System.out.println("Engine is already Running");  
     }
     else{
         eng.setisStart(true);
     System.out.println("Engine is Start");  
     }
 }
 public void Stop(){
     if(eng.getisStart()){
         eng.setisStart(false);
     System.out.println("Engine is Stop");  
     }
     else{
     System.out.println("Engine is Already Stoped");  
     }
 }
 
    public void info(){
        System.out.println("----------------------------");
        System.out.println("Company Name "+cmp.getCmpname());
        System.out.println("Company Location "+cmp.getLocation());
        System.out.println("Car Name "+this.name);
        System.out.println("Car Model "+this.model);
        System.out.println("Car Color "+this.color);
        System.out.println("Car Power " +eng.getPower());
        



    }
 

}
