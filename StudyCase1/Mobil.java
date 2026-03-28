package StudyCase1;
public class Mobil extends Kendaraan {
    private boolean pakaiSupir; 
    private double tarifSupirPer6Jam; 

    public Mobil(String merk, String plat, int kapasitas, double hargaPer6Jam, boolean pakaiSupir, double tarifSupirPer6Jam) {
        super(merk, plat, kapasitas, hargaPer6Jam);
        this.pakaiSupir = pakaiSupir;
        this.tarifSupirPer6Jam = tarifSupirPer6Jam;
    }

    @Override
    public double hitungTotalBayar(int jam) {
        int jumlahPaket = hitungJumlahPaket(jam); 
        double totalSewaMobil = jumlahPaket * hargaPer6Jam;
        
        if (pakaiSupir == true) {
            double totalSupir = jumlahPaket * tarifSupirPer6Jam;
            return totalSewaMobil + totalSupir; 
        } else {
            return totalSewaMobil; 
        }
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("======= DETAIL MOBIL KELUARGA =======");
        tampilkanInfoDasar(); 
        
        String statusLayanan;
        if (pakaiSupir == true) {
            statusLayanan = "Pakai Supir (Tambah biaya)";
        } else {
            statusLayanan = "Lepas Kunci (Bawa Sendiri)";
        }
        
        System.out.printf("%-15s : %s\n", "Layanan", statusLayanan);
        
        System.out.printf("%-15s : %s\n", "Fasilitas Free", "Air Mineral, P3K, Payung");
        System.out.printf("%-15s : %s\n", "Aturan", "Wajib punya SIM A untuk Lepas Kunci");
        System.out.println("=====================================");
    }
}
