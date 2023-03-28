package pegawai;

public class CleaningService  extends Employee{
    
    public void setJamKerjaPegawai() {
        super.jamKerjaPegawai = 300; //10 jam perhari
    }
    
    public void setGaji() {
        super.gaji = 1_500_000;
    }
    
    double potongan( double jam){
        if (jam >= 300) {
            jam = 300;
        }
        setJamKerjaPegawai();
        setGaji();
        double a = super.jamKerjaPegawai - jam;
        double b = 5_000*a;
        super.potongan = super.gaji-b;
        return super.potongan;
    }
}
