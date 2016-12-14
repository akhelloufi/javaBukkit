
import java.util.*;
import static java.util.function.Function.identity;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

/**
 *
 * @author userteam
 */
public class Java8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        
        
        
        List<String> l = new ArrayList(Arrays.asList("one", "two"));
      Stream<String> sl = l.stream();
      l.add("three");
      String s = sl.collect(Collectors.joining(" ,"));
//System.out.println(s);

List<Integer> list = new ArrayList<Integer>(Arrays.asList(4,78,89,10,99));

Stream<Integer> stream = list.stream();

//stream.map(x->x%2).forEach(p -> System.out.println(p));
List<Integer> res=stream.map(x->x%2).collect(Collectors.toList());
//System.out.println(res);

   List<String> studentNames = new ArrayList(Arrays.asList("amine", "ali","badr","ali","badr","ali"));
    

int j = studentNames.stream()
.map(x -> x.length())
.reduce((x, y) -> x + y).get();
///System.out.println(j);
long count = Stream.iterate(1,n->n+3)
.limit(100)
.filter(x -> x % 2 == 0)
.count();

//System.out.println(count);

Map<String, Long> collect =
studentNames.stream().collect(Collectors.groupingBy(identity(),counting()));

System.out.println(collect.get("badr"));
HashMap<String,Integer>  co=new HashMap<String,Integer>();



    }
    
}
