/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labtask;

/**
 *
 * @author lenovo
 */
public class Engine {
    private String power;
    private boolean Start;
    
Engine(){
    this.power=null;
    this.Start=false;
}
Engine(String power,boolean Start){
    this.power=power;
    this.Start=Start;
}
public void setisStart(boolean Start){
    this.Start=Start;
}
public boolean getisStart(){
    return this.Start;
}
public void setPower(String power){
    this.power=power;
    
}
public String getPower(){
    return power;
}
}


