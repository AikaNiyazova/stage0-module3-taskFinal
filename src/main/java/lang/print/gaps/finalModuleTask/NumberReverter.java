package lang.print.gaps.finalModuleTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberReverter {
    public void revert(int number) {
        String num = String.valueOf(number);
        List<char[]> digits = new ArrayList<>(Collections.singleton(num.toCharArray()));
        List<char[]> reversed = new ArrayList<>();
        for (int i = digits.size() - 1; i >= 0; i--) {
            reversed.add(digits.get(i));
        }
        System.out.println(reversed);
    }
}
