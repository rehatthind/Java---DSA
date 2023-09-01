/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.startingjava;

/**
 *
 * @author RehatThind
 */
public class TypeCasting2 {
    public static void main(String[] args) {
        byte b = 42;
        short s = 1024;
        char c = 'a';
        int i = 1234;
        long l = 123;
        float f = 12.3f;
        double d = 12.3d;
        double result = (f*b)+(i/c)-(d-s) ;
        System.out.println((f*b) +" "+ (i/c) +" "+ (d-s));
        System.out.println(result);
        
    }
}
