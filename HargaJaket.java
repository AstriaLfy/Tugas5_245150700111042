import java.util.Scanner;


class Jaket {
    public static final int HARGA_A = 100000;
    public static final int HARGA_B = 125000;
    public static final int HARGA_C = 175000;

    private int totalHarga = 0;

    public void beliJaketA(int jumlah) {
        int harga = (jumlah > 100) ? 95000 : HARGA_A;
        totalHarga += harga * jumlah;
    }

    public void beliJaketB(int jumlah) {
        int harga = (jumlah > 100) ? 120000 : HARGA_B;
        totalHarga += harga * jumlah;
    }

    public void beliJaketC(int jumlah) {
        int harga = (jumlah > 100) ? 160000 : HARGA_C;
        totalHarga += harga * jumlah;
    }

    public void tampilkanTotal() {
        System.out.println("Total harga pembelian: Rp " + totalHarga);
    }
}


public class HargaJaket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Jaket jaket = new Jaket();

        System.out.print("Masukkan jumlah jaket A yang dibeli: ");
        int jumlahA = input.nextInt();
        jaket.beliJaketA(jumlahA);

        System.out.print("Masukkan jumlah jaket B yang dibeli: ");
        int jumlahB = input.nextInt();
        jaket.beliJaketB(jumlahB);

        System.out.print("Masukkan jumlah jaket C yang dibeli: ");
        int jumlahC = input.nextInt();
        jaket.beliJaketC(jumlahC);

        jaket.tampilkanTotal();
    }
}
