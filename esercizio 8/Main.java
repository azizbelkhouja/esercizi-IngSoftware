// (<<interface>> Sortable)
interface Sortable { 
    int compare(int a, int b); // +compare()
    void swap(int[] array, int i, int j); // +swap()
    int count(int[] array); // +count()
}

// (Sorter)
abstract class Sorter { 
    public abstract void sort(int[] array); // +sort()
}

// (QuickSorter)
class QuickSorter extends Sorter { 
    @Override
    public void sort(int[] array) { // +sort()
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

// (HyperSorter)
class HyperSorter extends Sorter { 
    @Override
    public void sort(int[] array) { // +sort()
        System.out.println("Sorting using HyperSorter...");
    }
}

// (SortedCollection)
class SortedCollection implements Sortable { 
    private final Sorter sorter; // Aggregazione con Sorter (1)

    // (SortedCollection non dipende da una classe concreta ma da una classe astratta)
    public SortedCollection(Sorter sorter) {
        this.sorter = sorter;
    }

    public void add() { // +add()
        
    }

    public int get() { // +get()
        
        return 0;
    }

    public void remove() { // +remove()
        
    }

    public void sort(int[] array) { // +sort()
        sorter.sort(array);
    }

    @Override
    public int compare(int a, int b) { // +compare()
        return Integer.compare(a, b);
    }

    @Override
    public void swap(int[] array, int i, int j) { // +swap()
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    @Override
    public int count(int[] array) { // +count()
        return array.length;
    }
}

public class Main { 
    public static void main(String[] args) {
        
    }
}
