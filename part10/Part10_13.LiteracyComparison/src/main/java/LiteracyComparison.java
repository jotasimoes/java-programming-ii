import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        List<Literacy> literacies = new ArrayList();
        
        try{
            Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.split(","))
                    .map(line -> new Literacy(line[0],line[1],line[2].replace(" (%)", ""),line[3],Integer.valueOf(line[4]),Double.valueOf(line[5])))
                    .forEach(literacy -> literacies.add(literacy));
                    
            
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        literacies.stream()
                .sorted((literacy1, literacy2) -> literacy1.compareTo(literacy2))
                .forEach(literacy -> {System.out.println(literacy);});        
    }
}
