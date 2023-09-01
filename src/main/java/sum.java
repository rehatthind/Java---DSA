/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RehatThind
 */
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        System.out.println("enter first number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("enter second number");
        int y = sc.nextInt();
        int sum = x + y;
        System.out.println(sum);
    }
}
