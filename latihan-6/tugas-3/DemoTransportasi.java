import Transportasi.*;

public class DemoTransportasi {
    public static void main(String[] args) {
        Mobil avanza = new Mobil("Avanza", 4);
        avanza.hidupkanMobil();
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        avanza.ubahGigi();
        avanza.matikanMobil();

        System.out.println("");

        System.out.println("Roda " + avanza.model + "  : " + avanza.roda);
        System.out.println("Mesin " + avanza.model + " : " + avanza.mesin);

        Bicycle bmx = new Bicycle("Bmx", 2);
        bmx.hidupkanBicycle();
        bmx.maju();
        bmx.mundur();
        bmx.belok();
        bmx.ubahGigi();
        bmx.matikanBicycle();

        System.out.println("");

        System.out.println("Roda " + bmx.model + "  : " + bmx.roda);
        System.out.println("Mesin " + bmx.model + " : " + bmx.mesin);
    }
}