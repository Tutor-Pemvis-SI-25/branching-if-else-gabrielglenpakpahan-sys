//NIM: 12S25019 NAMA: GEBRIEL GLEN MARCEL PAKPAHAN, NIM: 12S25033 NAMA: MARIA OCTAVIA SIMORANGKIR //

import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double bil1, bil2;

        bil1 = Double.parseDouble(input.nextLine());
        bil2 = Double.parseDouble(input.nextLine());
        if (Math.abs(bil1) % 2 == 0) {
            System.out.println("Bilangan pertama:Genap");
        } else {
            System.out.println("Bilangan pertama: Ganjil");
        }
        if (Math.abs(bil2) % 2 == 0) {
            System.out.println("Bilangan kedua: Genap");
        } else {
            System.out.println("Bilangan kedua: Ganjil");
        }
        if (bil1 > bil2) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (bil1 < bil2) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Berbeda jenis");
            }
        }
        if (Math.abs(bil1) % 2 == 0 && Math.abs(bil2) % 2 == 0) {
            System.out.println("Hasil penjumlahan " + Math.abs(bil1) + Math.abs(bil2));
        } else {
            if (Math.abs(bil1) % 2 != 0 && Math.abs(bil2) % 2 != 0) {
                System.out.println("Hasil perkalian " + Math.abs(bil1) * Math.abs(bil2));
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
