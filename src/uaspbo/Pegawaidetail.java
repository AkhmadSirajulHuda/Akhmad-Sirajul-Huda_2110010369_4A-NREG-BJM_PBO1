package uaspbo;

//inheritance
public class Pegawaidetail extends UASPBO {
    //overriding
    public Pegawaidetail (String nama, String nip) {
        super(nama, nip);
    }
    
    public int getTahunMasuk() {
        return Integer.parseInt(getNip() .substring(0, 2)) + 2000;
    }
    
    public String getDinas(){
        String kodeDin = getNip().substring(2, 4);
        //seleksi if
        if(kodeDin.equals("10")){
            return "Dinas Sosial";
        } else {
            return "Dinas lain";
        }
    }
    
    public String getGolongan(){
        String kodeGolongan = getNip().substring(4, 6);
        //seleksi Switch
        switch(kodeGolongan){
            case "01":
                return "IIIc";
            case "02":
                return "IIId";
            default:
                return "Golongan lain";
        }
    }
    
    public int getNoRegistrasi(){
        return Integer.parseInt(getNip().substring(6));
    }
    
    //polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nTahun Masuk: "+getTahunMasuk()+
                "\nDinas: "+getDinas()+
                "\nGolongan: "+getGolongan()+
                "\nNo Registrasi: "+getNoRegistrasi();
    }
}
