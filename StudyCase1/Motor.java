package StudyCase1;
public class Motor extends Kendaraan {
    private int jumlahHelm;

    public Motor(String merk, String plat, int kapasitas, double hargaPer6Jam, int jumlahHelm) {
        super(merk, plat, kapasitas, hargaPer6Jam);
        this.jumlahHelm = jumlahHelm;
    }

    // POLIMORFISME: Perhitungan bayar khusus Motor (Ada sistem Diskon!)
    @Override
    public double hitungTotalBayar(int jam) {
        int jumlahPaket = hitungJumlahPaket(jam);
        double totalHarga = jumlahPaket * hargaPer6Jam;
        
        // Logika Diskon: Kalau sewa minimal 4 paket (24 jam), dapat diskon 10%
        if (jumlahPaket >= 4) {
            double diskon = totalHarga * 0.10;
            totalHarga = totalHarga - diskon; 
        }
        
        return totalHarga;
    }

    // POLIMORFISME: Menampilkan info khusus Motor
    @Override
    public void tampilkanInfo() {
        System.out.println("======= DETAIL SEPEDA MOTOR =======");
        tampilkanInfoDasar(); // Panggil fungsi dari induk
        System.out.printf("%-15s : %d buah\n", "Jumlah Helm", jumlahHelm);
        
        // IDE CURIAN DARI TEMAN 1: Tambahin info fasilitas biar kelihatan realistis!
        System.out.printf("%-15s : %s\n", "Fasilitas Free", "Jas Hujan (2), STNK, Bensin Full");
        
        System.out.printf("%-15s : %s\n", "Promo Khusus", "Diskon 10% untuk sewa >= 24 Jam!");
        System.out.println("===================================");
    }
}