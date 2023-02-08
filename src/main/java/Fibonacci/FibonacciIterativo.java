/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fibonacci;

/**
 *
 * @author fer
 */
public class FibonacciIterativo {

    public static void main(String[] args) {

        int fn0 = 0;
        int fn1 = 1;
        int sumafn;

        for (int i = 0; i < 10; i++) {

            sumafn = fn0 + fn1;

            fn0 = fn1;

            fn1 = sumafn;
  
            System.out.println(sumafn);

        }

    }

}
