package pbo.mod.pkg2;

import java.util.*;

public class PBOMOD2 {

    String pilih;
    Scanner dea = new Scanner(System.in);
    ArrayList<coffee> kopi = new ArrayList<>();
    coffee PBOMOD2 = new coffee();

    public static void main(String[] args) {
        PBOMOD2 d = new PBOMOD2();
        d.menu();
    }

    public void menu() {
        System.out.println("=======================================");
        System.out.println("--- Selamat Datang di Coffee Alumni ---");
        System.out.println("1. Pemesanan Kopi");
        System.out.println("2. Keluar");
        System.out.println("=======================================");
        System.out.print("\n Pilih salah satu : ");
        pilih = dea.next();
        switch (pilih) {
            case "1":
                pesan();
                break;
            case "3":
                System.out.println("--- TERIMA KASIH ---");
        }
    }

    public void pesan() {
        try {
            coffee satu = new coffee();
            satu.setNama_kopi("Arabica");
            satu.setAsal_kopi("Timur Tengah");
            kopi.add(satu);

            coffee dua = new coffee();
            dua.setNama_kopi("Robusta");
            dua.setAsal_kopi("Eropa");
            kopi.add(dua);

            coffee tiga = new coffee();
            tiga.setNama_kopi("Flores");
            tiga.setAsal_kopi("Asia");
            kopi.add(tiga);
            for (int i = 0; i < kopi.size(); i++) {
                int j = i + 1;
                System.out.println("\nMenu kopi " + j + " : " + kopi.get(i).getNama_kopi() + " berasal dari " + kopi.get(i).getAsal_kopi());
                ;
            }
            System.out.print("\nPilih Menu Kopi :");
            pilih = dea.next();
            switch (pilih) {
                case "1":
                    System.out.println("\nPesanan anda adalah kopi " + kopi.get(0).getNama_kopi() + " berasal dari " + kopi.get(0).getAsal_kopi());
                    lanjut();
                    break;
                case "2":
                    System.out.println("\nPesanan anda adalah kopi " + kopi.get(1).getNama_kopi() + " berasal dari " + kopi.get(1).getAsal_kopi());
                    lanjut();
                    break;
                case "3":
                    System.out.println("\nPesanan anda adalah kopi " + kopi.get(2).getNama_kopi() + " berasal dari " + kopi.get(2).getAsal_kopi());
                    lanjut();
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("Mohon maaf , pilihan berupa angka");
        }
    }

    public void topping() {
        try {
            coffee empat = new coffee();
            empat.setTopping("Susu");
            kopi.add(empat);

            coffee lima = new coffee();
            lima.setTopping("Gula");
            kopi.add(lima);

            coffee enam = new coffee();
            enam.setTopping("Oreo");
            kopi.add(enam);
            for (int i = 3; i < kopi.size(); i++) {
                int j = i + 1;
                System.out.println("\nMenu Topping " + j + " : " + kopi.get(i).getTopping());
            }
            System.out.print("\nPilih Menu Topping :");
            pilih = dea.next();
            switch (pilih) {
                case "4":
                    System.out.println("\nPesanan anda adalah Topping " + kopi.get(3).getTopping());
                    break;
                case "5":
                    System.out.println("\nPesanan anda adalah Topping " + kopi.get(4).getTopping());
                    break;
                case "6":
                    System.out.println("\nPesanan anda adalah Topping " + kopi.get(5).getTopping());
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("Mohon maaf , pilihan berupa angka");
        }
    }

    public void lanjut() {
        System.out.println("\nIngin melanjutkan? (yes/no)");
        String pilih = new Scanner(System.in).nextLine();
        switch (pilih) {
            case "yes":
                topping();
                break;
            case "no":
                System.out.println("---TERIMAKASIH---");
        }
    }
}
