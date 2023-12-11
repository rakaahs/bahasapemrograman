package sorting;
import java.util.Scanner;
public class Sorting {
    private static int i;
    public static void main(String[] args) {
        int count,temp;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Banyak Data Harga:");
        count = scan.nextInt();
        
        int num[]=new int[count];
        System.out.println("Masukkan Harga:");        
        for(int i=0; i<count ;i++){
        num[i]=scan.nextInt();
        
    }
        scan.close();
        for(int i=0; i<count;i++){
            for(int j=i+1; j<count;j++){
                if (num[i]<num[j]){
                    temp = num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
         
        }
        System.out.println("Diurutka harga tertinggi: ");
        for (int i=0;i<count; i++){
            System.out.println(num[i]);
        }
        
        
        
        
        
        
        
        
        
        
        
        

    }
    
}
