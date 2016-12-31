package es.joaquincaro.codewars.katas;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MorseCodeDecoder {
	public static String decode(String morseCode) {
		return Arrays.stream(morseCode.trim().split("   "))
				.map(MorseCodeDecoder::translate)
				.collect(Collectors.joining(" "));
	}
	public static String translate(String word) {
		return Arrays.stream(word.split(" "))
				.map(MorseCode::get)
				.collect(Collectors.joining());
	}
}
