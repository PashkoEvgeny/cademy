package by.cadememy.Deal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rand {

	public static void main(String[] args) {

		BigDecimal result = new BigDecimal(67.3435498);
		result = result.setScale(2, RoundingMode.HALF_UP);
		
	
		
System.out.println(result);
	}

}
