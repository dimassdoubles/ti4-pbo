public class TestNilai {
   public static void main(String[] args) {
       Nilai dimas = new Nilai("A11.2020.12497", "Dimas Saputro");
       dimas.setNilaiTugas(80.0);
       dimas.setNilaiUts(90.0);
       dimas.setNilaiUas(87.0);
       dimas.hitungNilai();
       dimas.cetakNilai();
   } 
}
