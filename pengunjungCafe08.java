public class pengunjungCafe08 {
    
  public static void daftarPengunjung(String... namaPengunjung) {
    System.out.println("===== DAFTAR PENGUNJUNG KAFE =====");
    System.out.println("Jumlah pengunjung: " + namaPengunjung.length);
    System.out.println("\nDaftar nama pengunjung:");
    
    int nomor = 1;
    for (String nama : namaPengunjung) {
        System.out.println(nomor + ". " + nama);
        nomor++;
    }
    System.out.println("==================================\n");
}
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Ali", "Budi", "Citra", "Doni", "Eka");
        daftarPengunjung("Sari");
    }
} 

