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
        if(n < 0 || n > 20) throw new IllegalArgumentException("n => 0 && n <= 20");
        if(n == 0)
            return 1;

        return n * getFactorial(n - 1);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(getFactorial(i));
        }
        System.out.println(Long.MAX_VALUE);
        System.out.println(getFactorial(-5));
        System.out.println("nah");
    }
}
