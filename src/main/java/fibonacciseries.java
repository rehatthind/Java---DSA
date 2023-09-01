/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author RehatThind
 */
public class fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int a = 0;
                int b = 1;
                int count = 2;
                while(count<=n){
                    int temp = b;
                    b = b + a;
                    a=temp;
                    count++;
                            
                }
                System.out.println(b);
    }
    
}
