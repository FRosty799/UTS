package Class;

public class Muzakki extends Warga{
    private int JumlahJiwa;
    private double Shodaqoh;
    private String JenisKelamin;
    private String IDPetugas;
    private double Zakat;
    private String Posisi;
    private double totalBayar;

    public Muzakki(String nama){
        super(nama);
    }
    
    public int getJumlahJiwa() {
        return this.JumlahJiwa;
    }
    
    public void setJumlahJiwa(int JumlahJiwa) {
        this.JumlahJiwa = JumlahJiwa;
    }
    
    public double getShodaqoh() {
        return this.Shodaqoh;
    }
    
    public void setShodaqoh(int Shodaqoh) {
        this.Shodaqoh = Shodaqoh;
    }
    
    public String getJenisKelamin() {
        return this.JenisKelamin;
    }
    
    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }
    
    public String getIDPetugas() {
        return this.IDPetugas;
    }
    
    public void setIDPetugas(String IDPetugas) {
        this.IDPetugas = IDPetugas;
    }
    
    public void setZakat(double hargaberas){
        this.Zakat = 2.5*this.JumlahJiwa*hargaberas;
    }
    
    public double getZakat(){
        return this.Zakat;
    }

    public void settotalBayar(){
        this.totalBayar = (this.Zakat+this.Shodaqoh);
    }

    public double gettotalBayar(){
        return this.totalBayar;
    }
    
    public void cetakMuzaki(){
        System.out.println("["+this.getRT()+"]\t"+this.getnama()+"\t"+this.getJumlahJiwa()+" orang\t\t"+"Shodaqoh : "+this.getShodaqoh());
    }
    
    public String getPosisi() {
        return this.Posisi;
    }
    
    public void setPosisi() {
        if (this.getJenisKelamin().equalsIgnoreCase("Perempuan")) {
            this.Posisi = "Istri";
        } else {
            this.Posisi = "Kepala Keluarga";
        }
    }

    public void cetakMuzakiDetail(){
        System.out.println("RT\t: "+this.getRT());
        System.out.println("Kelurahan\t: "+this.getKelurahan());
        System.out.println("Nama\t: "+this.getnama());
        System.out.println("Posisi\t: "+this.getPosisi());
        System.out.println("Zakat yang dibayarkan\t: "+this.getZakat());
        System.out.println("Shodaqoh\t: "+this.getShodaqoh());
        System.out.println("Total yang dibayarkan\t: "+this.gettotalBayar());
    }
    
}
