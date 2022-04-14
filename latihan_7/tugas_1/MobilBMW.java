package latihan_7.tugas_1;
import latihan_2.tugas_1.Mobil;

public class MobilBMW extends Mobil {
    MobilBMW(String model, int roda) {
        super(model, roda);
    }

    public void nontonTV() {
        System.out.println("TV dihidupkan");
        System.out.println("TV mencari channel");
        System.out.println("TV menampilkan gambar");
    }
}
