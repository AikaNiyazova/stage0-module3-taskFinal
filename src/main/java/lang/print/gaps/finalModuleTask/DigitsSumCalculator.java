package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        String num = String.valueOf(number);
        char[] digits = num.toCharArray();
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += num.charAt(i);
        }
        System.out.println(sum);
    }
}
