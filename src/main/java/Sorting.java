public class Sorting {

    /**
     * Сортировка кучей
     * @param arr входящий массив типа int
     */
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // формируем дерево и наибольший элемент передвигаем в самый верх
        for (int i = n / 2 - 1; i >= 0; i--)
            Methods.groupingAndDistribution(arr, i);

        // проходим весь массив в обратном порядке элемент с индексом 0
        // (наибольший) передвигаем в конец массива и
        // уменьшаем количество проверяемых элементов на 1
        // (последние элементы отсортированы)
        for (int i = n - 1; i >= 0; i--) {
            Methods.swap(arr, i, 0);
            Methods.groupingAndDistribution(arr, 0);
        }
    }

    /**
     * Быстрая сортировка
     * @param array входящий массив
     * @param minInd минимальный индекс (0)
     * @param maxInd максимальный индекс (array.length - 1)
     */
    public static void quickSort(int[] array, int minInd, int maxInd) {
        if (array.length == 0)
            return;

        if (minInd >= maxInd)
            return;

        int pivotInd = minInd + (maxInd - minInd) / 2;  // индекс опорного элемента
        int pivot = array[pivotInd];                    // значение опорного элемента

        int i = minInd, j = maxInd;         // минимальный и максимальный индексы для подмассивов
        while (i <= j) {
            while (array[i] < pivot) {      // перебор элементов слева от опорного
                i++;
            }
            while (array[j] > pivot) {      // перебор элементов справа от опорного
                j--;
            }
            if (i <= j) {
                Methods.swap(array, i, j);  // перестановка элементов относительно опорного
                i++;                        // и переход к следующим
                j--;
            }
        }
        // рекурсивная сортировка в подмассивах
        if (minInd < j)
            quickSort(array, minInd, j);
        if (maxInd > i)
            quickSort(array, i, maxInd);
    }
}
