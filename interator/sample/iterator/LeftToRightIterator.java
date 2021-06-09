package interator.sample.iterator;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * This is the concrete interator
 * Using generic datatype
 */
public class LeftToRightIterator<T> implements ItemIterator<T> {
    private List<T> items; // dont know data type
    private int pointer = 0;

    public LeftToRightIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public T next() {
        if (hasNext()) {
            return items.get(pointer++); // increase pointer after use
        } else {
            throw new NoSuchElementException(); // if at the end of list => throw exception
        }
    }

    @Override
    public boolean hasNext() {
        if (pointer < items.size()) {
            return true;
        } else {
            return false;
        }
    }
    
}
