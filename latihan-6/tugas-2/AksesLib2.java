import id.ac.dinus.lib.MyLib;
import id.ac.dinus.lib.YourLib;
import id.ac.dinus.test.*;

public class AksesLib2 {
    public static void main(String[] args) {
        MyLib mLib = new MyLib();
        YourLib yLib = new YourLib();
        HisLib hLib = new HisLib();

        mLib.cetak();
        yLib.cetak();
        hLib.cetak();
    }
}
