import java.util.ArrayList;
import java.util.List;

public class _42_Digit_In_Number {
    public static List<Integer> findNumbers(int n, int d) {
        // code here
        List<Integer> list = new ArrayList<>();
        int oncePosition = 0;

        while (oncePosition != d) {
            oncePosition++;
        }

        if (n > oncePosition * 1000) {
            int thousandsPosition = oncePosition * 100;

            while (thousandsPosition < n && thousandsPosition <= oncePosition * 1000 + 999) {
                list.add(thousandsPosition);
                thousandsPosition++;
            }
        }

        if (n > oncePosition * 100) {
            int hundredPosition = oncePosition * 100;

            while (hundredPosition < n && hundredPosition <= oncePosition * 100 + 99) {
                list.add(hundredPosition);
                hundredPosition++;
            }
        }

        if (n > oncePosition * 10) {
            int thenthPosition = oncePosition * 10;

            while (thenthPosition < n && thenthPosition <= oncePosition * 10 + 9) {
                list.add(thenthPosition);
                thenthPosition++;
            }
        }

        while (oncePosition < n) {
            if (oncePosition == (d * 10 + d)) {
                continue;
            }
            list.add(oncePosition);
            oncePosition += 10;
        }

        return list.stream().sorted().toList();

    }

    public static void main(String args[]) {
        System.out.println(findNumbers(50, 2));
        ;
    }
}
