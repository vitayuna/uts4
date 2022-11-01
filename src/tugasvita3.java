import java.util.Scanner;

public class tugasvita3 {
    public static void main(String[] args) {

        String[] Nama = new String[2];

        Scanner scan =new Scanner(System.in);

        for (int i = 0; i < Nama.length;i++){
            System.out.println("masukan nama ke-" + i + " = ");
            Nama[i] = scan.nextLine();


            System.out.println("----------------------------------");

        }

        for ( String b : Nama){
            if((b.contains("a"))||(b.contains("i"))) {
                System.out.println("mengandung huruf a dan i");
            }else  {
                System.out.println("tidak mengandung huruf a dan i");
            }
        }

    }
}




