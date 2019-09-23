package numbers;

public class NumberOdd {

    private int id;
    private Integer[] numbers;

    public NumberOdd(int id, Integer[] numbers) {
        this.id = id;
        this.numbers = numbers;

        oddNumbers(numbers);
    }

    private void oddNumbers(Integer[] number) {
        for (int i = 0; i < number.length; i++) {
            if(number[i] % 2 != 0) {
                System.out.println("The odd numbers are: " + number[i]);
            }
        }
    }

}
