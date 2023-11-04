import java.util.Scanner;

public class UTS_08_Dimas {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        String nama08, ukuranBaju08, khusus08 = "Ahmad";
        // char ukuranBaju12;
        int jumlahPakaian08;
        double diskon08 = 0.02d, tambahan08 = 5000, biaya08 = 50000, biayaPakaian08 = 0, biayaJumlah08 = 0,
                biayaTotal08;

        // masukkan data pembeli
        System.out.print("Masukkan nama pelanggan : ");
        nama08 = input08.next();
        System.out.print("Masukkan ukuran baju yang dipesan (M / L) : ");
        ukuranBaju08 = input08.next();
        System.out.print("Masukkan jumlah baju yang dipesan : ");
        jumlahPakaian08 = input08.nextInt();

        // masukkan rincian pakaian anda
        if (ukuranBaju08.equalsIgnoreCase("L")) {
            System.out.println("Anda dikenai tambahan biaya sebesar 5000 per pakaian");
            biayaPakaian08 = (biaya08 + tambahan08) * jumlahPakaian08;
            System.out.println("Biaya dari pakaian anda adalah = " + biayaPakaian08);
        } else if (ukuranBaju08.equalsIgnoreCase("M")) {
            biayaPakaian08 = biaya08 * jumlahPakaian08;
            System.out.println("Biaya dari pakaian anda adalah = " + biayaPakaian08);
        } else {
            System.out.println("Ukuran baju yang anda pilih saat ini tidak tersedia.");
        }

        // kondisi apakah nama pembeli ahmad dan kumlah beli sebanyak lebih dari 3
        if (nama08.equalsIgnoreCase(khusus08) && jumlahPakaian08 > 3) {
            biayaJumlah08 = biayaPakaian08 * diskon08;
            System.out.println("Biaya dengan diskon: " + biayaJumlah08);
        } else {
            System.out.println("Tidak dapat diskon");
        }

        biayaTotal08 = biayaPakaian08 - biayaJumlah08;
        System.out.println("total biaya anda adalah " + biayaTotal08);
    }
}