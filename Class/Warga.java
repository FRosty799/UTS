package Class;

public class Warga {
    private String RT;
    private String nama;
    private String JenisKelamin;
    private String Kelurahan;

    public Warga(String nama){
        this.nama = nama;
    }

    public String getnama(){
        return this.nama;
    }
    
    public String getRT() {
        return this.RT;
    }

    public void setRT(String RT) {
        this.RT = RT;
    }

    public String getJenisKelamin() {
        return this.JenisKelamin;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public String getKelurahan() {
        return this.Kelurahan;
    }

    public void setKelurahan(String Kelurahan) {
        this.Kelurahan = Kelurahan;
    }

}
