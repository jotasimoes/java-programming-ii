
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        
        while(true){
              System.out.println("Input the name of the book, empty stops: ");            
            String name = scanner.nextLine();
            
            if(name.isEmpty()){ // Check if the stored input is empty
                break;
            }
            
            System.out.println("Input the age recommendation: ");
            int ageRec = Integer.valueOf(scanner.nextLine());  
            
            Book newBook = new Book(name, ageRec);
            books.add(newBook);
        }
        
          
              
        
        
        System.out.println(books.size() + " books in total.");        
        System.out.println("Books:");   
        
        
        
        
        books.stream()
                .sorted(Comparator.comparing(Book::getAgeRec).thenComparing(Book::getName))
                .forEach(book -> System.out.println(book));

    }

}
