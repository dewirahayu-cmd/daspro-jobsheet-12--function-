public class pengunjungCafe08 {

    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Pengunjung hari ini:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra"); 
        daftarPengunjung();                        
        daftarPengunjung("Sari");                  
    }
}


