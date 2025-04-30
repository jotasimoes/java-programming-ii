import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            }

            if (command.equals("move")) {
                if (amount > 0) {
                    int toMove = Math.min(amount, first.contains());
                    first.remove(toMove);
                    second.add(toMove);
                }
            }

            if (command.equals("remove")) {
                second.remove(amount);
            }
        }

        scanner.close();
    }
}
