package Tugas;

public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int tarif_SKS = 100000;

    Dosen(){

    }

    Dosen(String nip, String nama, String alamat){
        super();
        super.nip = nama;
        super.nama = nama;
        super.alamat = alamat;
    }

    public void setSKS(int SKS){
        this.jumlahSKS = SKS;
    }

    public int getGaji(){
        int total = jumlahSKS*tarif_SKS;
        return total + super.getGaji();

    }



}
