package Tugas4Pemdas;

class Buku {
    String isbn;
    String judul;

    public Buku(String isbn, String judul) {
        this.isbn = isbn;
        this.judul = judul;
    }
}

class Mahasiswa {
    String nim;
    String nama;
    Buku[] daftarBuku;
    int jumlahBuku;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.daftarBuku = new Buku[50];
        this.jumlahBuku = 0;
    }

    public void pinjam(Buku bukuBaru) {
        if(jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = bukuBaru;
            jumlahBuku++;
        } else {
            System.out.println("Maaf, batas peminjaman penuh!");
        }
    }

    public void cetakData() {
        System.out.println("======================================================");
        System.out.println("Nim  : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-25s | %-50s |%n", "No", "Isbn", "Judul");
        System.out.println("----------------------------------------------------------------------------------------");

        for (int i = 0; i < jumlahBuku; i++) {
            Buku b = daftarBuku[i];
            System.out.printf("| %-3d | %-25s | %-50s |%n", (i + 1), b.isbn, b.judul);
        }
        System.out.println("----------------------------------------------------------------------------------------");
    }
}