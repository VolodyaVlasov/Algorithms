public class BSearch {
    final int[] array;
    int result;
    int Left;
    int Right;

    BSearch(final int[] array) {
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

    int GetResult() {
        return result;
    }
}
