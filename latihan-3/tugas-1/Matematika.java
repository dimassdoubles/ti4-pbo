public class Matematika {
    int angka1, angka2;

    public Matematika(int angka1, int angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    void pertambahan() {
        System.out.println(angka1 + " + " + angka2 + " = " + (angka1+angka2));
    }

    void pengurangan() {
        System.out.println(angka1 + " - " + angka2 + " = " + (angka1-angka2));
    }

    void perkalian() {
        System.out.println(angka1 + " x " + angka2 + " = " + (angka1*angka2));
    }

    void pembagian() {
        System.out.println(angka1 + " / " + angka2 + " = " + (angka1/angka2));
    }

    public static void main(String[] args) {
        Matematika matematika = new Matematika(20, 2);
        matematika.pertambahan();
        matematika.pengurangan();
        matematika.perkalian();
        matematika.pembagian();
    }
}
