class Solution {

    public boolean gan(int[][] matrix, int row, int column) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int i = row;
        int j = column;
        int value = matrix[i][j];

        while (i < rows && j < columns) {
            if (matrix[i][j] != value) {
                return false;
            }
            i++;
            j++;
        }

        return true;
    }

    public boolean isToeplitzMatrix(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        // Check diagonals starting from the first row
        for (int column = 1; column < columns; column++) {
            if (!gan(matrix, 0, column)) {
                return false;
            }
        }

        // Check diagonals starting from the first column
        for (int row = 0; row < rows; row++) {
            if (!gan(matrix, row, 0)) {
                return false;
            }
        }

        return true;
    }
}