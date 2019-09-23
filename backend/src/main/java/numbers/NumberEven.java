package numbers;

import java.util.Arrays;
import java.util.List;

public class NumberEven {

    private int id;
    private Integer[] numbers;

    public NumberEven(int id, Integer[] numbers) {
        this.id = id;
        this.numbers = numbers;

        evenNumbers(numbers);
    }


    private void evenNumbers(Integer[] number) {

        System.out.println("The even numbers are: " );

        for (int i = 0; i < number.length; i++) {
            if(number[i] % 2 == 0) {

                System.out.println( number[i] );
            }
        }
    }
}

