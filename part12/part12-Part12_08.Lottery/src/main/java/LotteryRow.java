import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        Random random = new Random();

        while (this.numbers.size() < 7) {
            int nextNumber = random.nextInt(40) + 1; // generates 1–40
            if (!this.containsNumber(nextNumber)) {
                this.numbers.add(nextNumber);
            }
        }
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || this.getClass() != other.getClass()) return false;

        LotteryRow otherRow = (LotteryRow) other;
        return this.numbers.containsAll(otherRow.numbers()) &&
               otherRow.numbers().containsAll(this.numbers);
    }
}
