package is.ru.stringcalculator;

public class Calculator {

	public static String delimiter = ",";
	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(delimiter)){
			return sum(splitNumbers(text));
		}
		else
			return toInt(text);
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}
	
	private static String[] splitNumbers(String numbers){
		return numbers.split(delimiter);
	}
	 
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
			total += toInt(number);
		}
		return total;
	}
}