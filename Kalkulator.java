import java.util.Scanner;

class Aritmatika {
    // Static Method
    public static int penjumlahan(int a, int b) {
        return a + b;
    }

    public static int pengurangan(int a, int b) {
        return a - b;
    }

    // Non-Static Method
    public int perkalian(int a, int b) {
        return a * b;
    }

    public double pembagian(double a, double b) {
        if (b == 0) {
            System.out.println("Pembagian tidak bisa dengan nol!");
            return 0;
        }
        return a / b;
    }

    // Method untuk menyederhanakan pecahan
    public void sederhana(int pembilang, int penyebut) {
        int gcd = findGCD(pembilang, penyebut);
        pembilang /= gcd;
        penyebut /= gcd;
        System.out.println("Pecahan sederhana: " + pembilang + "/" + penyebut);
    }

    private int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
}


public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aritmatika aritmatika = new Aritmatika();

        System.out.print("Masukkan nilai 1: ");
        int a = input.nextInt();
        System.out.print("Masukkan nilai 2: ");
        int b = input.nextInt();

        System.out.println("Hasil Penjumlahan: " + Aritmatika.penjumlahan(a, b));
        System.out.println("Hasil Pengurangan: " + Aritmatika.pengurangan(a, b));
        System.out.println("Hasil Perkalian: " + aritmatika.perkalian(a, b));
        System.out.println("Hasil Pembagian: " + aritmatika.pembagian(a, b));

        aritmatika.sederhana(a, b);
    }
}