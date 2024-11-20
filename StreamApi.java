
import java.util.Arrays;
import java.util.List;

public class StreamApi {

    public static void main(String[] args) {
        
        List<Integer> Salary = Arrays.asList(5000, 7000, 8000, 100000, 15000);

        
        int totalSalary = Salary.stream()

        .reduce(0, Integer::sum);

        System.out.println("Total Salary :" + totalSalary);
    }
    
}
