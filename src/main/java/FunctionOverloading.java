/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RehatThind
 */
public class FunctionOverloading {
    public static void main(String[] args) {
         int ans= fun(7,8);
         System.out.println(ans);
         
    }
    static int fun(int a, int b , int c){
        return a+b+c;
    }
    static int fun(int a, int b){
        return a+b;
    }
}
