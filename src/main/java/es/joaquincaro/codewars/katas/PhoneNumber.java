package es.joaquincaro.codewars.katas;

import java.util.stream.IntStream;

public class PhoneNumber {


	public static String createPhoneNumber(int[] numbers) {
		StringBuffer prefix = new StringBuffer("");
		
		IntStream.range(0, 3).forEach(index ->{
			prefix.append(numbers[index]);
		});
		
		StringBuffer middle = new StringBuffer("");
		IntStream.range(3, 6).forEach(index ->{
			middle.append(numbers[index]);
		});
		
		StringBuffer last = new StringBuffer("");
		IntStream.range(6, 10).forEach(index ->{
			last.append(numbers[index]);
		});

		return String.format("(%s) %s-%s", prefix, middle, last);
				
	}

}
