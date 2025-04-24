import java.util.Scanner;
public class DosenMain {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean run = true;
        System.out.print("Masukkan tahun sekarang: ");
        int tahunSekarang = input.nextInt();
        input.nextLine();

        Dosen [] dsn = {
            new Dosen("123", "Rusdianto", "rusdi123@gmail.com", 2015, "TI"), 
            new Dosen("124", "Ambatuka", "ambatuka124@gmail.com", 2010, "SIB"),
            new Dosen("125", "Andreas", "andreas125@gmail.com", 2008, "TI"), 
            new Dosen("126", "Fuadalah", "fuadalah126@gmail.com", 2006, "SIB")
        };

        while (run) {
            System.out.println("----- Sistem Pengelolaan Data Dosen -----");
            System.out.println("1. Tampilkan Data Dosen");
            System.out.println("2. Urutkan Data Dosen Berdasarkan NIDN (ASC)");
            System.out.println("3. Cari Data Dosen Berdasarkan Nama");
            System.out.println("4. Urutkan Data Dosen Berdasarkan Masa Kerja (DSC)");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\n=== Data Dosen ===");
                    for (Dosen d : dsn) {
                        d.tampilDosen(tahunSekarang);
                    }
                    break;
                case 2: 
                    System.out.println("\nMengurutkan berdasarkan NIDN (Ascending)");
                    Dosen.SortingNIDN(dsn);
                    System.out.println("Data setelah diurutkan:");
                    for (Dosen d : dsn) {
                        d.tampilDosen(tahunSekarang);
                    }
                    break;
                case 3: 
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String namaCari = input.nextLine();
                    Dosen hasil = Dosen.cariBerdasarkanNama(dsn, namaCari);
                    if (hasil != null) {
                        System.out.println("\nDosen ditemukan:");
                        hasil.tampilDosen(tahunSekarang);
                    } else {
                        System.out.println("Dosen dengan nama tersebut tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.println("\nMengurutkan berdasarkan Masa Kerja (Descending)");
                    Dosen.urutkanBerdasarkanMasaKerja(dsn, tahunSekarang); 
                    System.out.println("Data setelah diurutkan:");
                    for (Dosen d : dsn) {
                        d.tampilDosen(tahunSekarang);
                    }
                    break;
                case 5: 
                    System.out.println("Terima Kasih telah menggunakan sistem ini");
                    run = false;
                    break;
                default:
                    System.out.println("Menu tidak valid. Silahkan pilih menu yang tersedia");
                }
        }
    }
}