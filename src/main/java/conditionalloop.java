/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RehatThind
 */
public class conditionalloop {
    public static void main(String[] args) {
        int num=123456;
        int ans = 0;
        while(num>0){
            int rem =num % 10;
            num/=10;
                   ans= ans*10+ rem;

        }
        
        
        System.out.println(ans);
        
    }
}
