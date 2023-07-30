import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;

public class Infrastructure {

    /**
     * Создание массива из целых чисел от 1 до max
     * @param length длина массива
     * @param max максимальное значение
     * @return int[]
     */
    @NotNull
    public  static int[] newArray(int length, int max){
        int[] array = new int[length];
        for(int i = 0; i < array.length; i++){
            array[i] = new Random().nextInt(max) + 1;
        }
        return array;
    }

    /**
     * Вывод массива в консоль
     * @param array входящий массив
     */
    public static void showArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

}
