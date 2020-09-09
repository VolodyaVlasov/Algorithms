package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class SortLevel {
    public static void SelectionSortStep(int[] array, int i) {
        int min = i;
        int temp = array[i];
        for (int j = i + 1; j < array.length; j++) {
            if (array[min] > array[j]) {
                min = j;
            }
        }
        array[i] = array[min];
        array[min] = temp;
    }

    public static boolean BubbleSortStep(int[] array) {
        boolean answer = true;
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (answer) {
                    answer = false;
                }
            }
        }
        return answer;
    }

    public static void InsertionSortStep(int[] array, int step, int i) {
        for (int j = 0; j < array.length / step; j++) {
            int current;
            for (int t = i; t < array.length; t += step) {
                if (t + step < array.length && array[t] > array[t + step]) {
                    current = array[t];
                    array[t] = array[t + step];
                    array[t + step] = current;
                }
            }
        }
    }

    public static ArrayList<Integer> KnuthSequence(int array_size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int N = 1;
        do {
            arrayList.add(N);
            N = 3 * N + 1;
        } while (N < array_size);
        Collections.reverse(arrayList);
        return arrayList;

    }

    public static void ShellSort(int[] array) {
        ArrayList<Integer> arrayList = KnuthSequence(array.length);
        for (int i : arrayList) {
            for (int j = 0; j + i < array.length; j++) {
                InsertionSortStep(array, i, j);
            }
        }
    }

    public static int ArrayChunk(int[] M, int l, int r) {
        int N;
        int index;
        int i1;
        int i2;
        int temp;
        while (true) {
            index = (l + r) / 2;
            N = M[index];
            i1 = l;
            i2 = r;
            while (true) {
                while (M[i1] < N) {
                    i1++;
                }
                try {
                    while (M[i2] > N) {
                        i2--;
                    }
                } catch (Exception e) {
                    System.out.println(l + " " + r);
                    for (int i : M) {
                        System.out.print(i + " ");
                    }
                }

                if (i1 == i2 - 1 && M[i1] > M[i2]) {
                    temp = M[i1];
                    M[i1] = M[i2];
                    M[i2] = temp;
                    break;
                } else if (i1 == i2 || (i1 == i2 - 1 && M[i1] < M[i2])) {
                    return index;
                } else {
                    if (index == i1) {
                        index = i2;
                    } else if (index == i2) {
                        index = i1;
                    }
                    temp = M[i1];
                    M[i1] = M[i2];
                    M[i2] = temp;
                }
            }
        }
    }

    public static void QuickSort(int[] array, int left, int right) {
        if (left == right) {
            return;
        }
        if (left <= right) {
            int N = ArrayChunk(array, left, right);
            QuickSort(array, left, N - 1);
            QuickSort(array, N + 1, right);
        }
    }
}