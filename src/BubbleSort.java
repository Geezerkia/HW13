public class BubbleSort {
    static int[] bubbleSort(int[] numbsBubbleSorted) {
        var length = numbsBubbleSorted.length;
        for (var i = 0; i < numbsBubbleSorted.length; i++) {
            for (var y = 0; y < length - 1; y++) {
                if (numbsBubbleSorted[y] > numbsBubbleSorted[y + 1]) {
                    var temp = numbsBubbleSorted[y + 1];
                    numbsBubbleSorted[y + 1] = numbsBubbleSorted[y];
                    numbsBubbleSorted[y] = temp;
                }
            }
           length--;
        }
        return numbsBubbleSorted;
    }
}
