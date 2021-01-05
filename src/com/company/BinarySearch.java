public class BinarySearch {
    final int[] array;
    int result;
    int Left;
    int Right;

    BinarySearch(int[] array) {
        this.array = array;
        Left = 0;
        Right = array.length - 1;
        result = 0;
    }

    void Step(int N) {
        if(result != 0) {
            return;
        }
        int middle = (Left + Right) / 2;
        if (N == array[middle]) {
            result = 1;
            return;
        }
        if(Left == Right) {
            result = -1;
            return;
        }
        if (N > array[middle]) {
            Left = middle + 1;
        } else {
            Right = middle - 1;
        }
    }

    int GetResult() {
        return result;
    }

}
