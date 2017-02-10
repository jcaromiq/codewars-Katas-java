package es.joaquincaro.codewars.katas;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PhoneNumber {


	public static String createPhoneNumber(int[] numbers) {
		
		IntStream numberStream = Arrays.stream(numbers);
		
		numbers = numberStream
				.filter(number -> {
					return !(number <0 || number >9);})
				.toArray();
		
		if(numbers.length!= 10) throw new IllegalArgumentException();

		return String.format("(%s) %s-%s", 
				numbersBetween(numbers,0,3), 
				numbersBetween(numbers,3,6), 
				numbersBetween(numbers,6,10));

	}

	private static StringBuffer numbersBetween(int[] numbers,int start, int end) {
		StringBuffer block = new StringBuffer("");
		IntStream.range(start, end).forEach(index ->{
			block.append(numbers[index]);
		});
		return block;
	}

}
