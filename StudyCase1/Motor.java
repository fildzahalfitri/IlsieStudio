package StudyCase1;
public class Motor extends Kendaraan {
    private int jumlahHelm;

    public Motor(String merk, String plat, int kapasitas, double hargaPer6Jam, int jumlahHelm) {
        super(merk, plat, kapasitas, hargaPer6Jam);
        this.jumlahHelm = jumlahHelm;
    }

    @Override
    public double hitungTotalBayar(int jam) {
        int jumlahPaket = hitungJumlahPaket(jam);
        double totalHarga = jumlahPaket * hargaPer6Jam;
        
        if (jumlahPaket >= 4) {
            double diskon = totalHarga * 0.10;
            totalHarga = totalHarga - diskon; 
        }
        
        return totalHarga;
    }

    public void tampilkanInfo() {
        System.out.println("======= DETAIL SEPEDA MOTOR =======");
        tampilkanInfoDasar(); 
        System.out.printf("%-15s : %d buah\n", "Jumlah Helm", jumlahHelm);
        System.out.printf("%-15s : %s\n", "Fasilitas Free", "Jas Hujan (2), STNK, Bensin Full");
        System.out.println("===================================");
    }
}