package is.ru.stringcalculator;

public class Calculator {

	public static String delimiter = ",";
	public static String newLineDelimiter = "\n";
	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else
			return sum(splitNumbers(text));
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}
	
	private static String[] splitNumbers(String numbers){
	String allDelimiters = "["+delimiter+newLineDelimiter+"]";
		return numbers.split(allDelimiters);
	}
	 
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
			total += toInt(number);
		}
		return total;
	}
}