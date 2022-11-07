import java.util.Scanner;
public class MenjumlahkanPerulangan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int i=0;
        int z;
        int jumlah=0;
        
        System.out.print("Iput batas : ");
        z= input.nextInt();
        
        do{
            i++;
            jumlah+=i;
            System.out.println(i);
            
        }while(i<z);
        
        System.out.println("----- +");
        System.out.println("Jumlah = "+jumlah);
    }
}
