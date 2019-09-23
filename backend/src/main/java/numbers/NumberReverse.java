package numbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberReverse {

    private int id;
    private Integer[] numbers;

    public NumberReverse(int id, Integer[] numbers) {
        this.id = id;
        this.numbers = numbers;

        reverse(numbers);
    }

    private void reverse(Integer[] number) {

        List<Integer> list = Arrays.asList(number);
            Collections.reverse(list);
        for (Integer num: list) {
            System.out.println(num);
        }
    }
}
