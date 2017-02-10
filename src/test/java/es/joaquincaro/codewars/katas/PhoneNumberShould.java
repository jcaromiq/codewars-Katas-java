package es.joaquincaro.codewars.katas;

import static es.joaquincaro.codewars.katas.PhoneNumber.createPhoneNumber;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PhoneNumberShould {
	
	@Test
	public void create_phone_number_given_ten_digits_in_phone_number_format() throws Exception {

		assertThat(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}), equalTo("(123) 456-7890"));
	}

}
