package pegawai;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee kinerja = new Employee();

        kinerja.nip();
        kinerja.nama();
        int jamKerja = 0;
        System.out.print("Jam Kerja 1 bulan: ");
        jamKerja = sc.nextInt();
        System.out.print("Status (menikah/belum): ");
        kinerja.status = sc.next();
        sc.nextLine();
        System.out.print("Jabatan: ");
        String jabatan = sc.nextLine();
        
        if (jabatan.equalsIgnoreCase("boss")) {
            Boss boss = new Boss();
            kinerja.potongan = boss.potongan(jamKerja);
        } else if (jabatan.equalsIgnoreCase("manager")) {
            Manager manager = new Manager();
            kinerja.potongan = manager.potongan(jamKerja);
        } else if (jabatan.equalsIgnoreCase("cleaning service")) {
            CleaningService cleaningService = new CleaningService();
            kinerja.potongan = cleaningService.potongan(jamKerja);
        } else if (jabatan.equalsIgnoreCase("internship")) {
            Internship internship = new Internship();
            kinerja.potongan = internship.potongan(jamKerja);
        }
        
        kinerja.gajian();

    }
}
