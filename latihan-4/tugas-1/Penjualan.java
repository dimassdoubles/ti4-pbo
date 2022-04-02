import java.util.Scanner;

public class Penjualan {
    String kode, nama;
    int harga;
    int jumlah;
    

    void setData(String kode, String nama, int harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    int getTotalPembelian() {
        return harga*jumlah;
    }

    String getBonus() {
        int totalPembelian = getTotalPembelian();
        if ((totalPembelian >= 500000) && (jumlah > 5)){
            return "Setrika";
        } else if ((totalPembelian >= 100000) && (jumlah > 3)) {
            return "Payung";
        } else if ((totalPembelian >= 50000) || (jumlah > 2)) {
            return "Ballpoint";
        }
        return "";
    }

    void cetakNota() {
        System.out.println("[=] Kode           : " + kode);
        System.out.println("[=] Nama           : " + nama);
        System.out.println("[=] Harga          : " + harga);
        System.out.println("[=] Jumlah         : " + jumlah);
        System.out.println("[=] Total          : " + getTotalPembelian());
        String bonus = getBonus();
        if (!(bonus.equals(""))) {
            System.out.println("[=] Bonus          : " + bonus);
        }
    }

}
