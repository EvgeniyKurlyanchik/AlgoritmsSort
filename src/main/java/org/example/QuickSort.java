package org.example;

import java.util.Arrays;

//Быстрая сортировка (Quick Sort) - это алгоритм сортировки, который основан
//        на принципе "разделяй и властвуй". Он использует стратегию разбиения массива
//        на две части относительно опорного элемента (pivot), сравнивает элементы с опорным
//        и перемещает их вправо или влево относительно опорного элемента. Затем процесс повторяется
//        рекурсивно для каждой из двух полученных частей до тех пор, пока массив не будет отсортирован полностью.
//
//        Пример кода на Java:
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        QuickSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
//    Этот код реализует алгоритм быстрой сортировки в методе sort, который вызывает
//        метод quickSort для каждой половины массива. Метод partition используется для
//        разбиения массива на две части и возвращает индекс опорного элемента после перемещения
//        всех элементов, меньших опорного, на левую сторону, а больших или равных - на правую.
//
//        Пример использования:
//
//        scss
//        Copy code
//        int[] arr = {10, 7, 8, 9, 1, 5};
//        QuickSort.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        Этот код создает массив из 6 элементов и сортирует его с помощью метода sort класса
//        QuickSort. Результатом будет отсортированный массив: [1, 5, 7, 8, 9, 10].
