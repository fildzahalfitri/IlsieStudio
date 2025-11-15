
import java.util.Scanner;

public class PengisianKRS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- PENGISIAN KRS MAHASISWA ---");
        System.out.print("Masukkan Nama Anda : ");
        String namaMhs = input.nextLine();
        System.out.print("Masukkan NIM Anda  : ");
        String nimMhs = input.nextLine();
        
        Mahasiswa mhs = new Mahasiswa(namaMhs, nimMhs);
        
        String lagi; 
        
        do {
            System.out.println("\n--- Tambah Mata Kuliah ---");
            System.out.print("Kode Mata Kuliah : ");
            String kode = input.nextLine();
            System.out.print("Nama Mata Kuliah : ");
            String namaMK = input.nextLine();
            System.out.print("Jumlah SKS       : ");
            int sks = input.nextInt();
            input.nextLine(); 
            
            MataKuliah mkBaru = new MataKuliah(kode, namaMK, sks);
            
            mhs.tambahMK(mkBaru);

            System.out.print("\nTambah Mata Kuliah lagi (y/n)? ");
            lagi = input.nextLine();
            
        } while (lagi.equalsIgnoreCase("y"));
        
        mhs.cetakKRS();
        
        System.out.println("\n--- PENGISIAN KRS SELESAI ---");
        input.close();
    }
}
