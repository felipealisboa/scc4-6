package string;

public class Consonant {

    private int id;
    private String word;

    public Consonant(int id, String word) {
        this.id = id;
        this.word = word;

        letterIsConsonants(word);
    }

    private void letterIsConsonants(String word) {
        String str = word.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char vowelLetter = str.charAt(i);
            if(vowelLetter != 'a' && vowelLetter != 'e' && vowelLetter != 'i' && vowelLetter != 'o' && vowelLetter != 'u'  )
                System.out.println(vowelLetter);
            }
        }
}

