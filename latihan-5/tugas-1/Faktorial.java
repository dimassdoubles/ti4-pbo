public class Faktorial {
    public static void main(String[] args) {
        int bilangan = 5;
        int prev_result = 1;
        int next_result;

        System.out.println("Bilangan : " + bilangan);
        for (int i=2; i < bilangan+1; i++) {
            next_result = prev_result * i;
            System.out.println(prev_result + " x " + i + " = " + next_result);
            prev_result = next_result;
        }
    }
}