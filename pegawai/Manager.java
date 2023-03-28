package pegawai;

public class Manager  extends Employee{
    
    public void setJamKerjaPegawai() {
        super.jamKerjaPegawai = 180; //6 jam perhari
    }
    
    public void setGaji() {
        super.gaji = 4_500_000;
    }
    
    double potongan( double jam){
        if (jam >= 180) {
            jam = 180;
        }
        setJamKerjaPegawai();
        setGaji();
        double a = super.jamKerjaPegawai - jam;
        double b = 25_000*a;
        super.potongan = super.gaji-b;
        return super.potongan;
    }
}
