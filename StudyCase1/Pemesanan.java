package StudyCase1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pemesanan {
    private Pelanggan pelanggan;
    private Kendaraan kendaraan;
    private int lamaSewa; 
    
    private LocalDateTime waktuMulai;
    private LocalDateTime waktuSelesai;

    public Pemesanan(Pelanggan pelanggan, Kendaraan kendaraan, int lamaSewa, LocalDateTime waktuMulai, LocalDateTime waktuSelesai) {
        this.pelanggan = pelanggan;
        this.kendaraan = kendaraan;
        this.lamaSewa = lamaSewa;
        this.waktuMulai = waktuMulai;
        this.waktuSelesai = waktuSelesai;
    }

    public double hitungTotalAkhir() {
        double hargaKotor = kendaraan.hitungTotalBayar(lamaSewa);
        double nominalDiskon = hargaKotor * pelanggan.hitungDiskon();
        return hargaKotor - nominalDiskon;
    }

    public void simpanKeHistory() {
        DateTimeFormatter formatHistory = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String tanggal = waktuMulai.format(formatHistory);
        
        String catatan = "[" + tanggal + "] Sewa " + kendaraan.getMerk() + " (" + lamaSewa + " Jam) - Rp " + hitungTotalAkhir();
        pelanggan.tambahHistory(catatan);
    }

    public void cetakNota() {
        System.out.println("\n=========================================");
        System.out.println("          NOTA PEMESANAN TRAVEL          ");
        System.out.println("=========================================");
        
        pelanggan.tampilkanInfo();
        kendaraan.tampilkanInfo(); 
    
        DateTimeFormatter formatStruk = DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm");
        
        String teksMulai = waktuMulai.format(formatStruk);
        String teksSelesai = waktuSelesai.format(formatStruk);

        System.out.println("\n======= DETAIL WAKTU SEWA =======");
        System.out.printf("%-15s : %s WIB\n", "Waktu Mulai", teksMulai);
        System.out.printf("%-15s : %s WIB\n", "Waktu Selesai", teksSelesai);
        System.out.printf("%-15s : %d Jam\n", "Durasi Sewa", lamaSewa);
        System.out.println("=================================");
        
        double hargaKotor = kendaraan.hitungTotalBayar(lamaSewa);
        double nominalDiskon = hargaKotor * pelanggan.hitungDiskon();
        
        System.out.println("\n======= RINCIAN PEMBAYARAN =======");
        System.out.printf("%-17s : Rp %.0f\n", "Harga Sewa", hargaKotor);
        System.out.printf("%-17s : Rp %.0f\n", "Diskon Member", nominalDiskon);
        System.out.println("---------------------------------");
        System.out.printf("%-17s : Rp %.0f\n", "TOTAL BAYAR", hitungTotalAkhir());
        System.out.println("=========================================\n");
        
        simpanKeHistory();
    }
}