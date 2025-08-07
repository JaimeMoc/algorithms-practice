// Jaime Moctezuma.
// Fibonacci using Top Down.
// Time complexity: O(n).

import java.util.Arrays;

public class Fibonacci {
    // Public method (wrapper)
    public static int fibonacci (int n){
        // Array for memorization, size n+1
        int [] memo = new int [n + 1];
        // Initialize all values to -1 (not computed)
        Arrays.fill(memo, -1);
        // Call the recursive method with memorization.
        return fibonacci(n, memo);
    }

    // Recursive method with memorization
    private static int fibonacci(int n, int [] memo){
        // Base case
        if (n == 0 ) return 0;
        if (n == 1 ) return 1;

        // if it's already computed, return it
        if (memo[n] != -1) return memo[n];

        // If not computed, solve it recursively
        memo [n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        return memo[n];
    }

    // Main method to test it
    public static void main(String[] args){
        int n = 5; // For example, calculate Fibonacci(10)
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    }
}