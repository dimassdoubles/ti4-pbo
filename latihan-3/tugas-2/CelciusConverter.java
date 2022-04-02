public class CelciusConverter {
    Double c;

    public CelciusConverter(Double c) {
        this.c = c;
    }

    void toKelvin() {
        Double result = c + 273.15;
        System.out.println("[=] C to K  : " + result);

    }

    void toFahrenheit() {
        Double result = c * 1.8 + 32.0;
        System.out.println("[=] C to F  : " + result);
    }

    void toRangkine() {
        Double result = c * 1.8 + 497.67;
        System.out.println("[=] C to Ra : " + result);
    }

    void toDelisle() {
        Double result = (100.0 - c) * 1.5;
        System.out.println("[=] C to De : " + result);
    }

    void toNewton() {
        Double result = c * 33.0 / 100.0;
        System.out.println("[=] C to N  : " + result);
    }

    void toReamur() {
        Double result = c * 0.8;
        System.out.println("[=] C to Re : " + result);

    }

    void toRomer() {
        Double result = c * 21.0 / 40.0 + 7.5;
        System.out.println("[=] C to Ro : " + result);
    }

    public static void main(String[] args) {
        CelciusConverter celcius = new CelciusConverter(14.0);
        celcius.toKelvin();
        celcius.toFahrenheit();
        celcius.toRangkine();
        celcius.toDelisle();
        celcius.toNewton();
        celcius.toReamur();
        celcius.toRomer();
    }
}
