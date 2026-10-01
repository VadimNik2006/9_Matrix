public class Matrix {
    private double[][] data;
    private int rows;
    private int cols;

    public Matrix(double[][] data) {
        rows = data.length;
        cols = data[0].length;

        this.data = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }

    public Matrix add(Matrix m) {
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = data[i][j] + m.data[i][j];
            }
        }

        return new Matrix(result);
    }

    public static Matrix add(Matrix m1, Matrix m2) {
        return m1.add(m2);
    }

    public Matrix multiply(double number) {
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = data[i][j] * number;
            }
        }

        return new Matrix(result);
    }

    public static Matrix multiply(Matrix m, double number) {
        return m.multiply(number);
    }

    public Matrix multiply(Matrix m) {
        double[][] result = new double[rows][m.cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < m.cols; j++) {
                for (int k = 0; k < cols; k++) {
                    result[i][j] += data[i][k] * m.data[k][j];
                }
            }
        }

        return new Matrix(result);
    }

    public static Matrix multiply(Matrix m1, Matrix m2) {
        return m1.multiply(m2);
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }

            System.out.println();
        }
    }
}