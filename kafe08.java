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
        } else {
            System.out.println("Kode Promo Invalid! Tidak ada diskon tambahan");
        }
    }
    
    public static void main(String[] args) {
        Menu("Dewi", true , "DISKON30");
    }
}

