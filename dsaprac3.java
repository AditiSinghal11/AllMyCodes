public class dsaprac3 {
    public static void main(String[] args){
        //given a matrix where each row and column is sorted, search for a given number in O(m+n) time
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int target = 29; // Number to search for
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start searching from the top-right corner
        int i = 0;
        int j = cols - 1;

        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                System.out.println("Found " + target + " at (" + i + ", " + j + ")");
                return;
            } else if (matrix[i][j] > target) {
                j--; // Move left
            } else {
                i++; // Move down
            }
        }

        System.out.println(target + " not found in the matrix.");
    }
}
