package com.kevinmichie;

import java.io.*;
import java.util.*;

public class Solution {
    static Scanner scanner = new Scanner(System.in);

    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(scanner.nextInt()));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

