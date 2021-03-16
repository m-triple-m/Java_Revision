import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class UsingCollections {

    public static void main(String[] args) {

        // String[] movies = { "roohi", "suryawansham", "don no.1", "KGF", "3 idiots" };

        // Collection movies = new ArrayList(); //way1
        Collection<String> movies = new ArrayList<String>(); // way2
        Collection<String> movies2 = new ArrayList<String>();

        movies2.add("KGF");
        movies2.add("3 Idiots");

        movies.add("roohi");
        movies.add("suryawansham");
        movies.add("don no.1");

        movies.addAll(movies2);

        Boolean ans = movies.contains("4 Idiots");

        movies.remove("KGF");


        System.out.println(ans);

        // movies.add(5678);

        // movies.add(true);

        // System.out.println(movies.toArray()[1]);

        // Iterator myiter = movies.iterator();

        // System.out.println(myiter.next());
        // System.out.println(myiter.next());
        // System.out.println(myiter.next());

        // while(myiter.hasNext()){
        // System.out.println(myiter.next());
        // }

        for (String movie : movies) {
            System.out.println(movie);
        }

    }
}
