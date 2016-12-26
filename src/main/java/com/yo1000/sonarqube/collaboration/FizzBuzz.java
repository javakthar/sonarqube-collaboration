package com.yo1000.sonarqube.collaboration;

/**
 * Created by yo1000 on 2016/07/10.
 */
public class FizzBuzz {
    public String fizz(int value) {
        return value % 3 == 0 ? "Fizz" : "";
    }

    public String buzz(int value) {
        return value % 5 == 0 ? "Buzz" : "";
    }

    public String fizzBuzz(int value) {
        StringBuilder builder = new StringBuilder(fizz(value)).append(buzz(value));
        return builder.length() > 0 ? builder.toString() : String.valueOf(value);
    }
}
