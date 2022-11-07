import java.util.Scanner;
public class Perulangan005 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int i = 0;
        int z;
        
        System.out.print("Masukkan nilai batas : ");
        z = input.nextInt();
        
        while(i<=z){
            i++;
            if(i%2==1){
                switch(i){
                    case 1 : System.out.print(i+" ");
                }
                if(i%3==0){
                System.out.print(i+" ");
                }
               
            }
        }
    }
}
