public class Main {
    public static void main(String[] args) {
        double[][] array1 = {{1, 2}, {3, 4}};
        double[][] array2 = {{5, 6}, {7, 8}};

        Matrix a = new Matrix(array1);
        Matrix b = new Matrix(array2);

        System.out.println("Матрица A:");
        a.print();

        System.out.println();

        System.out.println("Матрица B:");
        b.print();

        System.out.println();

        System.out.println("Сложение как метод экземпляра:");
        a.add(b).print();

        System.out.println();

        System.out.println("Сложение как метод класса:");
        Matrix.add(a, b).print();

        System.out.println();

        System.out.println("Умножение на число как метод экземпляра:");
        a.multiply(2).print();

        System.out.println();

        System.out.println("Умножение на число как метод класса:");
        Matrix.multiply(a, 2).print();

        System.out.println();

        System.out.println("Умножение матриц как метод экземпляра:");
        a.multiply(b).print();

        System.out.println();

        System.out.println("Умножение матриц как метод класса:");
        Matrix.multiply(a, b).print();
    }
}
