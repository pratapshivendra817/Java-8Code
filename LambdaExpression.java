
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpression {

    public static void main(String[] args) {
        
        List<String> employees= Arrays.asList("Ajay","Vivek","Rishav","Seema","Suyash");
      
        List<String> filteredEmployees = employees.stream()
        .filter(name -> name.startsWith("A"))
                                             
        .collect(Collectors.toList());

        System.out.println("filteredList :" + filteredEmployees);


    }
    
}
