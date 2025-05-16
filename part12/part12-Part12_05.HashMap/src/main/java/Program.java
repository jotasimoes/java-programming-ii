
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       HashMap<String, Integer> map = new HashMap<>();

        map.add("one", 1);
        map.add("two", 2);
        map.add("three", 3);

        System.out.println(map.get("two"));   // Output: 2
        System.out.println(map.remove("two")); // Output: 2
        System.out.println(map.get("two"));   // Output: null

    }

}
