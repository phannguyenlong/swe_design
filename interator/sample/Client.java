package interator.sample;

import interator.sample.iterator.ItemIterator;
import interator.sample.iterator.IteratorType;

/**
 * Client will use NameRepoConcrete and Interator interface
 */
public class Client {
    public static void main(String[] args) {
        NameRepoConcrete<String> items = new NameRepoConcrete<>();

        // add item
        items.addItem("Long");
        items.addItem("Yen");
        items.addItem("Nguyen");
        items.addItem("Dai ca");

        // get the interator
        // left to right
        System.out.println("=================Left to Right Iterator================");
        ItemIterator<String> left2rightIterator = items.getIterator(IteratorType.LeftToRightIterator);
        for (ItemIterator<String> i = left2rightIterator; i.hasNext();) {
            System.out.println(i.next());
        }

        // right to left
        System.out.println("=================Right to Left Iterator================");
        ItemIterator<String> right2leftIterator = items.getIterator(IteratorType.RightToLeftIterator);
        for (ItemIterator<String> i = right2leftIterator; i.hasNext();) {
            System.out.println(i.next());
        }

        // alphabet order
        System.out.println("=================Alphatbet order Iterator================");
        ItemIterator<String> alphabetIterator = items.getIterator(IteratorType.AlphabetOrderIterator);
        for (ItemIterator<String> i = alphabetIterator; i.hasNext();) {
            System.out.println(i.next());
        }

    }
}
