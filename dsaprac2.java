public class dsaprac2 {
    public static void main(String[] args){
        //print all the diagonals of a matrix both major and minor
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        // Print major diagonals
        System.out.println("Major Diagonals:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();

        // Print minor diagonals
        System.out.println("Minor Diagonals:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == arr.length - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}
