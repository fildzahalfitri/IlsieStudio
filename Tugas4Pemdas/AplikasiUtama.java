package Tugas4Pemdas;

import java.util.Scanner;

public class AplikasiUtama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%-25s: ", "Masukkan NIM Mahasiswa");
        String nim = input.nextLine();

        System.out.printf("%-25s: ", "Masukkan Nama Mahasiswa");
        String nama = input.nextLine();

        Mahasiswa mhs = new Mahasiswa(nim, nama);

        String lagi = "y";
        while (lagi.equalsIgnoreCase("y")) {
            System.out.println("\n--- Input Buku ---");
            System.out.print("Masukkan No ISBN : ");
            String isbn = input.nextLine();

            System.out.print("Masukkan Judul   : ");
            String judul = input.nextLine();

            Buku bukuBaru = new Buku(isbn, judul);

            mhs.pinjam(bukuBaru);

            System.out.print("Tambah buku lagi? (y/n): ");
            lagi = input.nextLine();
        }

        System.out.println("\n");
        mhs.cetakData();

        input.close();
    }
}