/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.startingjava;

/**
 *
 * @author RehatThind
 */
public class Variables1 {
    public static void main(String args[]){
      int num=21;
       num=22;    //here value 21 is never used
      System.out.println(num);
      String myname="Rehat";      //String always need to be in double quotes
      System.out.println(myname);
      /*final int mynum=24;
        mynum =25;      this will generate an error */
      Float myfloat= 7.59f;
      Boolean mybool= true;
        System.out.println(myfloat);
        System.out.println(mybool);  
    }
}
