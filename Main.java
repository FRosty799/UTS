import java.util.Scanner;
import java.util.ArrayList;

import Class.Amil;
import Class.Muzakki;

public class Main {
    public static void main(String[] args) {
        double HargaBeras = 12000;
        double FitrahperJiwa = 30000;
        Scanner sc = new Scanner(System.in);

        ArrayList<Muzakki> daftarMuzakkis = new ArrayList<>();
        ArrayList<Amil> daftarAmils = new ArrayList<>();

        System.out.println("NIM : 1237050045\tNama : Fauzan Ramdhani");
        System.out.println("===============================================\n");
        
        Amil aml1 = new Amil("1", "Akang Surakang");
        Amil aml2 = new Amil("2", "Usro Kurniawan");
        Amil aml3 = new Amil("3", "Nurawhidin");

        daftarAmils.add(aml1);
        daftarAmils.add(aml2);
        daftarAmils.add(aml3);
        
        Muzakki mzk1 = new Muzakki("Ucok");
        mzk1.setRT("01");
        mzk1.setJumlahJiwa(5);
        mzk1.setShodaqoh(150000);
        mzk1.setJenisKelamin("Laki-laki");
        mzk1.setKelurahan("Palasari");
        mzk1.setIDPetugas("1");
        mzk1.setPosisi();
        mzk1.setZakat(HargaBeras);
        mzk1.settotalBayar();
        
        Muzakki mzk2 = new Muzakki("Asep");
        mzk2.setRT("02");
        mzk2.setJumlahJiwa(6);
        mzk2.setShodaqoh(180000);
        mzk2.setJenisKelamin("Laki-laki");
        mzk2.setKelurahan("Cibiru");
        mzk2.setIDPetugas("2");
        mzk2.setPosisi();
        mzk2.setZakat(HargaBeras);
        mzk2.settotalBayar();
        
        Muzakki mzk3 = new Muzakki("Neng");
        mzk3.setRT("03");
        mzk3.setJumlahJiwa(2);
        mzk3.setShodaqoh(50000);
        mzk3.setJenisKelamin("Perempuan");
        mzk3.setKelurahan("Pasirbiru");
        mzk3.setIDPetugas("3");
        mzk3.setPosisi();
        mzk3.setZakat(HargaBeras);
        mzk3.settotalBayar();
        
        Muzakki mzk4 = new Muzakki("Euceu");
        mzk4.setRT("04");
        mzk4.setJumlahJiwa(3);
        mzk4.setShodaqoh(100000);
        mzk4.setJenisKelamin("Perempuan");
        mzk4.setKelurahan("Cibiru");
        mzk4.setIDPetugas("1");
        mzk4.setPosisi();
        mzk4.setZakat(HargaBeras);
        mzk4.settotalBayar();
        
        Muzakki mzk5 = new Muzakki("Asep");
        mzk5.setRT("01");
        mzk5.setJumlahJiwa(4);
        mzk5.setShodaqoh(70000);
        mzk5.setJenisKelamin("laki-laki");
        mzk5.setKelurahan("Pasirbiru");
        mzk5.setIDPetugas("2");
        mzk4.setPosisi();
        mzk4.setZakat(HargaBeras);
        mzk4.settotalBayar();

        daftarMuzakkis.add(mzk1);
        daftarMuzakkis.add(mzk2);
        daftarMuzakkis.add(mzk3);
        daftarMuzakkis.add(mzk4);
        daftarMuzakkis.add(mzk5);
        
        for (Muzakki mzk : daftarMuzakkis) {
         mzk.cetakMuzaki();   
        }
        
        System.out.println("\nHarga Beras\t: Rp "+HargaBeras+"/kg");
        System.out.println("Besar Zakat Fitrah per jiwa\t: Rp "+FitrahperJiwa);
        System.out.println("\n===============================================\n");
        
        System.out.print("Masukan nama Anda : ");
        String namainput = sc.nextLine();
        System.out.println("\n===============================================\n");
        for (Muzakki mzk : daftarMuzakkis) {
            if (mzk.getnama().equalsIgnoreCase(namainput)) {
                mzk.cetakMuzakiDetail();
                for (Amil amil : daftarAmils) {
                    if (mzk.getIDPetugas().equalsIgnoreCase(mzk.getIDPetugas())) {
                        System.out.println("Petugas Amilin\t: "+amil.getNama());
                        
                    }
                }
            }
        }
        
        sc.close();

    }
}
