package SoalPakMosses;

public class PerulanganLili {
    public static void main(String[] args) {
        
        int utama = 4, cabang,kt = 8, tambah = 4, kurang = 5, krg, kali = 2, kali2, total1, total2;
        int batas = 1;
        int  bg=4;
        do{
            cabang = 1;
            krg = kurang;
            kali2 = kali;
                
            while(cabang <= bg){
                
                do{
                    
                    total1 = kt+tambah-krg;
                    total2 = total1*kali2;
                    System.out.print(kt + " + " + tambah + " - " + krg + " = " + total1 + " * " + kali2);
                    krg--;
                    kali2+=2;
                    batas++;
                }while(batas==1);

                System.out.println(" = "+total2);
                cabang++;
            }

            System.out.println("=================================");
            utama--;
            bg--;
            kurang--;
        }while(utama>=1);
    }
}
