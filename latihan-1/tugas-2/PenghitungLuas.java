import java.util.Scanner;

public class PenghitungLuas {
    public static void main(String[] args) {
        String jenisBangun;
        Double luasBangun;

        System.out.println("PROGRAM PENGHITUNG LUAS & KELILING"); 
        System.out.println("\nPilihan Bangun: ");
        System.out.println("[P] Persegi ");
        System.out.println("[S] Segitiga ");
        System.out.println("[L] Lingkaran ");
        System.out.println("[K] Kubus \n");

        Scanner keyboard = new Scanner(System.in);

        System.out.print("[!] Masukan kode bangun: ");
        jenisBangun = keyboard.nextLine();

        hitungLuasKeliling(jenisBangun, keyboard);
        
    }

    static void hitungLuasKeliling(String jenisBangun, Scanner keyboard) {   
        System.out.println("");
        jenisBangun = jenisBangun.toUpperCase();

        if (jenisBangun.equals("P")) {
            hitungPersegi(keyboard);
        } else if (jenisBangun.equals("S")) {
            hitungSegitiga(keyboard);
        } else if (jenisBangun.equals("L")) {
            hitungLingkaran(keyboard);
        } else if (jenisBangun.equals("K")) {
            hitungKubus(keyboard);
        } else {
            System.out.println("[X] Kode Bangun Tidak Valid");
        }
    }

    static void hitungPersegi(Scanner keyboard) {
        Double sisi, luas, keliling;

        System.out.print("[!] Masukan Panjang Sisi Persegi : ");
        sisi = keyboard.nextDouble();
        luas = sisi * sisi;
        keliling = sisi * 4;
        tampilkanHasil(luas, keliling);
    }

    static void hitungSegitiga(Scanner keyboard) {
        // s = separuh keliling segitiga
        Double sisi1, sisi2, sisi3, s, luas, keliling;
        
        System.out.print("[!] Masukan Panjang Sisi 1 : ");
        sisi1 = keyboard.nextDouble();
        System.out.print("[!] Masukan Panjang Sisi 2 : ");
        sisi2 = keyboard.nextDouble();
        System.out.print("[!] Masukan Panjang Sisi 3 : ");
        sisi3 = keyboard.nextDouble();

        keliling = sisi1 + sisi2 + sisi3;
        s = keliling / 2;
        luas = Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
        
        tampilkanHasil(luas, keliling);
    }

    static void hitungLingkaran(Scanner keyboard) {
        Double d, luas, keliling;
        Double phi = 3.14;

        System.out.print("[!] Masukan Diameter Lingkaran : ");
        d = keyboard.nextDouble();

        if ((d % 7) == 0) {
            luas = 22 / 7 * (d / 2) * (d / 2);
            keliling = 22 / 7 * d;
        } else {
            luas = phi * (d / 2) * (d / 2);
            keliling = phi * d;
        }

        tampilkanHasil(luas, keliling);
    }

    static void hitungKubus(Scanner keyboard) {
        Double sisi, luas, keliling;

        System.out.print("[!] Masukan Panjang Sisi : ");
        sisi = keyboard.nextDouble();

        luas = (sisi * sisi) * 6;
        keliling = sisi * 12;

        tampilkanHasil(luas, keliling);
    }

    static void tampilkanHasil(Double luas, Double keliling) {
        System.out.println("[=] Luas     : " + luas);
        System.out.println("[=] Keliling : " + keliling);
    }
}