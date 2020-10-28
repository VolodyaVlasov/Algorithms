import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] Array = {1, 2, 8, 6, 4, 5, 7, 9, 3, 10, 11, 12, 13, 15, 14};
        int[] Array2 = {1, 2, 8, 6, 4,     5, 7, 9, 3, 10,      11, 12, 13, 15, 14};


        int b = SortLevel.BFPRT(Array2, 0, Array.length - 1, 14);
        System.out.println(b);
        /*List<Integer> a = SortLevel.KthOrderStatisticsStep(Array, 0, Array.length - 1, 7);

        for (int i = 0; i < 2; i++) {
            System.out.print(a.get(i) + " ");
        }*//*

        for (int i = 0; i < 2; i++) {
            System.out.print(b.get(i) + " ");
        }*/
    }
}
