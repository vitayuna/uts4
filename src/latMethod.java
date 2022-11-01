import java.util.Scanner;

public class latMethod {
    public static void penjumlahan(int x,int y) {
        int hasil_jumlah = x + y;
        System.out.println(hasil_jumlah);

    }

    public static void main(String[] args) {
     //    penjumlahan(3,4);
     //    penjumlahan(6,10);
     //    penjumlahan(10,1000);


        Scanner inputData = new Scanner(System.in);
        System.out.println("masukan angka 1 =");
        int angka1 = inputData.nextInt();
        System.out.println("masukan angka 2 =");
        int angka2 = inputData.nextInt();
        penjumlahan(angka1, angka2);
    }

    }

