import java.util.Scanner;

public class LiveCoding1A {
    public static void main(String[] args) {
        Scanner vita= new Scanner(System.in);
        int angka;
        int Faktorial= 1;
        System.out.println("masukan input:");
        angka = vita.nextInt();
        for (int i=1;i<=angka;i++) {
            Faktorial = Faktorial * i;

        }
            System.out.println("hasil faktorial:"+Faktorial);

        }
    }