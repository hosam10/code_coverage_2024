package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import code_coverage_4.code_coverage_4.WeakClass_1.Triangle_Types;

public class Unit_test_triangle_classifier {
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

	@Test
    public void testEquilateral() {
        assertEquals("Equilateral", WeakClass_1.classifyTriangle(7, 7, 7));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("Error: Not a Triangle", WeakClass_1.classifyTriangle(3, 4, 3));
    }

    @Test
    public void testIsosceles() {
        assertEquals("Isosceles", WeakClass_1.classifyTriangle(6, 6, 5));
    }

    @Test
    public void testScalene() {
        assertEquals("Scalene", WeakClass_1.classifyTriangle(3, 4, 5));
    }    
}
