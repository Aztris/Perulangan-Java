import java.util.Scanner;

public class Perulangan002 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int x = 0;
        int z = 0;
        
        System.out.print("Angka Z : ");
        z = input.nextInt();
        
        while(z>x){
            System.out.print(z +" ");
            z--;
        }
        
        System.out.println("");
    }
}
