import com.sun.org.apache.xml.internal.security.signature.Manifest;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] Array = {1, 2, 8, 6, 4,  5, 7, 9, 3, 10,  11, 12, 13, 14, 15,  17, 16};

        /*

        for (int i = 0; i < Array.length; i+= 5) {
            if (i + 5 >= Array.length) {
                while(!SortLevel.BubbleSortStep(Array, i, Array.length - 1));
            } else {
                while(!SortLevel.BubbleSortStep(Array, i, i + 4));
            }
        }*/


        int[] medians = new int[(Array.length / 5) + 1];
        System.out.println(medians.length);

        //System.out.println(Arrays.toString(Array));
    }
}
