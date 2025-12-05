import java.util.Scanner;

public class kafe08 {
    
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("===== MENU KAFE =====");
        System.out.println("Pelanggan: " + namaPelanggan);
        
        if (isMember) {
            System.out.println("Status: Member (Dapat diskon 10%)");
        } else {
            System.out.println("Status: Non-Member");
        }
        
        System.out.println("\nDaftar Menu:");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Mie Goreng - Rp 18.000");
        System.out.println("=====================");
        
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode Promo Valid! Anda mendapat diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode Promo Valid! Anda mendapat diskon 30%");
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode Promo Invalid! Tidak ada diskon tambahan");
        }
    }
    
    public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem) {
        int[] hargaMenu = {15000, 20000, 22000, 12000, 18000};
        int hargaSatuan = hargaMenu[pilihanMenu - 1];
        int totalHarga = hargaSatuan * banyakItem;
        
        return totalHarga;
    }
    
    public static int hitungDiskon(int totalHarga, String kodePromo) {
        int totalSetelahDiskon = totalHarga;
        
        System.out.println("\nTotal harga sebelum diskon: Rp " + totalHarga);
        
        if (kodePromo.equals("DISKON50")) {
            int diskon = totalHarga * 50 / 100;
            System.out.println("Diskon 50%: Rp " + diskon);
            totalSetelahDiskon = totalHarga - diskon;
        } else if (kodePromo.equals("DISKON30")) {
            int diskon = totalHarga * 30 / 100;
            System.out.println("Diskon 30%: Rp " + diskon);
            totalSetelahDiskon = totalHarga - diskon;
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo invalid! Tidak ada pengurangan harga");
        }
        
        return totalSetelahDiskon;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();
        
        System.out.print("Apakah pelanggan member? (true/false): ");
        boolean isMember = sc.nextBoolean();
        
        sc.nextLine(); 
        System.out.print("Masukkan kode promo (kosongkan jika tidak ada): ");
        String kodePromo = sc.nextLine();
        
        Menu(namaPelanggan, isMember, kodePromo);
        
        int totalKeseluruhan = 0;
        String[] namaMenu = {"Kopi Hitam", "Cappuccino", "Latte", "Teh Tarik", "Mie Goreng"};
        
        System.out.print("\nBerapa jenis menu yang ingin dipesan? ");
        int jumlahJenisMenu = sc.nextInt();
        
        System.out.println("\n===== INPUT PESANAN =====");
        for (int i = 1; i <= jumlahJenisMenu; i++) {
            System.out.println("\nPesanan ke-" + i);
            System.out.print("Masukkan nomor menu (1-5): ");
            int pilihanMenu = sc.nextInt();
            
            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();
            
            int totalHargaMenu = hitungTotalHargaNoAbsen(pilihanMenu, banyakItem);
            totalKeseluruhan += totalHargaMenu;
            
            System.out.println("Subtotal " + namaMenu[pilihanMenu - 1] + 
                             " (" + banyakItem + " porsi): Rp " + totalHargaMenu);
        }
        
        System.out.println("\n===== RINCIAN PEMBAYARAN =====");
        int totalBayar = hitungDiskon(totalKeseluruhan, kodePromo);
        
        System.out.println("\nTotal yang harus dibayar: Rp " + totalBayar);
        
        sc.close();
    }
}