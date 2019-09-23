package string;

public class VowelLetter {

    private int id;
    private String word;

    public VowelLetter(int id, String word) {

        this.id = id;
        this.word = word;

        letterIsVowel(word);
    }

    private void letterIsVowel(String word) {
        String str = word.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
            char vowelLetter = str.charAt(i);
            if(vowelLetter =='a' || vowelLetter =='e' || vowelLetter =='i' || vowelLetter =='o' || vowelLetter =='u' ) {
                System.out.println(vowelLetter);
            }
        }
    }
}
