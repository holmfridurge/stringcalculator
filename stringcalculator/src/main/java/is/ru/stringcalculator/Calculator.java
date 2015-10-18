package is.ru.stringcalculator;

public class Calculator {
	
	public static String regexNumber = "[0-9]?[0-9]?[0-9]";
	public static String newLineDelimiter = "\n";
	public static int add(String text){
		String delimiter = ",";
		if(text.startsWith("//")) {
			char temp = text.charAt(2);
			String temp2 = String.valueOf(temp);
			delimiter = temp2;
		}
		if(text.equals("")){
			return 0;
		} else
			return sum(splitNumbers(text, delimiter));
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}
	
	private static boolean isNumber(String numbers) {
		//checks if the string only contains decimal numbers
	return numbers.matches(regexNumber);
	}
	
	private static String[] splitNumbers(String numbers, String newDelimiter){
	String allDelimiters = "["+newDelimiter+newLineDelimiter+"]";
		return numbers.split(allDelimiters);
	}
	 
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
			if(isNumber(number)) {
				total += toInt(number);
			}
		}
		return total;
	}
}