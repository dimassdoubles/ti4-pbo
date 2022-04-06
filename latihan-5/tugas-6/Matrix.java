import java.util.Scanner;

public class Matrix {
    // x adalah baris, y adalah kolom
    int x, y;
    int[][] matrix;

    public Matrix(int x, int y) {
        this.x = x;
        this.y = y;
        matrix = new int[x][y];
    }

    void input() {
        Scanner keyboard = new Scanner(System.in);

        for (int i=0; i < x; i++) {
            for (int j=0; j< y; j++) {
                System.out.print("Input elemen baris " + (i+1) + " kolom " + (j+1) +" : ");
                matrix[i][j] = keyboard.nextInt();
            }
        }
    }
    
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2, 2);
    }
}
