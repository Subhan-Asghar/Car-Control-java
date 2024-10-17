/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labtask;

/**
 *
 * @author lenovo
 */
public class LabTask {

    public static void main(String[] args) {
       Company cmp=new Company("Honda","Lahore");
       Engine eng=new Engine("1200cc",false);
       Car car=new Car("Civic","2024","Black",cmp,eng);
       car.Start();
       car.Speed(100);
       car.info();
       car.Stop();
    }
}
