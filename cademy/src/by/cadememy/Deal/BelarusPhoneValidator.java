package by.cadememy.Deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator{

	
		private Pattern pattern = Pattern.compile("\\+(375)\\d{9}");

		@Override
		public boolean validate(String str) {

			Matcher matcher = pattern.matcher(str);
			return  matcher.matches();
		}

	}