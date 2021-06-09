package interator.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import interator.sample.iterator.AlphabetOrderIterator;
import interator.sample.iterator.ItemIterator;
import interator.sample.iterator.IteratorType;
import interator.sample.iterator.LeftToRightIterator;
import interator.sample.iterator.RightToLeftIterator;

/**
 * This class will implement NameRepoIntreface and set up it
 * Using generic
 */
public class NameRepoConcrete<T> implements NameRepointerface<T> {
    private List<T> items = new ArrayList<>();

    @Override
    public void addItem(T item) {
        items.add(item);
    }

    @Override
    public ItemIterator<T> getIterator(IteratorType type) {
        ItemIterator<T> iterator = null;

        switch (type) {
            case LeftToRightIterator:
                iterator = new LeftToRightIterator<>(items);
                break;
            case RightToLeftIterator:
                iterator = new RightToLeftIterator<>(items);
                break;
            case AlphabetOrderIterator:
                iterator = new AlphabetOrderIterator<>(items);
                break;
            default:
                throw new NoSuchElementException();
        }
        
        return iterator;
    }
    
}
