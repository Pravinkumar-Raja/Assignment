package Functional;
import java.util.function.Consumer;
public class ConsumerEx {
	

	    public static void main(String[] args) {

	        Consumer<Integer> printSquare = n -> 
	                System.out.println("Square: " + (n * n));

	        printSquare.accept(5);
	    }



}
