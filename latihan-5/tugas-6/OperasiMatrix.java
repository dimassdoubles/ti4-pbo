import java.util.Scanner;

public class OperasiMatrix {
    // mA = matriks A, mB = matriks B
    int[][] mA, mB;
    int xA, xB;
    int yA, yB;

    public OperasiMatrix(Matrix mA, Matrix mB) {
        this.mA = mA.matrix;
        this.mB = mB.matrix;
        this.xA = mA.x;
        this.xB = mB.x;
        this.yA = mA.y;
        this.yB = mB.y;
    }

    void jumlahkan() {
        // MResult adalah objek matrix
        // mResult adalah arraynya
        Matrix MResult;
        int[][] mResult;
        Boolean ordoSama = xA == xB && yA == yB;

        if (ordoSama) {
            MResult = new Matrix(xA, yA);
            mResult = MResult.matrix;
            for (int i=0; i<xA; i++) {
                for (int j=0; j<yA; j++) {
                    mResult[i][j] = mA[i][j] + mB[i][j];
                }
            }
            cetakMatrix(MResult);
        } else {
            System.out.println("Maaf, penjumlahan tidak dapat dilakukan.");
        }
    }

    void kalikan() {
        // perkalian matriks akan menghasilkan
        // matriks dengan ordo x, y
        // dimana x adalah jumlah baris matriks A, dan 
        // y adalah jumlah kolom matriks B

        Matrix MResult = new Matrix(xA, yB);
        int[][] mResult = MResult.matrix;

        if (xB == yA) {
            // iterasi untuk baris A
            for (int i = 0; i < xA; i++) {
                // iterasi untuk kolom A
                for (int a = 0; a < yA; a++) {
                    // iterasi untuk baris B

                    // temp adalah variabel untuk menyimpan
                    // value yang akan di assign ke 
                    // mResult
                    int temp = 0;
                    for (int j = 0; j < xA; j++) {
                        temp += mA[i][j] * mB[j][a];
                    }

                    mResult[i][a] = temp;
                }
            }
        } else {
            System.out.println("Maaf, perkalian tidak dapat dilakukan.");
        }

        cetakMatrix(MResult);
    }

    void cetakMatrix(Matrix M) {
        int [][] m = M.matrix;
        for (int i = 0; i < M.x; i++) {
            System.out.print("    ");
            for (int j = 0; j < M.y; j++) {
                System.out.print(m[i][j] + "  ");
            }
            System.out.println("\n");
        }
    }
    
    public static void main(String[] args) {
        int xA, xB;
        int yA, yB;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("MATRIKS A");
        System.out.print("Input baris matriks A : ");
        xA = keyboard.nextInt();
        System.out.print("Input kolom matriks A : ");
        yA = keyboard.nextInt();
        Matrix mA = new Matrix(xA, yA);
        mA.input();

        System.out.println("\nMATRIKS B");
        System.out.print("Input baris matriks B : ");
        xB = keyboard.nextInt();
        System.out.print("Input kolom matriks B : ");
        yB = keyboard.nextInt();
        Matrix mB = new Matrix(xB, yB);
        mB.input();

        OperasiMatrix oMatrix = new OperasiMatrix(mA, mB);
        System.out.println("\nHASIL PENJUMLAHAN\n");
        oMatrix.jumlahkan();
        System.out.println("\nHASIL PERKALIAN\n");
        oMatrix.kalikan();
    }
}
