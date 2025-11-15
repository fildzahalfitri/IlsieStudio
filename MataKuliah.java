/* 
Fildzah Hayyu Alfitri
255150400111015
*/

public class MataKuliah {
    
    private String kodeMK;
    private String namaMK;
    private int sks;

    public MataKuliah(String kode, String nama, int sks) {
        this.kodeMK = kode;
        this.namaMK = nama;
        this.sks = sks;
    }

    public String getkodeMK() {
        return this.kodeMK;
    }

    public String getnamaMK() {
        return this.namaMK;
    }
    
    public int getSKS() {
        return this.sks;
    }
}