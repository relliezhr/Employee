package pegawai;

import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);
    int nip;
    String nama;
    String status;  
    int jamKerjaPegawai = 0;
    double gaji = 0;
    double potongan = 0;
    
    void nip(){
        System.out.print("NIP: ");
        nip = sc.nextInt();
    }
    
    void nama(){
        System.out.print("Nama: ");
        nama = sc.nextLine();
        sc.nextLine();
    
    }
    
    void gajian(){
        if (status.equalsIgnoreCase("menikah")) {
            potongan = potongan + 2_000_000;
        }else if (status.equalsIgnoreCase("belum")) {
            potongan = potongan;
        }
        System.out.println("Gaji: Rp."+potongan);
    }
    
    
    
}
