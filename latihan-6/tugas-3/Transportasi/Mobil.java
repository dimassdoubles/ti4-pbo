package Transportasi;

public class Mobil {
    public String model;
    public int roda = 4;
    public int gigi = 0;
    public boolean nyala = false;
    public static int mesin = 1; // class variable

    public Mobil(String model, int roda) {
        this.model = model;
        this.roda = roda;
    }

    public void maju() {
        if (nyala) {
            System.out.println(model + " Maju .........");
        } else {
            System.out.println("Mobil belum dinyalakan");
        }
        
    }

    public void mundur() {
        if (nyala) {
            System.out.println(model + " Mundur .......");
        } else {
            System.out.println("Mobil belum dinyalakan");
        }
        

    }

    public void belok() {
        if (nyala) {
            System.out.println(model + " Belok ........");
        } else {
            System.out.println("Mobil belum dinyalakan");
        }
    }

    public void ubahGigi() {
        if (nyala) {
            System.out.println(model + " Ganti Gigi ...");
        } else {
            System.out.println("Mobil belum dinyalakan");
        }
    }



    public void hidupkanMobil() {
        System.out.println("Menyalakan " + model + ", Brum brum ...");
        nyala = true;
    }

    public void matikanMobil() {
        System.out.println("Mematikan " + model + ".");
        nyala = false;
    }
}