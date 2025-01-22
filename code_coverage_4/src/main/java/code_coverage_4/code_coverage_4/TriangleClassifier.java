package code_coverage_4.code_coverage_4;

public class TriangleClassifier {
	private isEquilateral IsEquilateral;
	private isIsosceles IsIsosceles;
	private isTriangle IsTriangle;

	public TriangleClassifier(isEquilateral isEquilateral, isIsosceles isIsosceles, isTriangle isTriangle) {
		this.IsEquilateral = isEquilateral;
		this.IsIsosceles = isIsosceles;
		this.IsTriangle = isTriangle;
	}

	public isEquilateral getIsEquilateral() {
		return IsEquilateral;
	}

	public void setIsEquilateral(isEquilateral isEquilateral) {
		IsEquilateral = isEquilateral;
	}

	public isIsosceles getIsIsosceles() {
		return IsIsosceles;
	}

	public void setIsIsosceles(isIsosceles isIsosceles) {
		IsIsosceles = isIsosceles;
	}

	public isTriangle getIsTriangle() {
		return IsTriangle;
	}

	public void setIsTriangle(isTriangle isTriangle) {
		IsTriangle = isTriangle;
	}

}
