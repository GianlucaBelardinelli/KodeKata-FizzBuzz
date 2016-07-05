/**
 * Created by Gianluca on 05/07/2016.
 */
public class FizzBuzz {


    public String evaluate(int number) {
        if (isMultipleOf3(number) && isMultipleOf5(number)){
            return "FizzBuzz";
        }
        if (isMultipleOf3(number)) {
            return "Fizz";
        } else if (isMultipleOf5(number)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean isMultipleOf5(int number) {
        return 0 == number % 5;
    }

    private boolean isMultipleOf3(int number) {
        return 0 == number % 3;
    }
}
