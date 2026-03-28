package StudyCase1;
public class Pelanggan {
    private String nama;
    private String noKTP;
    private String nomorHP;
    private boolean apakahMember; 
    private String historyPemesanan;

    public Pelanggan(String nama, String noKTP, String nomorHP, boolean apakahMember) {
        this.nama = nama;
        this.noKTP = noKTP;
        this.nomorHP = nomorHP;
        this.apakahMember = apakahMember;
        this.historyPemesanan = ""; 
    }

    public Pelanggan(String nama, String noKTP, String nomorHP) {
        this.nama = nama;
        this.noKTP = noKTP;
        this.nomorHP = nomorHP;
        this.apakahMember = false; 
        this.historyPemesanan = ""; 
    }

    public String getNama() {
        return nama;
    }

    public boolean getApakahMember() {
        return apakahMember;
    }

    public void setNomorHP(String nomorHPBaru) {
        this.nomorHP = nomorHPBaru;
    }

    public double hitungDiskon() {
        if (apakahMember == true) {
            return 0.10; 
        } else {
            return 0.0;
        }
    }

    public void tambahHistory(String catatanBaru) {
        if (apakahMember == true) {
            historyPemesanan = historyPemesanan + "- " + catatanBaru + "\n"; 
        }
    }

    public void tampilkanInfo() {
        System.out.println("\n======= DATA PELANGGAN =======");
        // Pake printf biar titik duanya otomatis rata!
        System.out.printf("%-15s : %s\n", "Nama Lengkap", nama);
        System.out.printf("%-15s : %s\n", "No. KTP", noKTP);
        System.out.printf("%-15s : %s\n", "No. HP", nomorHP);
        
        if (apakahMember == true) {
            System.out.printf("%-15s : %s\n", "Status", "Member Aktif (Diskon 10%)");
            System.out.println("--- History Transaksi ---");
            if (historyPemesanan.equals("")) {
                 System.out.println("Belum ada transaksi.");
            } else {
                 System.out.print(historyPemesanan);
            }
        } else {
            System.out.printf("%-15s : %s\n", "Status", "Bukan Member");
            System.out.println("--- History Transaksi ---");
            System.out.println("Fitur ini khusus untuk Member.");
        }
        System.out.println("==============================");
    }
}