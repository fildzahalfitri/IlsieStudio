package StudyCase1;
import java.util.Scanner;
import java.time.LocalDateTime;

public class FilkomTravelApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Kendaraan[] daftarKendaraan = new Kendaraan[3];
        
        daftarKendaraan[0] = new Motor("Honda Vario 160", "N 1111 AA", 2, 50000, 2);
        daftarKendaraan[1] = new Mobil("Toyota Avanza", "N 2222 BB", 7, 250000, true, 100000);
        daftarKendaraan[2] = new Bus("Bus Pariwisata Executive", "N 3333 CC", 40, 1500000, true, 300000);

        System.out.println("=========================================");
        System.out.println("      SELAMAT DATANG DI FILKOM TRAVEL    ");
        System.out.println("=========================================");

        System.out.printf("%-32s : ", "Masukkan Nama Lengkap");
        String nama = input.nextLine();
        
        System.out.printf("%-32s : ", "Masukkan No. KTP");
        String ktp = input.nextLine();
        
        System.out.printf("%-32s : ", "Masukkan No. HP");
        String hp = input.nextLine();
        
        System.out.printf("%-32s : ", "Apakah Anda Member? (Ya/Tidak)");
        String jawabMember = input.nextLine();
        boolean apakahMember = jawabMember.equalsIgnoreCase("Ya");

        Pelanggan pelanggan = new Pelanggan(nama, ktp, hp, apakahMember);

        String lanjutPesan = "ya";
        
        while (lanjutPesan.equalsIgnoreCase("ya")) {
            System.out.println("\n--- DAFTAR KENDARAAN TERSEDIA ---");

            for (int i = 0; i < daftarKendaraan.length; i++) {
                System.out.println((i + 1) + ". " + daftarKendaraan[i].getMerk() + " (Kapasitas: " + daftarKendaraan[i].getKapasitas() + " orang)");
            }

            System.out.print("Pilih Kendaraan (1/2/3) : ");
            int pilihan = input.nextInt();
            
            Kendaraan kendaraanDipilih;
            if (pilihan >= 1 && pilihan <= 3) {
                kendaraanDipilih = daftarKendaraan[pilihan - 1];
            } else {
                System.out.println("Pilihan salah! Otomatis kami pilihkan Motor.");
                kendaraanDipilih = daftarKendaraan[0];
            }

            System.out.print("Masukkan Lama Sewa (Jam) : ");
            int lamaSewa = input.nextInt();
            input.nextLine(); 

            LocalDateTime waktuMulai = LocalDateTime.now();
            LocalDateTime waktuSelesai = waktuMulai.plusHours(lamaSewa);

            Pemesanan pesanan = new Pemesanan(pelanggan, kendaraanDipilih, lamaSewa, waktuMulai, waktuSelesai);
            pesanan.cetakNota();

            if (kendaraanDipilih instanceof Motor) {
                System.out.println("** PESAN SISTEM: Karena ini Motor, ingetin pelanggan bawa jas hujan! **");
            } else if (kendaraanDipilih instanceof Bus) {
                System.out.println("** PESAN SISTEM: Jangan lupa telepon supir Bus sekarang ya! **");
            }

            System.out.print("Apakah ingin menyewa kendaraan lain lagi? (Ya/Tidak) : ");
            lanjutPesan = input.nextLine();
        }

        System.out.println("\n=========================================");
        System.out.println("   TERIMA KASIH TELAH MENGGUNAKAN JASA KAMI ");
        System.out.println("=========================================");
        
        pelanggan.tampilkanInfo();

        input.close();
    }
}