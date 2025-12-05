import java.util.Scanner;

public class hitungBalok08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l, t, L, volume;
        
        System.out.print("Masukkan panjang: ");
        p = sc.nextInt();
        
        System.out.print("Masukkan lebar: ");
        l = sc.nextInt();
        
        System.out.print("Masukkan tinggi: ");
        t = sc.nextInt();
        
        L = p * l;
        
        volume = p * l * t;

        System.out.println("Luas persegi panjang adalah: " + L);
        System.out.println("Volume balok adalah: " + volume);
        
        sc.close();
    }
}

