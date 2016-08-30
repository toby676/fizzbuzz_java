
public class FizzBuzz {

	public String play(int number) {

		if (isMultipleOf5(number) && isMultipleOf3(number)) {
			return "FizzBuzz";
		}
		if (isMultipleOf3(number)) {
			return "Fizz";
		}
		if (isMultipleOf5(number)) {
			return "Buzz";
		}
		return Integer.toString(number);
	}
	
	private boolean isMultipleOf5(int number) {
		return 0 == number % 5;
	}
	
	private boolean isMultipleOf3(int number) {
		return 0 == number % 3;
	}

}
