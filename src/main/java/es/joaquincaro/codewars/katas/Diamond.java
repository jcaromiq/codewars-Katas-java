package es.joaquincaro.codewars.katas;

import java.util.stream.IntStream;

public class Diamond {
	public static String print(int n) {
		String diamond = null;
		if (n >= 3 && (n & 1) != 0) {
			StringBuffer buff = new StringBuffer("");
			for (int i = 1; i <= n; i += 2) {
				createLine(n, buff, i);
			}
			for (int i = n - 2; i >= 1; i -= 2) {
				createLine(n, buff, i);
			}
			diamond = buff.toString();
		}

		return diamond;
	}

	private static void createLine(int n, StringBuffer buff, int i) {
		buff
		.append(fillWith(' ', (n - i) / 2))
		.append(fillWith('*', i))
		.append("\n");
	}

	public static String fillWith(char character, int length) {
		StringBuffer buff = new StringBuffer("");
		IntStream.range(0, length).forEach(i-> {
			buff.append(character);
		});
		return buff.toString();
	}

}
