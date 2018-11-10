/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author hanif
 */
import java.util.Scanner;
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Kompleks ojk = new Kompleks();
        mahasiswa data;
        Scanner kal = new Scanner(System.in);
        int input;
        int inp = 0;
        int jmh;
        do {
            do {
                System.out.println("Tugas Tentang class-object");
                System.out.println("--------------------------");
                System.out.println("1. Input data");
                System.out.println("2. Tampil Data");
                System.out.println("3. Sorting Data");
                System.out.println("4. Keluar");
                System.out.print("Pilih : ");
                input = kal.nextInt();

                if (input < 1) {
                    System.out.print("\n!!!Maaf input harus diantara 1 sampai 4[1-4]!!!\n\n");
                } else if (input > 6) {
                    System.out.print("\n!!!Maaf input harus diantara 1 sampai 4[1-4]!!!\n\n");
                }
            } while (input > 6);

            System.out.print("-----------------------------\n");

            switch (input) {
                case 1:
                    do {
                        System.out.print("Jumlah data mahasiswa yang dinput : ");
                        jmh = kal.nextInt();
                        ojk.setINDEX(jmh);
                        if (jmh > 100) {
                            System.out.print("\nJumlah data mahasiswa yang dimasukan \nmelebihi kapasitas yang ditentukan\n\n");
                        }
                    } while (jmh > 100);
                    for (int i = 0; i < jmh; i++) {

                        data = new mahasiswa();

                        System.out.print("NIM : ");
                        String nim = kal.next();
                        data.setNIM(nim);
                        System.out.print("Nama : ");
                        String nam = kal.next();
                        data.setNAMA(nam);
                        System.out.print("IPK : ");
                        double ip = kal.nextDouble();
                        data.setIPK(ip);
                        System.out.print("\n");
                        ojk.set(i, data);
                    }
                    break;

                case 2:

                    int ind = ojk.getINDEX();
                    for (int i = 0; i < ind; i++) {
                        System.out.print("Data ke - " + (i + 1) + "\n");
                        ojk.get(i);
                    }

                    break;
                case 3:
                    System.out.print("=================================\nMencari : \n");
                    System.out.print("1.berdasarkan Nama.\n2.Berdasarkan NIM.\n3.Berdasarkan IPK.\n");
                    System.out.print("Memilih : ");
                    System.out.print("\n===================================\n");
                    int car = kal.nextInt();

                    switch (car) {
                        case 1:
                            System.out.print("Masukan Nama mahasiswa yang dicari : ");
                            String urutNama = kal.next();
                            System.out.print("\n===================================\n");
                            ojk.SortingNama(urutNama);
                            break;

                        case 2:
                            System.out.print("Masukan NIM mahasiswa yang dicari : ");
                            String inputNim = kal.next();
                            System.out.print("\n===================================\n");
                            ojk.SearchNim(inputNim);
                            break;
                        case 3:
                            System.out.print("Masukan IPK mahasiswa yang dicari : ");
                            String inputIpk = kal.next();
                            System.out.print("\n===================================\n");
                            ojk.SearchIpk(inputIpk);
                            break;
                    }
                    break;

                case 4:
                    System.out.print("good bye...we will come back\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia");
            }
        } while (inp == 0);
    }
}

class mahasiswa {

    private String nim;
    private String nama;
    private double ipk;
    private int ind;

    public mahasiswa() {
        nim = "";
        nama = "";
        ipk = 0.00;
        ind = 0;
    }

    public String getNIM() {
        return nim;
    }

    public String getNAMA() {
        return nama;
    }

    public double getIPK() {
        return ipk;
    }

    public int getIND() {
        return ind;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public void setNAMA(String nama) {
        this.nama = nama;
    }

    public void setIPK(double ipk) {
        this.ipk = ipk;
    }

    public void setIND(int ind) {
        this.ind = ind;
    }
}

class Kompleks {

    mahasiswa[] data;
    private int index;
    private int x;

    mahasiswa dt = new mahasiswa();

    public Kompleks() {
        data = new mahasiswa[100];
    }

    public void get(int ind) {
        System.out.println("NIM   : " + data[ind].getNIM());
        System.out.println("Nama  : " + data[ind].getNAMA());
        System.out.println("IPK   : " + data[ind].getIPK());
       
    }

    public void set(int index, mahasiswa datuk) {
        data[index] = datuk;
    }

    public int getINDEX() {
        return index;
    }

    public void setINDEX(int index) {
        this.index = index;
    }

    public void SearchNim(String nm) {
        int a = getINDEX();
        for (int i = 0; i < a; i++) {
            if (nm.equals(data[i].getNIM())) {
                get(i);
            }
        }
    }

    //ini bos
    public void SortingNama(String nm) {
        int a = getINDEX();
        for (int i = 0; i < a; i++) {
            if (nm.equals(data[i].getNAMA())) {
                get(i);
            }
        }
    }

    public void SearchIpk(String ip) {
        int a = getINDEX();
        for (int i = 0; i < a; i++) {
            if (ip.equals(data[i].getIPK())) {
                get(i);
            }
        }
    }
}
