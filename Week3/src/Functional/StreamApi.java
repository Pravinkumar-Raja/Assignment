package Functional;
import java.util.*;
import java.util.stream.*;
public class StreamApi {


	    public static void main(String[] args) {

	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        List<Integer> result = numbers.stream()
	                .filter(n -> n % 2 == 0)      // even numbers
	                .map(n -> n * 10)             // multiply by 10
	                .collect(Collectors.toList());

	        System.out.println(result);
	    }

}
