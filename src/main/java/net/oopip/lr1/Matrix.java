package main.java.net.oopip.lr1;

/**
 * Matrix class consists of matrix and dimension.
 * <p>
 * This class allow to generate random matrix, perform addition, subtraction and multiplication of matrix
 */
public class Matrix {
    private int n;
    private int m;
    private int[][] matrix;

    /**
     * Returns row count
     *
     * @return row count
     */
    public int getN() {
        return n;
    }

    /**
     * Set matrix row count.
     * Not safe cause user can use {@link Matrix#generateRandomValues(int, int)} method with index out of bounds parameters
     *
     * @param n row count
     */
    @Deprecated
    public void setN(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Row count cannot be less than 1");
        }
        this.n = n;
    }

    /**
     * Returns column count
     *
     * @return column count
     */
    public int getM() {
        return m;
    }

    /**
     * Set matrix column count.
     * Not safe cause user can use {@link Matrix#generateRandomValues(int, int)} method with index out of bounds parameters
     *
     * @param m column count
     */
    @Deprecated
    public void setM(int m) {
        if (m < 1) {
            throw new IllegalArgumentException("Column count cannot be less than 1");
        }
        this.m = m;
    }

    /**
     * Returns matrix
     *
     * @return matrix
     */
    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix() {
        matrix = new int[5][5];
        this.n = 5;
        this.m = 5;
        generateRandomValues(n, m);
    }

    public Matrix(int n) {
        matrix = new int[n][n];
        this.n = n;
        this.m = n;
        generateRandomValues(n, m);
    }

    public Matrix(int n, int m) {
        matrix = new int[n][m];
        this.n = n;
        this.m = m;
        generateRandomValues(n, m);
    }

    /**
     * Filling matrix random values
     *
     * @param n row count
     * @param m column count
     */
    public void generateRandomValues(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) ((Math.random() * ((50) + 1)) - 10);
            }
        }
    }

    /**
     * Prints matrix on the screen
     */
    public void printMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "; ");
            }
            System.out.println();
        }
    }

    /**
     * Performs addition of two matrix.
     * Both matrix must have same counts of columns and rows
     *
     * @param matrix1 first matrix
     * @param matrix2 second matrix
     *
     * @return result matrix
     * @throws Exception when columns or rows counts are not the same
     */
    public static Matrix matrixAddition(Matrix matrix1, Matrix matrix2) throws Exception {
        if (matrix1.getN() == matrix2.getN() && matrix1.getM() == matrix2.getM()) {
            Matrix matrix = new Matrix(matrix1.getN(), matrix1.getM());
            for (int i = 0; i < matrix1.getN(); i++) {
                for (int j = 0; j < matrix1.getM(); j++) {
                    matrix.getMatrix()[i][j] = matrix1.getMatrix()[i][j] + matrix2.getMatrix()[i][j];
                }
            }

            return matrix;
        } else {
            throw new Exception("Cannot do matrixs addition");
        }
    }

    /**
     * Performs subtraction of two matrix.
     * Both matrix must have same counts of columns and rows
     *
     * @param matrix1 first matrix
     * @param matrix2 second matrix
     *
     * @return result matrix
     * @throws Exception when columns or rows counts are not the same
     */
    public static Matrix matrixSubtraction(Matrix matrix1, Matrix matrix2) throws Exception {
        if (matrix1.getN() == matrix2.getN() && matrix1.getM() == matrix2.getM()) {
            Matrix matrix = new Matrix(matrix1.getN(), matrix1.getM());
            for (int i = 0; i < matrix1.getN(); i++) {
                for (int j = 0; j < matrix1.getM(); j++) {
                    matrix.getMatrix()[i][j] = matrix1.getMatrix()[i][j] - matrix2.getMatrix()[i][j];
                }
            }

            return matrix;
        } else {
            throw new Exception("Cannot do matrixs substraction");
        }
    }

    /**
     * Performs multiplication of two matrix.
     * The number of columns of the first matrix must match the number of rows of the second matrix
     *
     * @param matrix1 first matrix
     * @param matrix2 second matrix
     *
     * @return result matrix
     * @throws Exception when count columns of the first matrix not matches with counts of rows the second matrix
     */
    public static Matrix matrixMultiplication(Matrix matrix1, Matrix matrix2) throws Exception {
        if (matrix1.getM() == matrix2.getN()) {
            Matrix matrix = new Matrix(matrix1.getN(), matrix2.getM());

            int multiply = 0;
            for (int n = 0; n < matrix1.getN(); n++) {
                for (int i = 0; i < matrix2.getM(); i++) {
                    for (int j = 0; j < matrix1.getM(); j++) {
                        multiply += matrix1.getMatrix()[n][j] * matrix2.getMatrix()[j][i];
                    }
                    matrix.getMatrix()[n][i] = multiply;
                    multiply = 0;
                }
            }

            return matrix;
        } else {
            throw new Exception("Cannot do matrix multiplication");
        }
    }
}
