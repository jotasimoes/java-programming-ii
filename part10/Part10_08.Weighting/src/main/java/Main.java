

public class Main {

    public static void main(String[] args) {

        // Test Item class
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("Brick", 4);
        
        System.out.println("Items created:");
        System.out.println(book);
        System.out.println(phone);
        System.out.println(brick);
        System.out.println();
        
        // Test Suitcase class
        Suitcase suitcase = new Suitcase(5);
        System.out.println("Empty suitcase: " + suitcase);
        
        suitcase.addItem(book);
        System.out.println("Added book: " + suitcase);
        
        suitcase.addItem(phone);
        System.out.println("Added phone: " + suitcase);
        
        // This should not be added (would exceed weight limit)
        suitcase.addItem(brick);
        System.out.println("Tried to add brick: " + suitcase);
        
        System.out.println("\nItems in suitcase:");
        suitcase.printItems();
        
        System.out.println("\nHeaviest item: " + suitcase.heaviestItem());
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
        
        // Test Hold class
        Hold hold = new Hold(10);
        System.out.println("\nEmpty hold: " + hold);
        
        Suitcase anotherSuitcase = new Suitcase(3);
        anotherSuitcase.addItem(phone);
        
        hold.addSuitcase(suitcase);
        hold.addSuitcase(anotherSuitcase);
        
        System.out.println("Hold with two suitcases: " + hold);
        System.out.println("Total weight of hold: " + hold.totalWeight() + " kg");
        
        System.out.println("\nAll items in the hold:");
        hold.printItems();
    }

}
