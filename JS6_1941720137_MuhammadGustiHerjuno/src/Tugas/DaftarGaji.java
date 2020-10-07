package Tugas;

public class DaftarGaji {
    public Pegawai[] listPegawai;
    public int jumlahPegawaiSaatIni;

    DaftarGaji(int jumlahPegawai){
        listPegawai = new Pegawai[jumlahPegawai];
    }

    public void addPegawai(Pegawai p){
        listPegawai[jumlahPegawaiSaatIni] = p;
        jumlahPegawaiSaatIni++;
    }

    public void printSemuaGaji(){
        System.out.println("--- PROGRAM GAJI ---");
        System.out.println("-----------------------------------------");
        for(int i=0; i<jumlahPegawaiSaatIni; i++){
            System.out.print(listPegawai[i].getNama()+ " Mendapatkan gaji sebesar ");
            System.out.println("Rp."+listPegawai[i].getGaji());
        }
    }
}

