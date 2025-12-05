import java.util.Scanner;

public class hitungBalok08 {
    public static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }
    public static int hitungVolume(int panjang, int lebar, int tinggi) {
        int volume = panjang * lebar * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan panjang: ");
        int p = sc.nextInt();
        
        System.out.print("Masukkan lebar: ");
        int l = sc.nextInt();
        
        System.out.print("Masukkan tinggi: ");
        int t = sc.nextInt();
        
        int luasPersegi = hitungLuas(p, l);
        int volumeBalok = hitungVolume(p, l, t);
        
        System.out.println("Luas persegi panjang: " + luasPersegi);
        System.out.println("Volume balok: " + volumeBalok);
        
        sc.close();
    }
}
