package string;

public class StringLength {

    private int id;
    private String word;

    public StringLength(int id, String word) {
        this.id = id;
        this.word = word;

        countLetters(word);
    }

    private void countLetters(String word) {
        int total = 0;

        for (int i = 0; i < word.length(); i++) {
            total = word.length();
        }
        System.out.println("Length of the string is: " + total);
    }

}
