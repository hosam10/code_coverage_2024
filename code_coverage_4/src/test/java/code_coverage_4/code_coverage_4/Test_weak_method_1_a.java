package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import code_coverage_4.code_coverage_4.WeakClass_1.Triangle_Types;
import static org.mockito.Mockito.*;

public class Test_weak_method_1_a {
	WeakClass_1 tester = new WeakClass_1();
	isEquilateral isEquilateral = Mockito.mock(isEquilateral.class);
	isIsosceles isIsosceles = Mockito.mock(isIsosceles.class);
	isTriangle isTriangle = Mockito.mock(isTriangle.class);
	TriangleClassifier triangleClassifier = new TriangleClassifier(isEquilateral, isIsosceles, isTriangle);

	public void unitest_isIsolecense() {
		int a = 7, b = 4, c = 4;
		Mockito.when(isTriangle.test(a, b, c)).thenReturn(true);
		Mockito.when(isIsosceles.test(a, b, c)).thenReturn(true);
		String expected_result = Triangle_Types.Isosceles.toString();
		String actual_result = WeakClass_1.classifyTriangle(a, b, c);
		assertEquals(expected_result, actual_result);
	}

	@Test
	public void weakmethod1b() {
		int result = tester.weakMethod1(10, 2);
		int expected = 1;

		assertEquals(expected, result);
	}

	@Test
	public void weakmethod1b2() {
		int result = tester.weakMethod1(-10, 2);
		int expected = -1;

		assertEquals(expected, result);
	}

}