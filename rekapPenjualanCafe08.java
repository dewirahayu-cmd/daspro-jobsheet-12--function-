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
    
    public static void tampilkanDataPenjualan(int[][] penjualan, String[] namaMenu) {
        System.out.println("\n===== REKAP PENJUALAN KAFE =====");
        System.out.print("Menu\t\t");
        for (int j = 0; j < penjualan[0].length; j++) {
            System.out.print("Hari " + (j + 1) + "\t");
        }
        System.out.println();
        System.out.println("=".repeat(80));
        
        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(namaMenu[i] + "\t");
            if (namaMenu[i].length() < 8) System.out.print("\t");
            
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("=".repeat(80));
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
        System.out.println("====================================");
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
        System.out.println("========================================");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String[] namaMenu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        
        // Array 2 dimensi: [jumlah menu][jumlah hari]
        // 5 menu, 7 hari
        int[][] dataPenjualan = new int[5][7];
        
        System.out.println("===== SISTEM REKAP PENJUALAN KAFE IBU MARIANA =====");
        
        // Memanggil fungsi input data penjualan
        inputDataPenjualan(dataPenjualan, namaMenu, sc);
        
        // Memanggil fungsi tampilkan seluruh data penjualan
        tampilkanDataPenjualan(dataPenjualan, namaMenu);
        
        // Memanggil fungsi tampilkan menu dengan penjualan tertinggi
        tampilkanPenjualanTertinggi(dataPenjualan, namaMenu);
        
        // Memanggil fungsi tampilkan rata-rata penjualan
        tampilkanRataRataPenjualan(dataPenjualan, namaMenu);
        
        sc.close();
    }
}