package Solution;

import java.util.ArrayList;
import java.util.List;

public class Q6_ZigZagConversion {
    // take away in this question:
    // 1. x ? true:false expression
    // 2. use of StringBuilder in List<>, where reminds me <> can hold any object, including StringBuilder
    public String convert(final String s, final int numRows) {
        if (numRows == 1) {
            return s;
        }

        final List<StringBuilder> rows = new ArrayList<>();
        int curRow = 0;
        boolean goingDown = false;
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        for (final Character c : s.toCharArray()) {
            rows.get(curRow).append(c);

            if (curRow == 0 || curRow == numRows - 1) {
                goingDown = !goingDown;
            }
            curRow += goingDown ? 1 : -1;
        }
        final StringBuilder ans = new StringBuilder();

        for (final StringBuilder sb : rows) {
            ans.append(sb);    
        }
        return ans.toString();
    }
}