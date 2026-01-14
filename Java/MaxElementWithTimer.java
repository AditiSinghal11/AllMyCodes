public class MaxElementWithTimer {
    public static void main(String[] args) {
        // Simple 5-element array
        int[] arr = {5, 12, 3, 8, 20};

        // Start timer
        long start = System.nanoTime();

        // Simple loop to find the maximum element
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // End timer
        long end = System.nanoTime();
        long durationNs = end - start;

        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Max element: " + max);
        System.out.printf("Time taken: %d ns (%.3f ms)%n", durationNs, durationNs / 1_000_000.0);
    }
}
