package defpoint;

public class Point implements Clonable{
	protected int x;
	protected int y;
	
public Point(int x, int y) {
	this.x=x;
	this.y=y;
}

public double distance(Point p) {
	int a=p.x-this.x;
	int b=p.y-this.y;
	return Math.sqrt(a*a+b*b);
}

@Override
public String toString() {
	return "Point [x=" + x + ", y=" + y + "]";
}
	
@Override
public Point clone() throws CloneNotSupportedException {
	
	return (Point)super.clone();
}
}
