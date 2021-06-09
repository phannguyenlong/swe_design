package interator.sample.iterator;

/**
 * This is iterator interface
 * This use generic data type cause we dont type of Item
 */
public interface ItemIterator <T> {
    public T next();

    public boolean hasNext();
}
