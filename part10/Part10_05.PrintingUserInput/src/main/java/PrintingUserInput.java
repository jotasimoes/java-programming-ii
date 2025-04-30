
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while(true){
            String input = scanner.nextLine();
            
            if(input.isEmpty()){
                break;
            }
            
            System.out.println(input);
            
            
        }
        
    }
}
