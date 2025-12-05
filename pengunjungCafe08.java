public class pengunjungCafe08 {
    
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("===== DAFTAR PENGUNJUNG KAFE =====");
        System.out.println("Jumlah pengunjung: " + namaPengunjung.length);
        System.out.println("\nDaftar nama pengunjung:");
        
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println((i + 1) + ". " + namaPengunjung[i]);
        }
        System.out.println("==================================\n");
    }
    
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Ali", "Budi", "Citra", "Doni", "Eka");
        daftarPengunjung("Sari");
    }
} 

