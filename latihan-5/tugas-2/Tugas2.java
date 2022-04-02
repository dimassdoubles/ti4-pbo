import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        int bilangan = 20;
        int pembagi;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Bilangan : " + bilangan);
        bagi(20, 5);

        System.out.print("\nDipecah  : ");
        pembagi = keyboard.nextInt();
        bagi(bilangan, pembagi);
    }
    
    static void bagi(int bilangan, int n) {
        int kloter;
        int sisa = bilangan - (n* Math.floorDiv(bilangan, n));
        for (int i = 0; i < Math.floorDiv(bilangan, n); i++) {
            kloter = i * n;
            for (int j = 0; j < n; j++) {
                System.out.print(((j+1)+kloter) + " ");
            }
            System.out.print("\n");
        }

        if (sisa > 0) {
            kloter = Math.floorDiv(bilangan, n) * n;
            for (int j = 0; j < sisa; j++) {
                System.out.print(((j+1) + kloter) + " ");
            }
            System.out.println("\n");
        }

        System.out.println("--------------------");
    }
}
