/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RehatThind
 */
public class conditionalloop2 {
    public static void main(String[] args) {
        int n = 13425622;
       int count=0;
       while(n>0){
         int rem= n%10;
         if(rem==2){
             count++;
         }
           n=n/10;
       }
        System.out.println(count);
    }
}
