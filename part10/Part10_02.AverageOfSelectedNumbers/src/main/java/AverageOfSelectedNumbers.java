
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while(true){
            String input = scanner.nextLine();
            
            if(input.equals("end")){
                break;
            }
            
            inputs.add(input);
            
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();
        
        if(choice.toLowerCase().equals("n")){
           double averageN = inputs.stream()
                    .mapToInt(input -> Integer.valueOf(input))
                    .filter(input -> input<0)
                   .average()
                   .getAsDouble();
           
            System.out.println("Average of the negative numbers: "+averageN);
        }
        if(choice.toLowerCase().equals("p")){
             double averageP = inputs.stream()
                    .mapToInt(input -> Integer.valueOf(input))
                    .filter(input -> input>0)
                   .average()
                   .getAsDouble();
             
             System.out.println("Average of the positive numbers: "+averageP);
        }
        

    }
}
