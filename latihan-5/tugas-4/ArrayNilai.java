import java.util.Scanner;

public class ArrayNilai {
    public static void main(String[] Args) {
        int n = 2;
        Nilai[] daftarNilai = new Nilai[n];

        for (int i = 0; i < n; i++) {
            inputNilai(i, daftarNilai);
            System.out.println("");
        }

        for (int i = 0; i < n; i++) {
            daftarNilai[i].cetakNilai();
            System.out.println("");
        }
    }

    static void inputNilai(int i, Nilai[] daftarNilai) {
        Scanner keyboard = new Scanner(System.in);
        Nilai nilai;
        String nim, nama;
        Double nilaiUts, nilaiTugas, nilaiUas;

        System.out.print("[!] Masukan NIM         : ");
        nim = keyboard.nextLine();
        System.out.print("[!] Masukan Nama        : ");
        nama = keyboard.nextLine();
        System.out.print("[!] Masukan Nilai Tugas : ");
        nilaiTugas = keyboard.nextDouble();
        System.out.print("[!] Masukan Nilai UTS   : ");
        nilaiUts = keyboard.nextDouble();
        System.out.print("[!] Masukan Nilai UAS   : ");
        nilaiUas = keyboard.nextDouble();

        nilai = new Nilai(nim, nama);
        nilai.setNilaiTugas(nilaiTugas);
        nilai.setNilaiUts(nilaiUts);
        nilai.setNilaiUas(nilaiUas);
        // System.out.println(nilai.nilaiTugas + ", " + nilai.nilaiUts + ", " + nilai.nilaiUas);

        daftarNilai[i] = nilai;
    }
}
