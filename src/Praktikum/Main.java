package Praktikum;


public class Main {

    public static void main(String[] args) {

        System.out.println("- KEGIATAN 1 SAYANG -");

        int n = 3;

        //GENAP GANJIL NOTASI O(n^2)

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("\t" + "|" + i + "\t" + "- ");
                System.out.println(" \t" + j + "|" + "\t");
            }
        }

        System.out.println("- KEGIATAN 2 SAYANG -");

        //GENAP NOTASI O((n^2)/2)
        //GANJIL NOTASI O(n(n+1)/2)

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j += 2) {
                System.out.print("\t" + "|" + i + "\t" + "- ");
                System.out.println(" \t" + j + "|" + "\t");
            }
        }


    }
}