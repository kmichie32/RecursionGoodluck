package com.kevinmichie;

public class Main {

    // f(f(f(x))) ---- x = 20
    // f(a) = 5 + a
    // f(20) = 5 + 20 = 25

    // f(f(f(20))) --- f(f(25))

    // f(25) = 5 + 25 = 30

    // f(f(f(20))) --- f(f(25)) --- f(30)

    // f(30) = 5 + 30 = 35

    // f(f(f(20))) --- f(f(25)) --- f(30) --- 35

    // Summations 5+4+3+2+1; 7+6+5+4+3+2+1; 2+1;

    //Example 1: 3+2+1
    public static int summation (int n){
        // Base Case: We are at the end!
        if( n <= 0){
            return 0;
        }
        // Keep Going!
        else {
           return n + summation(n - 1);
        }
    }

    public static int factorial (int n){
        if( n <= 1){
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    public static int exponentiation(int n, int p){
        if(p <= 0){
            return 1;
        }
        else{
            return n * exponentiation(n, p-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(summation(3));
        System.out.println();
        System.out.println(factorial(4));
        System.out.println();
        System.out.println(exponentiation(5,2));
    }
}
