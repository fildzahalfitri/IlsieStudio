package StudyCase1;
public class Bus extends Kendaraan {
    private boolean fasilitasKaraoke;
    private double tarifSupirPer6Jam; 

    public Bus(String merk, String plat, int kapasitas, double hargaPer6Jam, boolean fasilitasKaraoke, double tarifSupirPer6Jam) {
        super(merk, plat, kapasitas, hargaPer6Jam);
        this.fasilitasKaraoke = fasilitasKaraoke;
        this.tarifSupirPer6Jam = tarifSupirPer6Jam;
    }

    @Override
    public double hitungTotalBayar(int jam) {
        int jumlahPaket = hitungJumlahPaket(jam);
        
        double totalSewaBus = jumlahPaket * hargaPer6Jam;
        
        double totalBiayaSupir = jumlahPaket * tarifSupirPer6Jam;
        
        return totalSewaBus + totalBiayaSupir; 
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("======= DETAIL BUS PARIWISATA =======");
        tampilkanInfoDasar(); 
        
        String statusKaraoke;
        if (fasilitasKaraoke == true) {
            statusKaraoke = "Tersedia";
        } else {
            statusKaraoke = "Tidak Tersedia";
        }
        
        System.out.printf("%-15s : %s\n", "Karaoke", statusKaraoke);
        System.out.printf("%-15s : %s\n", "Aturan Khusus", "WAJIB menggunakan Supir dari travel");
        System.out.printf("%-15s : Rp %.2f / 6 Jam\n", "Tarif Supir", tarifSupirPer6Jam);
        System.out.println("=====================================");
    }
}
