/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.startingjava;

/**
 *
 * @author RehatThind
 */
/*2 types of type casting
 widening, narrow
    ^
byte>short>int>long>float>double
*/
public class TypeCasting {
    public static void main(String[] args) {
    int myint= 10;         //widening(is done automatically)
    double mydouble = myint;
        System.out.println(myint);
        System.out.println(mydouble);
    double mydouble1 = 10.66d;
    int myint1 = (int) mydouble1;   //narrow(is done manually)
        System.out.println(mydouble1);
        System.out.println(myint1);
    }
}
