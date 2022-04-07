import id.ac.dinus.lib.*;
import id.ac.dinus.test.*;

public class AksesLib {
    public static void main(String[] args) {
        MyLib mLib = new MyLib();
        YourLib yLib = new YourLib();
        HisLib hLib = new HisLib();

        mLib.cetak();
        yLib.cetak();
        hLib.cetak();
    }
}
