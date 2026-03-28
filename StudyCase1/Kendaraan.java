package StudyCase1;
public abstract class Kendaraan {
    protected String merk, plat;
    protected int kapasitas;
    protected double hargaPer6Jam; 

    public Kendaraan(String merk, String plat, int kapasitas, double hargaPer6Jam) {
        this.merk = merk;
        this.plat = plat;
        this.kapasitas = kapasitas;
        this.hargaPer6Jam = hargaPer6Jam;
    }

    public String getMerk() {
        return merk;
    }

    public String getPlat() {
        return plat;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setPlat(String platBaru) {
        this.plat = platBaru;
    }

    public int hitungJumlahPaket(int jam) {
        if (jam % 6 == 0) return jam / 6;
        return (jam / 6) + 1;
    }

    public void tampilkanInfoDasar() {
        System.out.printf("%-15s : %s\n", "Armada", merk);
        System.out.printf("%-15s : %s\n", "No. Plat", plat);
        System.out.printf("%-15s : %d orang\n", "Kapasitas", kapasitas); 
    } 

    public abstract double hitungTotalBayar(int jam);
    public abstract void tampilkanInfo();
}