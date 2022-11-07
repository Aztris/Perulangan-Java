import java.util.Scanner;
public class Perulangan001 {
    public static void main(String[] args) {
        
        Scanner angka = new Scanner(System.in);
        
        int i = 1;
        int z = 0;
        
        System.out.print("Masukkan Z : ");
        z = angka.nextInt();
        
        while(i <= z){
            System.out.print(i + " ");
            i++;
        }
        
        System.out.println("");
    }
}
