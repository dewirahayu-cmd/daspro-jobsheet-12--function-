import java.util.Scanner;
public class nilaiMahasiswa08 {

    // Fungsi untuk mengisi array dengan nilai dari input user
    public static void isianArray(int[] arrayNilai, Scanner sc) {
        System.out.println("\n===== INPUT NILAI MAHASISWA =====");
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrayNilai[i] = sc.nextInt();
        }
    }
    
    // Fungsi untuk menampilkan isi array
    public static void tampilArray(int[] arrayNilai) {
        System.out.println("\n===== DAFTAR NILAI MAHASISWA =====");
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + arrayNilai[i]);
        }
    }
    
    // Fungsi untuk menghitung total nilai seluruh mahasiswa
    public static int hitTot(int[] arrayNilai) {
        int total = 0;
        for (int i = 0; i < arrayNilai.length; i++) {
            total += arrayNilai[i];
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== PROGRAM NILAI MAHASISWA =====");
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();
        
        // Membuat array dengan ukuran N
        int[] nilaiMahasiswa = new int[N];
        
        // Memanggil fungsi isianArray
        isianArray(nilaiMahasiswa, sc);
        
        // Memanggil fungsi tampilArray
        tampilArray(nilaiMahasiswa);
        
        // Memanggil fungsi hitTot dan menampilkan hasilnya
        int totalNilai = hitTot(nilaiMahasiswa);
        
        System.out.println("\n===== HASIL PERHITUNGAN =====");
        System.out.println("Total nilai seluruh mahasiswa: " + totalNilai);
        System.out.println("Rata-rata nilai: " + (totalNilai / N));
        System.out.println("=============================");
        
        sc.close();
    }
}
    

