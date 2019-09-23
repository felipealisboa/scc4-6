import numbers.*;
import string.*;
import math.*;

import rest.JsonTransformer;
import static spark.Spark.*;

public class Main {


    public static void main(String[] args) {

        Integer[] numbers = {23, 35, 50, 21};
        String word = "desafio";
        String name = "Paulo Pereira Junior";


        before((request, response) -> response.type("application/json"));

        // int/Integer answers
        get("/reverse", (request, response) -> new NumberReverse(1, numbers), new JsonTransformer());
        get("/odd", (request, response) -> new NumberOdd(1, numbers), new JsonTransformer());
        get("/even", (request, response) -> new NumberEven(1, numbers), new JsonTransformer());

        // string answers
        get("/stringlength", (request, response) -> new StringLength(1, word), new JsonTransformer());
        get("/uppercase", (request, response) -> new UpperCase(1, word), new JsonTransformer());
        get("/vowelletter", (request, response) -> new VowelLetter(1, word), new JsonTransformer());
        get("/consonantletter", (request, response) -> new Consonant(1, word), new JsonTransformer());
        get("/bibliography", (request, response) -> new Bibliography(1, name), new JsonTransformer());

        new MonetarySystem(3,5,8);
        new MonetarySystem(3,5,11);
        new MonetarySystem(3,5,13);
        new MonetarySystem(3,5,30);
        new MonetarySystem(3,5,50);
        new MonetarySystem(3,5,56);

        Fraction fractionOne = new Fraction(2,10);
        Fraction fractionTwo = new Fraction(7,8);

        Fraction add = fractionOne.add(fractionTwo);
        Fraction subtract = fractionOne.subtract(fractionTwo);
        Fraction multiply = fractionOne.multiply(fractionTwo);
        Fraction divide = fractionOne.divide(fractionTwo);
    }
}
