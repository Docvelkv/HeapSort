public class Methods {

    /**
     * Обмен элементов массива
     * @param array входящий массив типа int
     * @param i первый индекс
     * @param j второй индекс
     */
    public static void swap (int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    /**
     * Формирование из массива групп (левый потомок <- родитель -> правый потомок)
     * и распределение в группе (родитель наибольший по значению элемент)
     * @param arr входящий массив
     * @param startInd стартовый индекс (любой в пределах массива)
     */
    public static void groupingAndDistribution(int[] arr, int startInd){
        int n = arr.length;
        int parentInd = startInd;
        int leftInd = 2 * startInd + 1;
        int rightInd = 2 * startInd + 2;
        if(leftInd < n && arr[leftInd] > arr[parentInd])
            parentInd = leftInd;
        if(rightInd < n && arr[rightInd] > arr[parentInd])
            parentInd = rightInd;
        if(parentInd != startInd) {
            swap(arr, parentInd, startInd);
            groupingAndDistribution(arr, parentInd);
        }
    }
}
