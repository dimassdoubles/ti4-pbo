public class Mobil {
    String model;
    int roda = 4;
    int gigi = 0;
    boolean nyala = false;
    static int mesin = 1; // class variable

    public Mobil(String model, int roda) {
        this.model = model;
        this.roda = roda;
    }

    void maju() {
        if (nyala) {
            System.out.println(model + " Maju .........");
        } else {
            System.out.println("Mobil belum dinyalakan");
        }
        
    }

    void mundur() {
        if (nyala) {
            System.out.println(model + " Mundur .......");
        } else {
            System.out.println("Mobil belum dinyalakan");
        }
        

    }

    void belok() {
        if (nyala) {
            System.out.println(model + " Belok ........");
        } else {
            System.out.println("Mobil belum dinyalakan");
        }
    }

    void ubahGigi() {
        if (nyala) {
            System.out.println(model + " Ganti Gigi ...");
        } else {
            System.out.println("Mobil belum dinyalakan");
        }
    }



    void hidupkanMobil() {
        System.out.println("Menyalakan " + model + ", Brum brum ...");
        nyala = true;
    }

    void matikanMobil() {
        System.out.println("Mematikan " + model + ".");
        nyala = false;
    }
}