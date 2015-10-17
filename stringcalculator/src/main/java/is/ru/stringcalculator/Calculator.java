package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(",") || text.contains("\n") || text.contains(";")){
			return sum(splitNumbers(text));
		}
		else
			return 1;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static boolean isNumber(String numbers) {
		//checks if the string only contains decimal numbers
		return numbers.matches("[0-9]");
	}
	
	private static String[] splitNumbers(String numbers){
	    return numbers.split("[,\n;]");
	}
	 
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
			//only adds the number if it's a decimal number
			if(isNumber(number)) {
				total += toInt(number);
			}
		}
		return total;
	}
}