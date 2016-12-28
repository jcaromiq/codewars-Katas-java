package es.joaquincaro.codewars.katas;

import java.util.Arrays;

public class FindOutlier {

	static int find(int[] integers) {
		int outlier=0;
		int[] even = Arrays.stream(integers).filter(x -> (x & 1) == 0).toArray();
		if (even.length==1) outlier = even[0]; 
		int[] odd = Arrays.stream(integers).filter(x -> (x & 1) != 0).toArray();
		if (odd.length==1) outlier = odd[0];
		return outlier;
	}
}
 