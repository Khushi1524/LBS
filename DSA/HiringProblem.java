package DSA;

import java.util.Random;

public class HiringProblem {

    public static int hiringAlgorithm(int[] arr) {
        int bestcandidate = Integer.MIN_VALUE;
        int hires = 0;

        // Loop through the array to count how many hires can be made
        for (int i = 0; i < arr.length; i++) {
            int candidate = arr[i];
            if (candidate > bestcandidate) {
                bestcandidate = candidate;
                hires++;
            }
        }
        return hires;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        Random random = new Random();
        // Populate the array with random scores between 0 and 99
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        long s = System.nanoTime();
        int totalhires = hiringAlgorithm(arr);
        long e = System.nanoTime();

        // Print out the candidate scores
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

        // Print the total hires and execution time
        System.out.println("\nTotal hires: " + totalhires);
        System.out.println("Execution time: " + (e - s) + " nanoseconds");

        // Calculate and display the memory usage
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long usedmem = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory used: " + usedmem + " bytes");
    }
}
