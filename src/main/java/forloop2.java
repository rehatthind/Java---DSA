/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author RehatThind
 */
public class forloop2 {
    public static void main(String[] args) {
     //3 no a b c which is max ?//
     Scanner sc= new Scanner(System.in);
     int a = sc.nextInt();  
int b = sc.nextInt(); 
int c = sc.nextInt(); 
int max=a;
if(b>max){
    max=b;
}
if(c>max){
  max=c;
}
        System.out.println(max);

}
}