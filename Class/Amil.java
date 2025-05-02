package Class;

public class Amil {
    private String IDPetugas;
    private String NamaPetugas;

    public Amil(String ID, String Nama){
        this.IDPetugas = ID;
        this.NamaPetugas = Nama;
    }
    
    public String getNama(){
        return this.NamaPetugas;
    }

    public String getIDPetugas(){
        return this.IDPetugas;
    }
}
