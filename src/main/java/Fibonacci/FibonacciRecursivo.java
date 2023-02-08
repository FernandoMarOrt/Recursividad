/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fibonacci;

/**
 *
 * @author fer
 */
public class FibonacciRecursivo {

    public static void main(String[] args) {

        int n = 0;

        for (int i = 0; i < 10; i++) {

            fibonacciRecursivo(n++);

        }

    }

    public static void fibonacciRecursivo(int n) {
        
        int aux;
        aux = (n - 1) + (n- 2);
        
        aux = n;

        if (n < 0) {

        } else {

            System.out.println(n);

        }

    }

}
