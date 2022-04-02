public class KonversiDetik {

    int detik;

    public KonversiDetik(int detik) {
        this.detik = detik;
    }

    void konversikan() {
        int hari = Math.floorDiv(detik, 86400);
        int sisaDetik = detik % 86400;
        int jam = Math.floorDiv(sisaDetik, 3600);
        sisaDetik = sisaDetik % 3600;
        int menit = Math.floorDiv(sisaDetik, 60);
        sisaDetik = sisaDetik % 60;

        if (hari > 0) {
            System.out.println("[=] Hari   : " + hari);
        }

        if (jam > 0) {
            System.out.println("[=] Jam    : " + jam);
        }

        if (menit > 0) {
            System.out.println("[=] Menit  : " + menit);
        }

        if (detik > 0) {
            System.out.println("[=] Detik  : " + sisaDetik);
        }
    }

}
