package sort;

import java.util.List;

public class BubbleSort<T> extends Swap<T> implements ISortable<T> {

    @Override
    public void sort(List<T> list, IComparator<T> comparator) {
        for(int i = 1; i < list.size(); i++) {
            for(int e= 0; e < list.size() - i; e++) {
                if (comparator.compare(list.get(e), list.get(e + 1)) > 0) {
                    swap(list, e, e + 1);
                }
            }
        }
    }

}