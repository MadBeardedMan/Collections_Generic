import java.util.Random;

public class MagicBox<T> {
    protected T[] items;
    private int nulls;

    public MagicBox(int capacity) {
        this.items = (T[]) new Object[capacity];
        this.nulls = capacity;
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                this.nulls = nulls - 1;
                return true;
            }
        }
        return false;
    }
    public T pick() throws BoxNotFullException {
        if (nulls > 0) {
            throw new BoxNotFullException(nulls);
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
            return items[randomInt];
        }
    }
}