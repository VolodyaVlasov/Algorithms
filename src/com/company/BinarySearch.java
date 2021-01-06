public class BinarySearch {
    final int[] array;
    int result;
    int Left;
    int Right;

    BinarySearch(final int[] array) {
        this.array = array;
        Left = 0;
        Right = array.length - 1;
        result = 0;
    }

    void Step(final int N) {
        if(result != 0) {
            return;
        }
        int middle = (Left + Right) / 2;
        if (N == array[middle]) {
            result++;
            return;
        }
        if(array.length > 1) {
            if (N > array[middle]) {
                Left = ++middle;
            } else {
                Right = --middle;
            }
        }
        if(Left == Right) {
            if(N == array[Left]) {
                result++;
                return;
            }
            result--;
        }
    }

    int GetResult() {
        return result;
    }

    void testHelper(int N) {
        Step(N);
        System.out.print(Left + " ");
        System.out.print(Right + " ");
        System.out.println(result);
    }
}
