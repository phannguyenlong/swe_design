package interator.sample.iterator;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * this will sort the list and move for a -> z
 */
public class AlphabetOrderIterator<T> implements ItemIterator<T> {
    private List<T> items;
    private int pointer = 0; // start of the list

    public AlphabetOrderIterator(List<T> items) {
        this.items = items;

        // sortign array
        Collections.sort((List<String>) items);
    }

    @Override
    public T next() {
        if (hasNext()) 
            return items.get(pointer++);
        else 
            throw new NoSuchElementException();
    }

    @Override
    public boolean hasNext() {
        if (pointer < items.size()) 
            return true;
        else 
            return false;
    }
    
}
