public class TestStatic1 {
    public static void main(String[] args) {
        TestStatic testStatic = new TestStatic();
        testStatic.satu();
        testStatic.dua();

        System.out.println(testStatic.a);
        System.out.println(testStatic.b);
        System.out.println(testStatic.c);
        System.out.println(testStatic.d);
        // System.out.println(testStatic.e); --> error e has private access in TestStatic
    }
}
