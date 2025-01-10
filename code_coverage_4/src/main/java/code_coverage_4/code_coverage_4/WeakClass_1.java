package code_coverage_4.code_coverage_4;

public class WeakClass_1 {
	
	enum Triangle_Types {
	    equilateral,
	    isosceles,
	    Scalene,
	    Nottriangle,
	    ERROR
	}

	public static String classifyTriangle(int a, int b, int c) {
	    Triangle_Types triangle;

	    // Check if it is NOT a triangle
	    if (c >= a + b) {
	        triangle = Triangle_Types.Nottriangle;
	    } else if (b >= a + c) {
	        triangle = Triangle_Types.Nottriangle;
	    } else if (a >= b + c) {
	        triangle = Triangle_Types.Nottriangle;
	    }
	    // Check if it is an Equilateral triangle
	    else if (a == b && b == c) {
	        triangle = Triangle_Types.equilateral;
	    }
	    // Check if it is an Isosceles triangle
	    else if (a == b) {
	        triangle = Triangle_Types.isosceles;
	    } else if (b == c) {
	        triangle = Triangle_Types.isosceles;
	    } else if (a == c) {
	        triangle = Triangle_Types.isosceles;
	    }
	    // If none of the above, it is a Scalene triangle
	    else {
	        triangle = Triangle_Types.Scalene;
	    }

	    return triangle.toString();
	}

	

}