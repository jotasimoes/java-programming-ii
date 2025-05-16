
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Random random = new Random();
        
        System.out.println("How many random numbers should be printed?");
        int numberRandoms = sc.nextInt();
        
        while(numberRandoms>0){
            int randomNumber = random.nextInt(11);
            System.out.println(randomNumber);
            numberRandoms--;
        }
        
    }

}
