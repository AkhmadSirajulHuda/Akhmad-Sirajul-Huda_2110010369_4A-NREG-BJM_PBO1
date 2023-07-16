package uaspbo;

import java.util.Scanner;

public class Pegawai {
    public static void main(String[] args) {
    //objek
    //Pegawai pgw = new Pegawai("Akhmad Sirajul Huda","2026071043");
    
    //System.out.println(pgw.displayInfo());
    //System.out.println(pgw.displayInfo(Perencana Ahli Muda));
    
    //error handiling
    try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
        Pegawaidetail[] pgw = new Pegawaidetail[2];
        
        //perulangan
        for(int i=0; i<pgw.length; i++){
            System.out.print("Masukkan nama pegawai "+(i+1)+": " );
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIP pegawai "+(i+1)+": ");
            String nip = scanner.nextLine();
            
            //objek
            pgw[i] = new Pegawaidetail(nama, nip);
        }
        
        //perulangan
        for (Pegawaidetail data: pgw){
            System.out.println("===============");
            System.out.println("Data Pegawai: ");
            System.out.println(data.displayInfo());
        }
    } catch (NumberFormatException e){
        System.out.println("Kesalahan format nomor:- "+e.getMessage());
    } catch(StringIndexOutOfBoundsException e){
        System.out.println("Kesalahan format NIP:- "+e.getMessage());
    } catch (Exception e) {
        System.out.println("Kesalahan umum :- "+e.getMessage());
    }
}
}