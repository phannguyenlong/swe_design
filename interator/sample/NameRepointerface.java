package interator.sample;

import interator.sample.iterator.ItemIterator;
import interator.sample.iterator.IteratorType;

public interface NameRepointerface<T> {
    public void addItem(T item);

    public ItemIterator<T> getIterator(IteratorType type);
}