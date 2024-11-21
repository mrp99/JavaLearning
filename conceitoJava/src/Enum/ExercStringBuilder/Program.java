package Enum.ExercStringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main (String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");

        Comment c1 =  new Comment ("Have a nice trip!");
        Comment c2 =  new Comment ("Wow that´s awesome!");
        Post p1 = new Post (
                simpleDateFormat.parse ("21/06/2023 13:05:44"),
                "Traveling to New Zealand",
                "I ´m going to visit this wonderful country!",
                12
        );
        p1.addComment (c1);
        p1.addComment (c2);


        Comment c3 =  new Comment ("Good Night!");
        Comment c4 =  new Comment ("May the Force be with you");
        Post p2 = new Post (
                simpleDateFormat.parse ("28/07/2023 23:14:19"),
                "Good night guys",
                "See you tomorrow!",
                5
        );
        p1.addComment (c3);
        p1.addComment (c4);

        System.out.println (p1);
        System.out.println (p2);


        System.out.println (p1);

    }
}
