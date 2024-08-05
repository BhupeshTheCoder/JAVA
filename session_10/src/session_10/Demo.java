package session_10;

import java.util.stream.IntStream;

public class Demo {
	
	public static void main(String[] args) {
		
		//Imperative Programming
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+"\t");
		}
		
		System.out.println();
		
		//Declarative Programming
		IntStream numbers = IntStream.of(1,2,3,4,5);
		numbers.forEach(System.out::println);
		
		/*
		 * int s = numbers.sum(); System.out.println(s);
		 */
		
		int sum = IntStream.of(1,2,3,4,5).sum();
		System.out.println("Sum = "+sum);
		
		int total = IntStream.rangeClosed(1, 10).sum();
		System.out.println("Total = "+total);
		
	}

}
