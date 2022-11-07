import java.util.Scanner;
public class Perulangan003 {
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        
        int i = 0;
        int z;
        
        System.out.print("Masukkan Batas : ");
        z = input.nextInt();
        
        while(i<z){
            i++;
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        
        System.out.println("");
    }
}
