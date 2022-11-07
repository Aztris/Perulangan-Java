import java.util.Scanner;
public class Perulangan004 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int i=0;
        int z=0;
        
        System.out.print("Masukkan Batas Nilai : ");
        z = input.nextInt();
        
        while(i<z){
            i++;
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
        
         System.out.println("");
    }
}
