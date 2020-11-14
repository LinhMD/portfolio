/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinhMD;

/**
 *
 * @author USER
 */
public class MathUtility {
    public static final double PI = 3.14159;
    public static long getFactorial(int n){
        if(n < 0 || n > 20) throw new IllegalArgumentException("Input to big");
        if(n == 0)
            return 1;
        else 
            return n * getFactorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(getFactorial(4));
    }
}
