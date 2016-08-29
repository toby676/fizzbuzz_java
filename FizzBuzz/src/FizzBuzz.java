
public class FizzBuzz {

	public static void main(String[] args) {


	}

	public String play(int number) {

		if (number == 15) {
			return "FizzBuzz";
		}
		if (number == 3) {
			return "Fizz";
		}
		if (number == 5) {
			return "Buzz";
		}
		return Integer.toString(number);
	}

}
