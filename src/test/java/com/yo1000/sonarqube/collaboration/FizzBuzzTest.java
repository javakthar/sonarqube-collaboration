package com.yo1000.sonarqube.collaboration;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yo1000 on 2016/07/10.
 */
public class FizzBuzzTest {
    @Test
    public void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals(fizzBuzz.fizz(1), "");
        Assert.assertEquals(fizzBuzz.fizz(2), "");
        Assert.assertEquals(fizzBuzz.fizz(3), "Fizz");
        Assert.assertEquals(fizzBuzz.fizz(4), "");
        Assert.assertEquals(fizzBuzz.fizz(5), "");
        Assert.assertEquals(fizzBuzz.fizz(6), "Fizz");
        Assert.assertEquals(fizzBuzz.fizz(15), "Fizz");
    }

    @Test
    public void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals(fizzBuzz.buzz(1), "");
        Assert.assertEquals(fizzBuzz.buzz(2), "");
        Assert.assertEquals(fizzBuzz.buzz(3), "");
        Assert.assertEquals(fizzBuzz.buzz(4), "");
        Assert.assertEquals(fizzBuzz.buzz(5), "Buzz");
        Assert.assertEquals(fizzBuzz.buzz(6), "");
        Assert.assertEquals(fizzBuzz.buzz(15), "Buzz");
    }

    @Test
    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals(fizzBuzz.fizzBuzz(1), "1");
        Assert.assertEquals(fizzBuzz.fizzBuzz(2), "2");
        Assert.assertEquals(fizzBuzz.fizzBuzz(3), "Fizz");
        Assert.assertEquals(fizzBuzz.fizzBuzz(4), "4");
        Assert.assertEquals(fizzBuzz.fizzBuzz(5), "Buzz");
        Assert.assertEquals(fizzBuzz.fizzBuzz(6), "Fizz");
        Assert.assertEquals(fizzBuzz.fizzBuzz(15), "FizzBuzz");
    }
}
