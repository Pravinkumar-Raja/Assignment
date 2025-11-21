package Functional;
import java.util.function.Predicate;
public class PredicateEx {


	    public static void main(String[] args) {

	        Predicate<String> isValidUsername = username -> username.length() > 5;

	        String username = "pravin";

	        System.out.println("Is valid username? " + isValidUsername.test(username));
	    }
	
}
