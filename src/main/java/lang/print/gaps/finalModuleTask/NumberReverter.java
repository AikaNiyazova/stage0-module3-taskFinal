package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String num = String.valueOf(number);
        String reversed = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            reversed = reversed.concat(String.valueOf(Character.getNumericValue(num.charAt(i))));
        }
        System.out.println(reversed);
    }
}
