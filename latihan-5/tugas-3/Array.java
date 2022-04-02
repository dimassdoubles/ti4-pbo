import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] nilai;
        int n = 5;
        nilai = new int[n];

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Jumlah Data : " + n);

        for (int i = 0; i < n; i++) {
            System.out.print("Data ke - " + (i+1) + " = ");
            nilai[i] = keyboard.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Hasil nilai[" + i + "] = " + nilai[i]);
        }

    }
    
}
