public class additonoftwomatrices {//additon of the two matrices
    public static void main(String[]args){
    int[][] m1={{2,4},{5,3}};
    int[][] m2= {{7,8},{9,2}};
    int[][] sum=new int[2][2];
    for (int i=0;i<2;i++){
        for (int j=0;j<2;j++){
            sum[i][j]=m1[i][j]+m2[i][j];
            System.out.println(" "+sum[i][j]);

        }System.out.println();
    }
//multiplication of two matrices
    
    int[][] prod=new int[2][2];
    for (int i=0;i<m1.length;i++){
        for (int j=0;j<m2[0].length;j++){
            for (int k=0;k<m1[0].length;k++){

            prod[i][j]+=(m1[i][k]*m2[k][j]);
            }
            System.out.println(prod[i][j]);

        }
    }
//upper and lower triangle of a square matrix
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int n = matrix.length;
    System.out.println("Upper Triangle:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i <= j) {
                System.out.print(matrix[i][j] + " ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println();
    }
    System.out.println("Lower Triangle:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i >= j) {
                System.out.print(matrix[i][j] + " ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println();
    }
    //to check wether the matrix is an identity matrix or not
    boolean isIdentity = true;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == j && matrix[i][j] != 1) {
                isIdentity = false;
            } else if (i != j && matrix[i][j] != 0) {
                isIdentity = false;
            }
        }
    }
    if (isIdentity) {
        System.out.println("The matrix is an identity matrix.");
    } else {
        System.out.println("The matrix is not an identity matrix.");
    }
    //calculate the sum o the main diagonal and the anti diagonal of the matrix 
    int mainDiagonalSum = 0;
    int antiDiagonalSum = 0;    
    for (int i = 0; i < n; i++) {
        mainDiagonalSum += matrix[i][i];
        antiDiagonalSum += matrix[i][n - 1 - i];
    }
    System.out.println("Main Diagonal Sum: " + mainDiagonalSum);
    System.out.println("Anti Diagonal Sum: " + antiDiagonalSum);
}}

