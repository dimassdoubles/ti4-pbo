import java.util.Scanner;

public class TestKonversiDetik {
    public static void main(String[] args) {
        String lanjut = "";
        Scanner keyboard = new Scanner(System.in);

        do {
            input();

            System.out.print("\nInput data lagi [Y/T] ? ");
            lanjut = keyboard.nextLine();
            System.out.println("");
        } while (lanjut.equals("Y"));


    }
    
    static void input() {
        int detik;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("[!] Masukan Detik : ");
        detik = keyboard.nextInt();

        KonversiDetik konversiDetik = new KonversiDetik(detik);
        konversiDetik.konversikan();
    }
}
