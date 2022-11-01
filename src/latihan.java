import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner vita = new Scanner(System.in);
        String[] belanjaanSaya= new String[5];
        for (int y =0;y <belanjaanSaya.length; y++) {
            System.out.println("memasukan nama barang :");
            belanjaanSaya[y] = vita.nextLine();
        }

    }
}
