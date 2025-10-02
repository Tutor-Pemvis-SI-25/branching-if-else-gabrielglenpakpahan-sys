//NIM: 12S25019 NAMA: GEBRIEL GLEN MARCEL PAKPAHAN

import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bil1, bil2;

        bil1 = Integer.parseInt(input.nextLine());
        bil2 = Integer.parseInt(input.nextLine());
        if (bil1 % 2 == 0) {
            System.out.println("Bilangan pertama: genap");
        } else {
            System.out.println("Bilangan pertama: ganjil");
        }
        if (bil2 % 2 == 0) {
            System.out.println("Bilangan kedua: genap");
        } else {
            System.out.println("Bilangan kedua: ganjil");
        }
        if (bil1 > bil2) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (bil2 > bil1) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Berbeda jenis");
            }
        }
        if (bil1 % 2 == 0 && bil2 % 2 == 0) {
            System.out.println("Hasil penjumlahan" + bil1 + bil2);
        } else {
            if (bil1 % 2 != 0 && bil2 % 2 != 0 && bil1 % 2 == 0 && bil2 % 2 == 0) {
                System.out.println("Hasil perkalian " + bil1 * bil2);
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
