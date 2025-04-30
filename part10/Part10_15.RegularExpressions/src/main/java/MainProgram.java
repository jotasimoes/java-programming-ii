

public class MainProgram {

    public static void main(String[] args) {
        
        
        String string = "oi";
        Checker checker = new Checker();
        
        if(checker.allVowels(string)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
