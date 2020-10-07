package Tugas;

public class MainClass {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();
        dosen1.setNip("123456");
        dosen1.setNama("Mukhtar");
        dosen1.setSKS(10);

        Dosen dosen2 = new Dosen();
        dosen2.setNip("56789");
        dosen2.setNama("Juno");
        dosen2.setSKS(11);

        DaftarGaji gaji = new DaftarGaji(2);
        gaji.addPegawai(dosen1);
        gaji.addPegawai(dosen2);
        gaji.printSemuaGaji();


    }
}
