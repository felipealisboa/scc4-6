package string;

public class UpperCase {

    private int id;
    private String word;

    public UpperCase(int id, String word) {
        this.id = id;
        this.word = word;

        transformToUpperCase(word);
    }

    private void transformToUpperCase(String word) {
        String stringUpperCase;
        stringUpperCase = word.toUpperCase();

        System.out.println(stringUpperCase);
    }
}
