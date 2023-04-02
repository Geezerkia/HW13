public class InsertionSort {
    static int[] insertionSort(int[] numbsInsertionSorted) {
        int j;
        for (var i = 1; i < numbsInsertionSorted.length; i++) {
            int currentValue = numbsInsertionSorted[i];
            for (j = i; j > 0 && currentValue < numbsInsertionSorted[j - 1]; j--) {
                numbsInsertionSorted[j] = numbsInsertionSorted[j - 1];
            }
            numbsInsertionSorted[j] = currentValue;
        }
        return numbsInsertionSorted;
    }
}






