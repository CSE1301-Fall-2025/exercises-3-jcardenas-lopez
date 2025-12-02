package module09._04equality;


public class Point {
	
	private final int x;
	private final int y;
	/*  instance variables, x and y, are both integers and immutable.
	Has-a relationship for x & y coordinates with Point class */
	
	// auto-generated constructor
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// auto-generated getter for x
	public int getX() {
		return x;
	}

	// auto-generated getter for y
	public int getY() {
		return y;
	}

	// auto-generated toString() method
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	//auto-generated hashCode() and equals(Object other) methods
	

	public static void main(String[] args) {
		// make point
		Point p1 = new Point(1,1);
		//make second point for sake of comparison
		Point p2 = new Point(2,6);
		//print
		System.out.println(p1);
		System.out.println(p1.equals(p2));

		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}
