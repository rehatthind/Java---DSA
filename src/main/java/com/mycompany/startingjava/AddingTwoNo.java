/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.startingjava;
import java.util.Scanner;
/**
 *
 * @author RehatThind
 */
public class AddingTwoNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int sum1 = number1 +number2;
        System.out.println("sum is" + sum1);
        
        float num1 =sc.nextFloat();
        float num2 = sc.nextFloat();
        float sum2 = num1 + num2 ;
        System.out.println("sum = " + sum2);
    }
    
}
