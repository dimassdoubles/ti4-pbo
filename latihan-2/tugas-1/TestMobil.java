public class TestMobil {
    public static void main(String[] args) {
        Mobil avanza = new Mobil("Avanza", 4);
        avanza.hidupkanMobil();
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        avanza.ubahGigi();
        avanza.matikanMobil();

        Mobil fuso = new Mobil("Fuso", 8);
        fuso.maju();

        System.out.println("");

        System.out.println("Roda " + avanza.model + "  : " + avanza.roda);
        System.out.println("Roda " + fuso.model + "    : " + fuso.roda);
        System.out.println("Mesin " + avanza.model + " : " + avanza.mesin);
        System.out.println("Mesin " + fuso.model + "   : " + avanza.mesin);

    }
}