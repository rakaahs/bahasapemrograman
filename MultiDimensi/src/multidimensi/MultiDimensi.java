/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensi;

import java.util.Scanner;
public class MultiDimensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah barang
        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = input.nextInt();

        // Mendefinisikan array multidimensi untuk menyimpan daftar barang dan harga
        String[][] daftarBarangHarga = new String[jumlahBarang][2];

        // Mengisi array dengan data barang dan harga
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.print("Masukkan nama barang ke-" + (i + 1) + ": ");
            daftarBarangHarga[i][0] = input.next();

            System.out.print("Masukkan harga barang ke-" + (i + 1) + ": ");
            daftarBarangHarga[i][1] = input.next();
        }

        // Menampilkan daftar barang dan harga
        System.out.println("\nDaftar Barang dan Harga:");
        System.out.printf("%-20s%-10s\n", "Barang", "Harga");
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.printf("%-20s%-10s\n", daftarBarangHarga[i][0], daftarBarangHarga[i][1]);
        }
    }
}
