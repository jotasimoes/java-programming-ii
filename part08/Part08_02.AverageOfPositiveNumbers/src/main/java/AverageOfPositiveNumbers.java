
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma =0;
        int count =0;
        double media;
        
        
        while(true){
            int input = scanner.nextInt();
            
            
            
            if(input==0){
                break;
            }
            else if(input >0){
                count++;
                soma= soma+input;
            }
            
            
        }
        if(count==0){
            System.out.println("Cannot calculate the average");
        }
        
        
        media= 1.0*soma/ count;
        
        
        System.out.println(media);

    }
}
