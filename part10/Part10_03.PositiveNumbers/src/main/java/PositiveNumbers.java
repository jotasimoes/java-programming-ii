
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

    }
    
    public static List<Integer> positive(List<Integer> numbers){
        
        List<Integer> positivos = numbers.stream()
                .filter(number -> number>0)
                .collect(Collectors.toList());
        
        return positivos;
        
    }

}
