package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    List<String> shoppyList;
    public Inventory(List<String> strings) {
            shoppyList = strings;
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        shoppyList = new ArrayList<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        shoppyList.add(item);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        shoppyList.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return shoppyList.size();
    }
}
