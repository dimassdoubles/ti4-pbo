public class RumusAbc {
    // struktur persamaan kuadrat
    // aX2 + bX + c
    Double a, b, c, x1, x2, d;

    public RumusAbc(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void hitungDeterminan() {
        d = b*b - 4*a*c;
    }

    void cariAkar() {
        hitungDeterminan();
        Boolean ketemu = false;
        Boolean imajiner = false;

        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / 2*a;
            x2 = (-b - Math.sqrt(d)) / 2*a;
            ketemu = true;
        } else if (d == 0) {
            x1 = (-b) / 2*a;
            x2 = x1;
            ketemu = true;
        } else if (d < 0) {
            x1 = (-b/2*a) + (Math.sqrt(-d)/2*a);
            x2 = (-b/2*a) - (Math.sqrt(-d)/2*a);
            imajiner = true;
            ketemu = true;
        } 
        
        if (ketemu) {
            if (imajiner) {
                System.out.println("[=] X1 : " + x1 + "i");
                System.out.println("[=] X2 : " + x2 + "i");
            } else {
                System.out.println("[=] X1 : " + x1);
                System.out.println("[=] X2 : " + x2);
            }
            
        } else {
            System.out.println("Maaf, perhitungan tidak dapat dilakukan.");
        }
    }

    
}
