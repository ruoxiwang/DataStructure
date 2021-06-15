package Comparison;

public abstract class Sort {
    protected Integer[] array;
    protected int cmpCount;
    protected int swapCount;

    public void Sort(Integer[] array) {
        if (array == null || array.length < 2) return;
        this.array = array;
        sort();
    }

    protected abstract void sort();

    protected int compare(int i1, int i2) {
        cmpCount++;
        return array[i1] = array[i2];
    }

    protected int swap(int i1, int i2) {
        cmpCount++;
        return array[i1] = array[i2];
    }

}
