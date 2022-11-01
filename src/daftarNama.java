public class daftarNama {
    public static void main(String[] args) {
        String[] nama = new String[6];
        nama[0] = "vita";
        nama[1] = "tiara";
        nama[2] = "disa";
        nama[3] = "dina";
        nama[4] = "bomo";
        nama[5] = "ozi";

        for (int i = 0; i < nama.length; i++) {
            System.out.println("nama ke " + i + " adalah " + nama[i]);
            System.out.println("nama mengandung a");
            System.out.println("nama mengandung i");
        }
    }
}
