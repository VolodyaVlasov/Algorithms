import java.util.HashMap;
import java.util.Map;

public class ksort {
    final String[] items;
    final static int SIZE = 800;

    ksort() {
        items = new String[SIZE];
    }

    public int index(final String s) {
        if (!checkFormat(s)) {
            return -1;
        }
        return (s.charAt(0) - 'a') * 100 + Character.getNumericValue(s.charAt(1)) * 10
                + Character.getNumericValue(s.charAt(2));
    }

    public boolean add(final String s) {
        final int index = index(s);
        if (index == -1) {
            return false;
        }
        items[index] = s;
        return true;
    }

    private boolean checkFormat(final String s) {
        return s.length() == 3 && s.charAt(0) >= 97  && s.charAt(0) <= 104 &&
                Character.isDigit(s.charAt(1)) && Character.isDigit(s.charAt(2));
    }
}
