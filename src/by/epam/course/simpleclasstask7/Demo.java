package by.epam.course.simpleclasstask7;

public class Demo {

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle(1, 1, 5, 1, 3, 5);

		triangle1 = checkTriangle(triangle1);

		double sideA;
		double sideB;
		double sideC;

		double area;
		double perimetr;
		double semiperimetr;

		sideA = sideOfTriangle(triangle1.getX1(), triangle1.getX2(), triangle1.getY1(), triangle1.getY2());
		sideB = sideOfTriangle(triangle1.getX1(), triangle1.getX3(), triangle1.getY1(), triangle1.getY3());
		sideC = sideOfTriangle(triangle1.getX2(), triangle1.getX3(), triangle1.getY2(), triangle1.getY3());

		perimetr = perimetrTriangle(sideA, sideB, sideC);

		printValue(perimetr);

		semiperimetr = perimetr / 2;

		area = areaTriangle(semiperimetr, sideA, sideB, sideC);

		printValue(area);

		findPointMedian(triangle1.getX1(), triangle1.getX2(), triangle1.getX3(), triangle1.getY1(), triangle1.getY2(),
				triangle1.getY3());

	}

	public static double areaTriangle(double p1, double sideA, double sideB, double sideC) {

		double s;

		s = Math.sqrt(p1 * (p1 - sideA) * (p1 - sideB) * (p1 - sideC));

		return s;

	}

	public static double sideOfTriangle(double x1, double x2, double y1, double y2) {
		double a;

		a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		return a;

	}

	public static double perimetrTriangle(double sideA, double sideB, double sideC) {

		double p;

		p = sideA + sideB + sideC;

		return p;
	}

	public static void printValue(double value) {

		System.out.println(value);
	}

	public static double[] findPointMedian(double x1, double x2, double x3, double y1, double y2, double y3) {

		double[] point = new double[2];

		point[0] = (x1 + x2 + x3) / 3.0;
		point[1] = (y1 + y2 + y3) / 3.0;

		System.out.println("Координаты точки пересечения медиан x = " + point[0] + " , y = " + point[1]);

		return point;

	}

	public static Triangle checkTriangle(Triangle triangle1) {
		double sideA;
		double sideB;
		double sideC;

		sideA = sideOfTriangle(triangle1.getX1(), triangle1.getX2(), triangle1.getY1(), triangle1.getY2());
		sideB = sideOfTriangle(triangle1.getX1(), triangle1.getX3(), triangle1.getY1(), triangle1.getY3());
		sideC = sideOfTriangle(triangle1.getX2(), triangle1.getX3(), triangle1.getY2(), triangle1.getY3());

		if ((sideA + sideB > sideC) || (sideA + sideC > sideB) || (sideB + sideC > sideA)) {
			return triangle1;
		}
		return triangle1;
	}

}
