/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joel.prim;

/**
 *
 * @author joels
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Prime prime = new Prime();
        if(prime.isPrime(4711)){
            System.out.println("Det var ett primtal.");
        }
        else{
            System.out.println("Det var inte ett primtal.");
        }
        System.out.println(prime.findPrime(4711));
    }
    
    int findPrime(int k){
        int c = 0;
        int h = 0;
        for (int i = 1; h <= k; i++){
            if(isPrime(i)){
                h++;
                c = i;
            }
        }
        return c;
    }
    
    boolean isPrime(int n){
        for (int i = 2; i < n; i++){
            if(n% i == 0){
                System.out.println(i);
                return false;
            }
        }
        return true;
    }
    
}
