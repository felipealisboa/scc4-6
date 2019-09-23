package string;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringJoiner;

public class Bibliography {

    private int id;
    private String name;

    public Bibliography(int id, String name) {
        this.id = id;
        this.name = name;

        transformToBibliography(name);
    }

    private void transformToBibliography(String name) {

        String[] nameToBibliographyFormat = name.split(" ");
        int length = nameToBibliographyFormat.length;

        String strLast = Array.get(nameToBibliographyFormat, (length-1)).toString();
        String lastName = strLast.toUpperCase();

        StringBuilder stringBuilder = new StringBuilder();

        for (String str: nameToBibliographyFormat) {
            if(!str.equals(strLast)) {
                stringBuilder.append(str).append(" ");
            }
        }
        System.out.println(lastName + ", " + stringBuilder);
    }

}
