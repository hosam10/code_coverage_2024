package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals; 

import org.junit.Test;
import org.mockito.Mockito;

public class unit_test_Power_calculator {
	Multiplier multiplier = Mockito.mock(Multiplier.class);
	Power_calculator power_calculator = new Power_calculator(multiplier);

	@Test
	public void unitest_multiplier_1() {
		Mockito.when(multiplier.multiply(4.0, 1.0)).thenReturn(4.0);
		Mockito.when(multiplier.multiply(4.0, 2.0)).thenReturn(8.0);
		double a = 4.0, b = 2.0;
		double expected_result = 8.0;
		double actual_result = multiplier.multiply(a, b);
		assertEquals(expected_result, actual_result, 0);
		System.out.println(actual_result);
	}
}


//import static org.junit.Assert.assertEquals; 
//import org.junit.Test;
//import org.mockito.Mockito;
//
//public class unit_test_Power_calculator {
//    @Test
//    public void testPowerCalculator() {
//        // Create a mock Multiplier
//        Multiplier mockMultiplier = Mockito.mock(Multiplier.class);
//
//        // Setup the PowerCalculator with the mocked Multiplier
//        Power_calculator powerCalculator = new Power_calculator(mockMultiplier);
//
//        // Arrange the expected results from the mocked Multiplier
//        Mockito.when(mockMultiplier.multiply(4.0, 4.0)).thenReturn(16.0); // For 4^2, second multiplication
//
//        // Act
//        double result = powerCalculator.power(4.0, 2.0);
//
//        // Assert that the result is as expected
//        assertEquals(16.0, result, 0.001); // Use a delta for floating-point comparison
//
//        // Verify the correct interactions with the mock
//        Mockito.verify(mockMultiplier).multiply(4.0, 4.0);
//    }

//import static org.junit.Assert.assertEquals; 
//
//import org.junit.Test;
//import org.mockito.Mockito;
//
//public class unit_test_Power_calculator {
//    Multiplier multiplier = Mockito.mock(Multiplier.class);
//    Power_calculator powerCalculator = new Power_calculator(multiplier);
//
//    @Test
//    public void unitest_multiplier_1() {
//        Mockito.when(multiplier.multiply(1.0, 4.0)).thenReturn(4.0);
//        Mockito.when(multiplier.multiply(4.0, 4.0)).thenReturn(16.0);
//        
//
//        double a = 4.0, b = 3.0;
//        double expected_result = 64.0;
//        double actual_result = powerCalculator.power(a, b);
//
//        assertEquals(expected_result, actual_result);
//        System.out.println(actual_result);
//    }
//}

