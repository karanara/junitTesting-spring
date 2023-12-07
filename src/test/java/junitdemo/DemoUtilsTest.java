package junitdemo;

import org.junit.jupiter.api.*;

import com.luv2code.junitdemo.DemoUtils;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.List;

public class DemoUtilsTest {

	DemoUtils demoUtils;
	
	@BeforeEach
	public void beforeEach() {
		demoUtils = new DemoUtils();
	}
	
	@DisplayName("Test Equals and Not Equals")
	@Test
	@Order(0)
	public void testAdd() {
		assertEquals(6,demoUtils.add(3, 3),"result should be equal");
		assertNotEquals(6,demoUtils.add(5, 5),"result should not be equal");
	}
	
	@DisplayName("Null or not Null")
	@Test
	public void checkNull() {
		assertNull(demoUtils.checkNull(null),"object should be null");
		assertNotNull(demoUtils.checkNull("ramya"),"object should not be null");
	}
	
	@DisplayName("Same or Not Same")
	@Test
	public void CheckSameNotSame() {
		assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate(),"same when they refer to same object");
		assertNotSame("ramya",demoUtils.getAcademy(),"not same when they dont refer to same object");
	}
	
	@DisplayName("True Or false")
	@Test
	public void trueOrFalse() {
		assertFalse(demoUtils.isGreater(6,8),"a should greater than b");
		assertTrue(demoUtils.isGreater(4, 3),"a shouldnt greater than b");
	}
	
	@DisplayName("Array Equals")
	@Test
	public void testArrayEquals() {
		String[] matchArray ={"A","B","C"};
		
		assertArrayEquals(demoUtils.getFirstThreeLettersOfAlphabet(),matchArray,"array should be equal");
	}
	@DisplayName("List Equals--Iterable")
	@Test
	public void testIterableEquals() {
		List<String> matchList = List.of("luv", "2", "code");
		assertIterableEquals(demoUtils.getAcademyInList(),matchList,"List should be same");
	}
	@DisplayName("Lines Match --- Assertion")
	@Test
	public void testLinesMatch() {
		List<String> matchList= List.of("luv", "2", "code");
		assertLinesMatch(demoUtils.getAcademyInList(),matchList,"Lines in list should match");
	}
	@DisplayName("Throws and Does Not Throw")
	@Order(3)
    @Test
    void testThrowsAndDoesNotThrow() {
        assertThrows(Exception.class, () -> { demoUtils.throwException(-1); }, "Should throw exception");

        assertDoesNotThrow(() -> { demoUtils.throwException(5); }, "Should not throw exception");

    }
	@DisplayName("Timeout")
    @Test
    @Order(2)
    void testTimeout() {

        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> { demoUtils.checkTimeout(); },
                "Method should execute in 3 seconds");
    }
}

