package pegawai;

public class Internship extends Employee{
    
    public void setJamKerjaPegawai() {
        super.jamKerjaPegawai = 240; //8 jam perhari
    }
    
    public void setGaji() {
        super.gaji = 0;
    }
    
    double potongan( double jam){
        if (jam >= 240) {
            jam = 240;
        }
        setJamKerjaPegawai();
        setGaji();
        double a = super.jamKerjaPegawai - jam;
        double b = 0*a;
        super.potongan = super.gaji-b;
        return super.potongan;
    }
}
