package latihanukl;
    //latihan utk menghitung biaya pengiriman paket
    //soal mudah 1
    import java.util.Scanner;
public class kurirsoal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jarak tempuh (dalam km): ");
        double jarak = input.nextDouble();
        System.out.println("Masukkan Panjang dari Paket (dalam cm): ");
        double panjang = input.nextDouble();    
        System.out.println("Masukkan Lebar dari Paket (dalam cm): ");
        double lebar = input.nextDouble();
        System.out.println("Masukkan Tinggi dari Paket (dalam cm): ");
        double tinggi = input.nextDouble();
        System.out.println("Masukkan Berat dari Paket (dalam kg): ");
        double berat = input.nextDouble();

        double volume = panjang * lebar * tinggi; // dalam cm^3
        double biayaPerKg;

        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        double biayaPengiriman = berat * biayaPerKg;

        if (volume > 100) {
            biayaPengiriman += 50000; // Biaya tambahan untuk volume besar
        }

        System.out.println("Jarak tempuh: " + jarak + " km");
        System.out.println("Volume paket: " + volume + " cm^3");
        System.out.println("Berat paket: " + berat + " kg");
        System.out.println("Biaya pengiriman paket Anda adalah: Rp " + biayaPengiriman);
        input.close();

        

        
    }
}
