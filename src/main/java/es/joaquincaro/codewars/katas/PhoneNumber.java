package es.joaquincaro.codewars.katas;

import java.util.stream.IntStream;

public class PhoneNumber {


	public static String createPhoneNumber(int[] numbers) {
		
		StringBuffer prefix = numbersBetween(numbers,0,3);
		
		StringBuffer middle = numbersBetween(numbers,3,6);
		
		StringBuffer last = numbersBetween(numbers,6,10);

		return String.format("(%s) %s-%s", prefix, middle, last);
				
	}

	private static StringBuffer numbersBetween(int[] numbers,int start, int end) {
		StringBuffer block = new StringBuffer("");
		IntStream.range(start, end).forEach(index ->{
			block.append(numbers[index]);
		});
		return block;
	}

}
