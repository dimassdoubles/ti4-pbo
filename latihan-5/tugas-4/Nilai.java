public class Nilai {
    String nim, nama;
    Double nilaiUts = 0.0, nilaiTugas = 0.0, nilaiUas = 0.0;
    Double pNilaiUts = 0.0, pNilaiTugas = 0.0, pNilaiUas = 0.0;
    Double nilaiAkhir;
    Boolean lengkap = false;

    public Nilai(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    void setNilaiUts(Double nilaiUts) {
        this.nilaiUts = nilaiUts;
        pNilaiUts = nilaiUts * 20 / 100;
    }

    void setNilaiTugas(Double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
        pNilaiTugas = nilaiTugas * 35 / 100;
    }
    
    void setNilaiUas(Double nilaiUas) {
        this.nilaiUas = nilaiUas;
        pNilaiUas = nilaiUas * 45 / 100;
    }

    void hitungNilai() {
        if (nilaiUts*nilaiTugas*nilaiUas > 0) {
            nilaiAkhir = pNilaiUts + pNilaiTugas + pNilaiUas;
            lengkap = true;
        }
    }

    void cetakNilai() {
        hitungNilai();
        if (lengkap) {
            System.out.println("NIM         : " + nim);
            System.out.println("Nama        : " + nama);
            System.out.println("Nilai Tugas : " + nilaiTugas + " 20%\t: " + pNilaiTugas);
            System.out.println("Nilai Uts   : " + nilaiUts + " 35%\t: " + pNilaiUts);
            System.out.println("Nilai Uas   : " + nilaiUas + " 45%\t: " + pNilaiUas);
            System.out.println("Nilai Akhir : " + nilaiAkhir);
        } else {
            System.out.println("Maaf, nilai belum lengkap");
        }
    }
}
