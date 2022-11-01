package inputuser;

import java.util.Objects;
import java.util.Scanner;

public class inputUser {
    //untuk menunggu inputan dari user
    public static void main(String[] args) {
        //scanner
        Scanner vita = new Scanner(System.in);
        System.out.println("input Nama : ");
        vita.nextLine();
        double S;
        double S1;
        double S2;
        double A;
        double R;
        System.out.println("input Tinggi Mula Mula : ");
        A = vita.nextDouble();
        System.out.println("input choef R : ");
        R = vita.nextDouble();
        S1 = A / (1 - R);
        S2 = S1 * R;
        S = S2 + S1;
        System.out.println("Panjang Lintasan Naik Adalah= " + S1);
        System.out.println("Panjang Assailant Turun Adalah = " + S2);
        System.out.println("Panjang Assailant Total =" + S);
        if (Objects.equals(S, "Bilangan habis di bagi 2")) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }
        System.out.println();
    }
}
