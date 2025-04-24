public class Dosen {
    public String NIDN;
    public String nama;
    public String email;
    public int tahunMasuk;
    public String programStudi;

    public Dosen (String NIDN, String nama, String email, int tahunMasuk, String programStudi) {
        this.NIDN = NIDN;
        this.nama = nama;
        this.email = email;
        this.tahunMasuk = tahunMasuk;
        this.programStudi = programStudi;
    }
    public int masaKerja (int tahunSekarang) {
        return tahunSekarang - tahunMasuk;
    }
    public void tampilDosen(int tahunSekarang) {
        System.out.println("NIDN : " + NIDN);
        System.out.println("Nama : " + nama);
        System.out.println("Email : " + email);
        System.out.println("Program Studi : " + programStudi);
        System.out.println("Masa Kerja : " + masaKerja(tahunSekarang) + " tahun");
        System.out.println("---------------------------");
    }
    //Jenis Algoritma Bubble Sort
    public static void SortingNIDN (Dosen[] dsn) {
        for (int i = 0; i < dsn.length - 1; i++) {
            for (int j = 0; j < dsn.length - i - 1; j++) {
                if (dsn[j].NIDN.compareTo(dsn[j + 1].NIDN) > 0) {
                    Dosen temp = dsn[j];
                    dsn[j] = dsn[j + 1];
                    dsn[j + 1] = temp;
                }
            }
        }
    }
    //Jenis Algoritma Sequential Search
    public static Dosen cariBerdasarkanNama(Dosen[] dosenArray, String namaCari) {
        for (Dosen d : dosenArray) {
            if (d.nama.equalsIgnoreCase(namaCari)) {
                return d;
            }
        }
        return null;
    }
    //Jenis Algoritma Selection Sort
    public static void urutkanBerdasarkanMasaKerja(Dosen[] dosenArray, int tahunSekarang) {
        for (int i = 0; i < dosenArray.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < dosenArray.length; j++) {
                if (dosenArray[j].masaKerja(tahunSekarang) > dosenArray[maxIdx].masaKerja(tahunSekarang)) {
                    maxIdx = j;
                }
            }
            Dosen temp = dosenArray[i];
            dosenArray[i] = dosenArray[maxIdx];
            dosenArray[maxIdx] = temp;
        }
    }
}