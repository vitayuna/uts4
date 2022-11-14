import java.util.Random;
import java.util.Scanner;

public class utsvitayuniasari {

        int jumlahLantai = 3;
        static int totalJumlahKendaraan = 450;
        public static String[] Lantai1 = new String[149];
        public static String[] Lantai2 = new String[149];
        public static String[] Lantai3 = new String[149];

        public static int[] bobotMaxLantai1 = {450000};
        public static int[] bobotMaxLantai2 = {200000};
        public static int[] bobotMaxLantai3 = {150000};

        public static void PrintInfokendaraan() {
            int totalLantai1 = 0;
            int totalSisaKuota = 0;
            for (int index = 0; index < Lantai1.length; index++) {
                if (Lantai1[index] != null) {
                    totalLantai1++;
                }
            }
            int totalLantai2 = 0;
            for (int index = 0; index < Lantai2.length; index++) {
                if (Lantai2[index] != null) {
                    totalLantai2++;
                }
            }
            int totalLantai3 = 0;
            for (int index = 0; index < Lantai3.length; index++) {
                if (Lantai3[index] != null) {
                    totalLantai3++;
                }
            }
            totalSisaKuota = totalJumlahKendaraan - totalLantai1 - totalLantai2 - totalLantai3;
            System.out.println("Total Kendaraan lantai 1 : " + totalLantai1 + " | total Kendaraan Lantai 2 : " + totalLantai2 + " | total Kendaraan Lantai 3 : " + totalLantai3);
            System.out.println("jumlah kapasitas : " + totalJumlahKendaraan + " | total Kendaraan : " + totalSisaKuota);
            System.out.println("-----------------------------------------------------");


        }

    public static void ChekIndexArray(String[] myArray, String kendaraan) {
        int indexNow = 0;
        for (int index = 0; index < myArray.length; index++){
            if (myArray[index] != null){
                indexNow = index + 1;
            }
        }
        if (indexNow < myArray.length){
            myArray[indexNow] = kendaraan;
        }

    }
    public static  void  simpanKendaraan(int angkaRandom, String kendaraan){
            switch (angkaRandom) {
                case 1:
                    ChekIndexArray(Lantai1, kendaraan);
                    System.out.println("anda parkir dilantai 1");
                    PrintInfokendaraan();
                    break;
                case 2:
                    ChekIndexArray(Lantai2, kendaraan);
                    System.out.println("anda parkir dilantai 2");
                    PrintInfokendaraan();
                    break;
                case 3:
                    ChekIndexArray(Lantai3, kendaraan);
                    System.out.println("anda parkir dilantai 3");
                    PrintInfokendaraan();
                    break;
            }
            }
            public static void inputkendaraan() {
                Scanner inputData = new Scanner(System.in);
                while (true){
                    System.out.println("masukan plat nomor= ");
                    String platnomor = inputData.nextLine();
                    if (platnomor.isBlank()){
                        System.out.println("plat nomor wajib di isi");
                        inputkendaraan();
                    }else {
                        Random hasilrandom = new Random();
                        int jenisrandom = hasilrandom.nextInt(3) + 1;
                        simpanKendaraan(jenisrandom, platnomor);
                    }
                }
            }
        public static void main(String[] args) {
                inputkendaraan();
        }
    }

