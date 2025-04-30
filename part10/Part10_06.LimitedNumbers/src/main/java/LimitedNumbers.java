
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            int input = scanner.nextInt();
            
            if(input <0){
                break;
            }

            if(input>=1 && input <=5){
                System.out.println(input);
            }
            
        }

    }
}
