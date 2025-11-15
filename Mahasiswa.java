/* 
Fildzah Hayyu Alfitri
255150400111015
*/

public class Mahasiswa {
    
    private String nama;
    private String nim;

    private MataKuliah[] daftarMK;
    private int jumlahMKdiambil;
    private int totalSKS;

    public static final int SKS_Maksimal = 24;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;

        this.daftarMK = new MataKuliah[10];
        this.jumlahMKdiambil = 0;
        this.totalSKS = 0;
    }

    public boolean tambahMK(MataKuliah mkBaru) {
        if (this.totalSKS + mkBaru.getSKS() > SKS_Maksimal) {
            System.out.println("GAGAL : SKS Melebihi batas 24 SKS!");
            return false;
        }

        if (this.jumlahMKdiambil >= this.daftarMK.length) {
            System.out.println("GAGAL : KRS Penuh(Maks 10 Matkul)!");
            return false;
        }

        this.daftarMK[this.jumlahMKdiambil] = mkBaru;
        this.jumlahMKdiambil++;
        this.totalSKS += mkBaru.getSKS();

        System.out.println("BERHASIL : Mata Kuliah " + mkBaru.getnamaMK() + " ditambahkan.");
        return true;
    }

    public void cetakKRS() {
        System.out.println("\n\n==================================================================");
        System.out.println("                 KARTU RENCANA STUDI (KRS)");
        System.out.println("==================================================================");
        System.out.printf("%-15s: %s\n", "Nama Mahasiswa", this.nama);
        System.out.printf("%-15s: %s\n", "NIM", this.nim);
        System.out.println("------------------------------------------------------------------");
        System.out.println("                   DAFTAR MATA KULIAH DISETUJUI");
        System.out.println("------------------------------------------------------------------");

        System.out.printf("%-5s %-12s %-30s %s\n", "No.", "Kode MK", "Nama Mata Kuliah", "SKS");
        System.out.println("------------------------------------------------------------------");
        
        for (int i = 0; i < this.jumlahMKdiambil; i++) {
            MataKuliah mk = this.daftarMK[i]; 
            System.out.printf("%-5d %-12s %-30s %d\n", 
                (i + 1), 
                mk.getkodeMK(), 
                mk.getnamaMK(), 
                mk.getSKS()
            );
        }
        
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-49s: %d\n", "TOTAL SKS DIAMBIL", this.totalSKS);
        System.out.println("==================================================================");
        
        
        System.out.printf("\n%77s\n", "Malang, 15 November 2025");
        System.out.printf("%70s\n", "Mengetahui,");
        System.out.printf("%75s\n", "Kepala Program Studi");
        System.out.printf("\n\n\n"); 
        System.out.printf("%76s\n", "Fildzah Hayyu Alfitri");
        System.out.printf("%75s\n", "NIM. 255150400111015");
    }
}
