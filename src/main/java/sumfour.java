/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RehatThind
 */
import java.util.Scanner;
public class sumfour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name = " );
        String name = sc.next();
        
        String method = callname(name);
        System.out.println(method);
        
    }
    static String callname(String name){
       String message="Hi my name is  " +name;
        return message;
        
    }
}
