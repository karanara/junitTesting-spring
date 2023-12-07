package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.luv2code.junitdemo.tdd.FizzBuzzClass;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FizzBuzzTestClass {

	@DisplayName("divisible by 3")
	@Order(1)
	@Test
	public void testWithThree() {
		assertEquals("Fizz",FizzBuzzClass.compute(6));
	}
	@DisplayName("divisible by 5")
	@Order(2)
	@Test
	public void testWithFive() {
		assertEquals("Buzz",FizzBuzzClass.compute(10));
	}
	@DisplayName("divisible by 3 and 5")
	@Test
	@Order(3)
	public void testWithThreeFive() {
		assertEquals("FizzBuzz",FizzBuzzClass.compute(15));
	}
	
	@DisplayName("Testing with Small data File")
	@ParameterizedTest(name="value={0},expected={1}")
	@CsvFileSource(resources="/small-test-data.csv")
	@Order(4)
	public void testSmallData(int value,int expected) {
		assertEquals(expected,FizzBuzzClass.compute(value));
	}
	@DisplayName("Testing with Large data File")
	@ParameterizedTest(name="value={0},expected={1}")
	@CsvFileSource(resources="/large-test-data.csv")
	@Order(6)
	public void testLargeData(int value,int expected) {
		assertEquals(expected,FizzBuzzClass.compute(value));
	}
	@DisplayName("Testing with Medium data File")
	@ParameterizedTest(name="value={0},expected={1}")
	@CsvFileSource(resources="/medium-test-data.csv")
	@Order(5)
	public void testMediumData(int value,int expected) {
		assertEquals(expected,FizzBuzzClass.compute(value));
	}
	
}
