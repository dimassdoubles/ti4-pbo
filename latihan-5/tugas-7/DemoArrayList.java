import java.util.ArrayList;
import java.util.Scanner;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nilai1 = new ArrayList<Integer>();
        ArrayList<Integer> nilai2 = new ArrayList<Integer>();
        ArrayList<Integer> jumlah = new ArrayList<Integer>();
        ArrayList<Integer> kali = new ArrayList<Integer>();
        ArrayList<Integer> bagi = new ArrayList<Integer>();
        Scanner keyboard = new Scanner(System.in);
        int n;
        System.out.print("Jumlah data di dalam ArrayList : ");
        n = keyboard.nextInt();

        System.out.println("\nNILAI 1");
        for (int i = 0; i < n; i++) {
            nilai1.add(i); 
            System.out.println("Index ke " + i + " : " + nilai1.get(i));
        }
        System.out.println("\nNILAI 2");
        for (int i = 0; i < n; i++) {
            nilai2.add(i);
            System.out.println("Index ke " + i + " : " + nilai2.get(i));
        }

        for (int i = 0; i < n; i++) {
            jumlah.add(nilai1.get(i) + nilai2.get(i));
            kali.add(nilai1.get(i) * nilai2.get(i));
            if (!nilai2.get(i).equals(0)) {
                bagi.add(nilai1.get(i) / nilai2.get(i));
            } else {
                bagi.add(0);
            }
        }

        System.out.println("\nJUMLAH");
        for (int i = 0; i < n; i++) {
            System.out.println("Index ke " + i + " : " + jumlah.get(i));
        }

        System.out.println("\nKALI");
        for (int i = 0; i < n; i++) {
            System.out.println("Index ke " + i + " : " + kali.get(i));
        }

        System.out.println("\nBAGI");
        for (int i = 0; i < n; i++) {
            System.out.println("Index ke " + i + " : " + bagi.get(i));
        }
    }


    
}
