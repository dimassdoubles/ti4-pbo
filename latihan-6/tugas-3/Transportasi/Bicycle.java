package Transportasi;

public class Bicycle {
    public String model;
    public int roda = 2;
    public int gigi = 0;
    public boolean nyala = false;
    public static int mesin = 0; // class variable

    public Bicycle(String model, int roda) {
        this.model = model;
        this.roda = roda;
    }

    public void maju() {
        if (nyala) {
            System.out.println(model + " Maju .........");
        } else {
            System.out.println("Bicycle belum dinyalakan");
        }
        
    }

    public void mundur() {
        if (nyala) {
            System.out.println(model + " Mundur .......");
        } else {
            System.out.println("Bicycle belum dinyalakan");
        }
        

    }

    public void belok() {
        if (nyala) {
            System.out.println(model + " Belok ........");
        } else {
            System.out.println("Bicycle belum dinyalakan");
        }
    }

    public void ubahGigi() {
        if (nyala) {
            System.out.println(model + " Ganti Gigi ...");
        } else {
            System.out.println("Bicycle belum dinyalakan");
        }
    }



    public void hidupkanBicycle() {
        System.out.println("Menyalakan " + model + ", Brum brum ...");
        nyala = true;
    }

    public void matikanBicycle() {
        System.out.println("Mematikan " + model + ".");
        nyala = false;
    }
}