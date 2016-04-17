package nyc.personabe1984.treehouse;

import com.teamtreehouse.Treet;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    Treet treet = new Treet(
                "craigsdennis",
                "Want to be famous? Simply tweet about Java and use " +
                "the hashtag #treet. I'll use your tweet in a new " +
                "@treehouse course about data structure",
                new Date(1421849732000L)
        );

        Treet secondTreet = new Treet(
                "journeytocode",
                "@treehouse makes learning Java sooooo fun! #treet",
                new Date(1421878767000L)
        );

        System.out.printf("This is a new Treet: %s %n", treet);
        System.out.println("The words are:");
        for (String word : treet.getWords()){
            System.out.println(word);
        }

        Treet[] treets = {treet, secondTreet};
        Arrays.sort(treets);
    }
}
