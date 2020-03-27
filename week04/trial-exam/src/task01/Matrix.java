package task01;

public class Matrix {
    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {1, 0, 1},
                {0, 2, 2},
                {1, 2, 5},
        };

        if (isSymmetric(matrix)) {
            System.out.println("The given matrix is symmetric...");
        } else {
            System.out.println("The given matrix is not symmetric...");
        }

    }
    public static boolean isSymmetric(int[][] mylist) {
        int rows = mylist.length;
        int cols = mylist[0].length;
        boolean symmetric = true;

        if (rows != cols) {
            System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (mylist[i][j] != mylist[j][i]) {
                        symmetric = false;
                        break;
                    }
                }
            }
        }
        return symmetric;
    }
}