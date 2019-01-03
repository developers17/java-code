
class Cylinder {
	final double pi = 3.1415926;
	double radius, height;

	void setSides(double _r, double _h) {
		if (_r < 0 || _h < 0)
			System.out.println("非法数据输入");
		else {
			radius = _r;
			height = _h;
		}
	}

	double area() {
		double a = pi * radius * radius;
		return a;
	}

	double volume() {
		double v = pi * radius * radius * height;
		return v;
	}

}