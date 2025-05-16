import java.util.ArrayList;

public class HashMap<K, V> {

    private ArrayList<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new ArrayList[32];
        this.firstFreeIndex = 0;
    }

    private ArrayList<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        if (values[hashValue] == null) {
            values[hashValue] = new ArrayList<>();
        }
        return values[hashValue];
    }

    private int getIndexOfKey(ArrayList<Pair<K, V>> list, K key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public void add(K key, V value) {
        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }

        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        ArrayList<Pair<K, V>> valuesAtIndex = this.values[hashValue];

        if (valuesAtIndex == null) {
            return null;
        }

        for (Pair<K, V> pair : valuesAtIndex) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }

        return null;
    }

    public V remove(K key) {
        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.size() == 0) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }

        Pair<K, V> removed = valuesAtIndex.remove(index);
        return removed.getValue();
    }

    private void grow() {
        ArrayList<Pair<K, V>>[] newArray = new ArrayList[this.values.length * 2];

        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] != null) {
                copy(newArray, i);
            }
        }

        this.values = newArray;
    }

    private void copy(ArrayList<Pair<K, V>>[] newArray, int fromIdx) {
        for (Pair<K, V> pair : this.values[fromIdx]) {
            int hashValue = Math.abs(pair.getKey().hashCode() % newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new ArrayList<>();
            }
            newArray[hashValue].add(pair);
        }
    }
}
