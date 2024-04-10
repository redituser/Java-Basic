package test;

public class Triangle01 {

	private double base;
	private double high;

	double findArea() {
		return base * high / 2;
	}

	public Triangle01(double base, double high) {
		this.base = base;
		this.high = high;
	}

	// 접근자 설정
	double getBase() {
		return base;
	}

	// 설정자
	void setBase(double base) {
		this.base = base;
	}

	double getHigh() {
		return high;
	}

	void setHigh(double high) {
		this.high = high;
	}

	boolean isSameArea(Triangle t) {
		return t.findArea() == this.findArea();
	}

}
