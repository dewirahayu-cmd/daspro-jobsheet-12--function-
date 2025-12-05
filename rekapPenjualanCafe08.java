import java.util.Scanner;

public class rekapPenjualanCafe08 {
    
    public static void inputDataPenjualan(int[][] penjualan, String[] namaMenu, Scanner sc) {
        System.out.println("\n===== INPUT DATA PENJUALAN =====");
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("\n--- " + namaMenu[i] + " ---");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }
    
    public static void inputNamaMenu(String[] namaMenu, Scanner sc) {
        System.out.println("\n===== INPUT NAMA MENU =====");
        sc.nextLine();
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = sc.nextLine();
        }
    }
    
    public static void tampilkanDataPenjualan(int[][] penjualan, String[] namaMenu) {
        System.out.println("\n===== REKAP PENJUALAN KAFE =====");
        
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("\n" + namaMenu[i] + ":");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.println("  Hari ke-" + (j + 1) + ": " + penjualan[i][j] + " porsi");
            }
        }
        System.out.println("\n" + "=".repeat(50));
    }
    
    public static void tampilkanPenjualanTertinggi(int[][] penjualan, String[] namaMenu) {
        int[] totalPerMenu = new int[penjualan.length];
        
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            totalPerMenu[i] = total;
        }
        
        int indexTertinggi = 0;
        int nilaiTertinggi = totalPerMenu[0];
        for (int i = 1; i < totalPerMenu.length; i++) {
            if (totalPerMenu[i] > nilaiTertinggi) {
                nilaiTertinggi = totalPerMenu[i];
                indexTertinggi = i;
            }
        }
        
        System.out.println("\n===== MENU PENJUALAN TERTINGGI =====");
        System.out.println("Menu: " + namaMenu[indexTertinggi]);
        System.out.println("Total penjualan: " + nilaiTertinggi + " porsi");
        System.out.println("=".repeat(50));
    }
    
    public static void tampilkanRataRataPenjualan(int[][] penjualan, String[] namaMenu) {
        System.out.println("\n===== RATA-RATA PENJUALAN PER MENU =====");
        
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / penjualan[i].length;
            System.out.println(namaMenu[i] + ": " + rataRata + " porsi/hari");
        }
        System.out.println("=".repeat(50));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== SISTEM REKAP PENJUALAN KAFE IBU MARIANA =====");
       
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();
        
       
        String[] namaMenu = new String[jumlahMenu];
        int[][] dataPenjualan = new int[jumlahMenu][jumlahHari];
        
        // Input nama menu
        inputNamaMenu(namaMenu, sc);
        
        // Input data penjualan
        inputDataPenjualan(dataPenjualan, namaMenu, sc);
        
        // Tampilkan seluruh data penjualan
        tampilkanDataPenjualan(dataPenjualan, namaMenu);
        
        // Tampilkan menu dengan penjualan tertinggi
        tampilkanPenjualanTertinggi(dataPenjualan, namaMenu);
        
        // Tampilkan rata-rata penjualan
        tampilkanRataRataPenjualan(dataPenjualan, namaMenu);
        
        sc.close();
    }
}