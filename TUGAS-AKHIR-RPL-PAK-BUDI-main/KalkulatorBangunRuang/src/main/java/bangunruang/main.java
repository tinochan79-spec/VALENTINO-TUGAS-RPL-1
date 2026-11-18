package bangunruang;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class main {

    // Menampilkan judul bagian
    static void tampilkanHeader(String judul) {
        System.out.println("=== " + judul + " ===");
    }

    // Luas lingkaran = π × r²
    static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    // Reamur = Celcius × 4/5
    static double konversiCelciusKeReamur(double celcius) {
        return celcius * 4.0 / 5.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        tampilkanHeader("Menghitung Luas Lingkaran");
        System.out.print("Masukkan jari-jari: ");
        double jariJari = input.nextDouble();
        double luasLingkaran = hitungLuasLingkaran(jariJari);
        System.out.println("Luas lingkaran = " + luasLingkaran + "\n");

        tampilkanHeader("Konversi Suhu Celcius ke Reamur");
        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = input.nextDouble();
        double reamur = konversiCelciusKeReamur(celcius);
        System.out.println(celcius + " C = " + reamur + " R\n");

        input.close();
    }
}