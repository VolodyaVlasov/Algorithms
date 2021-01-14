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
        if (result != 0) {
            return;
        }
        int middle = (Left + Right) / 2;
        if (N == array[middle]) {
            result++;
            return;
        }
        if (N > array[middle]) {
            Left = ++middle;
        } else {
            Right = --middle;
        }

        if (Right - Left <= 1) {
            if (N == array[Left] || N == array[Right]) {
                result++;
                return;
            }
            result--;
        }
    }

    public  boolean GallopingSearch(final int[] array, int N) {
        int i = 1;
        int index = 0;
        while (index < array.length && array[index] < N) {
            if (array[index] == N) {
                return true;
            }
            index = (int) (Math.pow(2, ++i) - 2);
        }
        index = index > array.length ? array.length - 1 : index;
        if (array[index] >= N) {
            Left = (int) Math.pow(2, i - 1) - 2 + 1;
            Right = index;
            if (Left == Right) {
                return array[index] == N;
            }
            while (GetResult() == 0) {
                Step(N);
            }
            return GetResult() > 0;
        }
        return false;
    }

   public int GetResult() {
        return result;
    }
}
