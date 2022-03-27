package behavioral.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;

    }

    public boolean hasNext() {
        if (position >= items.length) return false;
        else return true;
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove blah blah");
        }
        // code for removing an item and shifting the rest
    }
}
