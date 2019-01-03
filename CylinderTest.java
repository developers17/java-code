class Cylinder {
	final double pi = 3.1415926;
	double radius, height;

	void setSides(double _r, double _h) {
		if (_r < 0 || _h < 0)
			System.out.println("�Ƿ���������");
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

public class CylinderTest {
	public static void main(String args[]) {
		Cylinder myCylinder = new Cylinder();
		myCylinder.setSides(1, 1);
		System.out.println("Բ��������ǣ�" + myCylinder.area());
		System.out.println("Բ������ǣ�" + myCylinder.volume());

	}
}
