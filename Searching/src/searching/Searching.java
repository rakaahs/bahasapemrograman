/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package searching;

import java.util.Scanner;
public class Searching {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        String[] a= {
            "meja",
            "kursi",
            "pintu",
            "pensil",
            "payung",
            "tas"
        };
        int detect = 0;
        String cari;
        for(int i = 0; i< a.length; i++){
            System.out.println((i+1)+". "+a[i]);
        }
        System.out.println("----------");
        System.out.print("cari : ");
        cari = masuk.nextLine ();
        for(int i= 0; i < a.length; i++) {
            if(cari.equalsIgnoreCase(a[i])) {
                System.out.println("nomor " +(i+1));
                detect++;
            }
        }
            if(detect == 0){
            System.out.println("data tidak ada");
        }
    }  
}
