package es.joaquincaro.codewars.katas;

import static es.joaquincaro.codewars.katas.PhoneNumber.createPhoneNumber;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Test;

public class PhoneNumberShould {

	@Test
	public void create_phone_number_given_ten_digits_in_phone_number_format() throws Exception {
 
		assertThat(createPhoneNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }), equalTo("(123) 456-7890"));

	}

	@Test(expected = IllegalArgumentException.class)
	public void throws_an_exception_if_not_given_ten_digits() throws Exception {
		
		createPhoneNumber(new int[] {1,2,3,4,5});

	}
	
	@Test(expected = IllegalArgumentException.class)
	public void throws_an_exception_if_digits_are_minor_than_0_or_bigger_than_9() throws Exception {
		
		createPhoneNumber(new int[] { 10, 2, 3, 4, -5, 6, 7, 8, 9, 0 });
		
	}

}
