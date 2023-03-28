package pegawai;

public class Boss  extends Employee{
    
    public void setJamKerjaPegawai() {
        super.jamKerjaPegawai = 120; //4 jam perhari
    }
    
    public void setGaji() {
        super.gaji = 6_000_000;
    }
    
    
    double potongan( double jam){
        if (jam >= 120) {
            jam = 120;
        }
        setJamKerjaPegawai();
        setGaji();
        double a = super.jamKerjaPegawai - jam;
        double b = 30_000*a;
        super.potongan = super.gaji-b;
        return super.potongan;
    }
}
