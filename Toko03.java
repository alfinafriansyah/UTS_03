package UTS;

import java.util.Scanner;

public class Toko03 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);

        String nama, barang, tipe;
        int qty, jumlah = 0;
        double diskon, disBarang, bayar, jmlDiskon = 0, totalDiskon = 0, harga = 0, total = 0, disMember = 0;
        char tambah, member;

        System.out.println("Program Toko");
        System.out.print("Masukkan nama anda: ");
        nama = input03.nextLine();

        do {
            System.out.print("Masukkan produk yang Anda beli: ");
            barang = input03.nextLine();
            System.out.print("Banyaknya: ");
            qty = input03.nextInt();
            System.out.print("Harga: ");
            harga = input03.nextInt();
            System.out.print("Diskon (%): ");
            diskon = input03.nextInt();
            System.out.print("Apakah Anda ingin menambahkan produk (Y/N)? ");
            tambah = input03.next().charAt(0);
            // Menghitung jumlah barang yang dibeli
            jumlah = jumlah + qty;
            // Merubah diskon menjadi %
            diskon = diskon / 100;
            // Menghitung harga
            harga = harga * qty;
            // Menghitung diskon barang
            disBarang = harga * diskon;
            // Menghitung jumlah diskon
            jmlDiskon = jmlDiskon + disBarang;
            // Menghitung total harga
            total = total + harga;
        }
        while (tambah == 'y');
        System.out.print("Apakah Anda punya kartu member (Y/N)? ");
        member = input03.next().charAt(0);
        if (member == 'y'){
            tipe = "Member";
            if (total >= 200000){
                disMember = 0.1;
            }else {
                disMember = 0;
            }
        }else {
            tipe = "Bukan Member";
        }
        disMember = disMember * total;
        totalDiskon = jmlDiskon + disMember;
        bayar = total - totalDiskon;
        System.out.println("--------------------------Total Pembelian--------------------------");
        System.out.println("Nama Pelanggan                : " + nama);
        System.out.println("Tipe                          : " + tipe);
        System.out.println("Total item barang yang dibeli : " + jumlah);
        System.out.println("Subtotal                      : " + total);
        System.out.println("Total Diskon                  : " + totalDiskon);
        System.out.println("Total yang harus dibayar      : " + bayar);
        System.out.println("-------------------------------------------------------------------");

    }
}
