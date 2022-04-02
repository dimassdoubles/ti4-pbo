import java.util.Scanner;

public class TestPenjualan {
    public static void main(String[] args) {
        String lanjut = "";
        Scanner keyboard = new Scanner(System.in);

        do {
            input();
            System.out.print("\nInput data lagi [Y/T] ? ");
            lanjut = keyboard.nextLine();
        } while (lanjut.equals("Y"));
        
    }

    static void input() {
        Penjualan minyak = new Penjualan();
        String kode, nama;
        int harga, jumlah;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("\n[!] Masukan Kode   : ");
        kode = keyboard.nextLine();
        System.out.print("[!] Masukan Nama   : ");
        nama = keyboard.nextLine();
        System.out.print("[!] Masukan Harga  : ");
        harga = keyboard.nextInt();
        System.out.print("[!] Masukan Jumlah : ");
        jumlah = keyboard.nextInt();

        System.out.println("");

        minyak.setData(kode, nama, harga, jumlah);
        minyak.cetakNota();
    }
}
