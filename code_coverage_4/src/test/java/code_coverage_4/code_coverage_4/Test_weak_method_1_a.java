package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals; 

import org.junit.Test;
import org.mockito.Mockito;

import code_coverage_4.code_coverage_4.WeakClass_1.Triangle_Types;
import static org.mockito.Mockito.*;


public class Test_weak_method_1_a {
	isEquilateral IsEquilateral = Mockito.mock(isEquilateral.class);;
	isIsosceles IsIsosceles = Mockito.mock(isIsosceles.class);;
	isTriangle IsTriangle = Mockito.mock(isTriangle.class);;
	TriangleClassifier triTriangleClassifier = new TriangleClassifier(IsEquilateral, IsIsosceles, IsTriangle);

	@Test
	public void unitest_isIsolecense() {
		int a = 3, b = 2, c = 2;
		Mockito.when(IsTriangle.test(a, b, c)).thenReturn(true);
		Mockito.when(IsIsosceles.test(a, b, c)).thenReturn(true);
		String expected_result = Triangle_Types.isosceles.toString();
		String actual_result = WeakClass_1.classifyTriangle(a, b, c);
		assertEquals(expected_result, actual_result);
	}


	
}