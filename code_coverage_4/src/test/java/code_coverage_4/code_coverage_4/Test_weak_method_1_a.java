package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_weak_method_1_a {
	
	WeakClass_1 tester= new WeakClass_1();
	
	 @Test
	    public void testNotTriangle_TC1() {
	        assertEquals("Nottriangle", WeakClass_1.classifyTriangle(1, 2, 3));
	    }

	    @Test
	    public void testNotTriangle_TC2() {
	        assertEquals("Nottriangle", WeakClass_1.classifyTriangle(1, 2, 5));
	    }

	    @Test
	    public void testNotTriangle_TC3() {
	        assertEquals("Nottriangle", WeakClass_1.classifyTriangle(3, 5, 8));
	    }

	    @Test
	    public void testEquilateral_TC4() {
	        assertEquals("equilateral", WeakClass_1.classifyTriangle(13, 13, 13));
	    }

	    @Test
	    public void testIsosceles_TC5() {
	        assertEquals("isosceles", WeakClass_1.classifyTriangle(14, 14, 18));
	    }

	    @Test
	    public void testIsosceles_TC6() {
	        assertEquals("isosceles", WeakClass_1.classifyTriangle(10, 10, 18));
	    }

	    @Test
	    public void testIsosceles_TC7() {
	        assertEquals("isosceles", WeakClass_1.classifyTriangle(12, 15, 15));
	    }

	    @Test
	    public void testScalene_TC8() {
	        assertEquals("Scalene", WeakClass_1.classifyTriangle(16, 19, 12));
	    }


}