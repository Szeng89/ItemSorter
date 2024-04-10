package rocks.zipcode.io;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    Item[] items;

    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {

//        for (int i = 0; i < this.items.length -1; i++) {
//            for (int j = i + i; j < this.items.length; j++) {
//                if (comparator.compare(this.items[i], this.items[j]) > 0) {
//                    Item tempItem = this.items[i];
//                    this.items[i] = this.items[j];
//                    this.items[j] = tempItem;
//                }
//            }
//        }
//        return this.items;

                Arrays.sort(items, comparator);
                return items;


    }
}
