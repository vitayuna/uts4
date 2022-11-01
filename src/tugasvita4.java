 import java.util.Scanner;

public class tugasvita4 {
    public static void main(String[] args) {
        Scanner vita = new Scanner(System.in);
        String[] nama = new String[6];
        for (int y = 0; y < nama.length; y++) {
            System.out.println("Memasukan nama siswa");
            nama[y] = vita.nextLine();

        }
        System.out.println("=================");
        for (String n : nama) {
            if ((n.contains("a")) || (n.contains(("i")))) {
                System.out.println("ada a atau i ");

            } else {
                System.out.println("ga ada huruf a atau i");
            }

        }

        }

}



