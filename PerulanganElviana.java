package SoalPakMosses;

public class PerulanganElviana {
    public static void main(String[] args) {
        int ulang=1, utama=3, srg, sarang=2, batas=1, total, awal = 7, tengah = 5, middle, akhir=2, gt;
        
        while(ulang<=utama){
            
            middle = tengah;
            srg = 1;
            gt = 0;
            while(srg<=sarang){
                
                do{
                    System.out.print(awal+" + "+middle+" - "+akhir);
                    total = awal+middle-akhir;
                    awal++;
                    middle--;
                    akhir++;
                    batas++;
                    gt+=total;
                }while(batas == 1);
                
                System.out.println(" = "+total);
                srg++;
            }
            
            System.out.println("================ +");
            System.out.println("   TOTAL = "+gt);
            ulang++;
            sarang++;
        }
    }
}
