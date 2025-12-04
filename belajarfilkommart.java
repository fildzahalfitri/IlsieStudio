//Fildzah Hayyu Alfitri
//255150400111015
//Sistem Informasi-B

import java.util.Scanner;
public class belajarfilkommart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    //input
    System.out.print("Staff Name : ");
    String name = input.nextLine();
    System.out.print("Masukkan nama barang 1 :");
    String barang1 = input.nextLine();
    System.out.print("Masukkan harga barang 1 : " );
    int harga1 = input.nextInt();
    System.out.print("Jumlah barang 1 : ");
    int jumlah1 = input.nextInt();
    input.nextLine();
    System.out.print("Masukkan nama barang 2 : ");
    String barang2 = input.nextLine();
    System.out.print("Masukkan harga barang 2 : ");
    int harga2 = input.nextInt();
    System.out.print("Jumlah barang 2 : ");
    int jumlah2 = input.nextInt();
    input.nextLine();
    System.out.print("Masukkan nama barang 3 : ");
    String barang3 = input.nextLine();
    System.out.print("Masukkan harga barang 3 : ");
    int harga3 = input.nextInt();
    System.out.print("Jumlah barang 3 : ");
    int jumlah3 = input.nextInt();
    input.nextLine();
    System.out.print("Jumlah Pembayaran :");
    int bayar = input.nextInt();
    //hitung
    int tb1 = harga1 * jumlah1;
    int tb2 = harga2 * jumlah2;
    int tb3 = harga3 * jumlah3;
    int subtotal = tb1 + tb2 + tb3;
    
    //promo
    double diskon = 0;
    int persen = 0;
    if (subtotal > 500000){
        diskon = 0.2;
        persen = 20;
    }
    else  if (subtotal > 100000){
        diskon = 0.1;
        persen = 10;
    }
    else if (subtotal > 50000){
        diskon = 0.05;
        persen = 5;
    }
    double nominaldiskon = subtotal * diskon;
    double total = subtotal - nominaldiskon;
    double kembali = bayar - total;
    //output
    System.out.println("\tFILKOM-MART");
    System.out.printf("%-5s %s", " ","JL VETERAN MALANG");
    System.out.printf("\n%-5s %s", " ","TELP 0341-577911");
    System.out.println("\n20 September 2021 \t " + "17.56");
    System.out.println("Receipt Number : \t " + "150901");
    System.out.println("Order ID : \t\t " + "FM001");
    System.out.println("Collected by : \t\t " + name);
    System.out.println("================================");
    System.out.println(barang1);
    System.out.println(jumlah1 + "\t" + "@" + harga1 + "\t\t" + tb1);
    System.out.println(barang2);
    System.out.println(jumlah2 + "\t" + "@" + harga2 + "\t\t" + tb2);
    System.out.println(barang3);
    System.out.println(jumlah3 + "\t" + "@" + harga3 + "\t\t" + tb3);
    System.out.println("================================");
    System.out.println("Subtotal \t\t" + subtotal);
    System.out.println("Diskon");
    System.out.println(persen + "%" + "\t\t\t" + (int)nominaldiskon);
    System.out.println("================================");
    System.out.println("Total " + "\t\t\t" + (int)total);
    System.out.println("Bayar " + "\t\t\t" + (int)bayar);
    System.out.println("================================");
    System.out.println("Kembali " + "\t\t" + (int)kembali);
    System.out.println("================================");
    System.out.println("Terima Kasih Telah Berbelanja di");
    System.out.println("         FILKOM-MART             ");
    input.close();
    }
}   


