package interator.sample.iterator;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * This is the concrete interator
 * Using generic datatype
 */
public class RightToLeftIterator<T> implements ItemIterator<T> {
    private List<T> items;
    private int pointer;

    public RightToLeftIterator(List<T> items) {
        this.items = items;
        this.pointer = items.size() - 1; // point to the end of list (cause move backward)
    }

    @Override
    public T next() {
        if (hasNext()) 
            return items.get(pointer--); // decrease after use (cause move backward)
        else
            throw new NoSuchElementException();
        
    }

    @Override
    public boolean hasNext() {
        if (pointer >= 0)
            return true;
        else 
            return false;
    }
    
}
