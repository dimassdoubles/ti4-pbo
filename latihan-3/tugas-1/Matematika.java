public class Matematika {
    Double angka1, angka2;

    public Matematika(Double angka1, Double angka2) {
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

}
