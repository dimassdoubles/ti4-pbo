import java.util.Scanner;

public class TestRumusAbc {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String lanjut = "";

        do {
            input();
            System.out.print("\nInput data lagi [Y/T] ? ");
            lanjut = keyboard.nextLine();
        } while (lanjut.equals("Y"));
    }

    static void input() {
        Scanner keyboard = new Scanner(System.in);
        Double a, b, c;

        System.out.print("\n[!] Masukan a : ");
        a = keyboard.nextDouble();
        System.out.print("[!] Masukan b : ");
        b = keyboard.nextDouble();
        System.out.print("[!] Masukan c : ");
        c = keyboard.nextDouble();

        RumusAbc rumusAbc = new RumusAbc(a, b, c);
        rumusAbc.cariAkar();
    }
}