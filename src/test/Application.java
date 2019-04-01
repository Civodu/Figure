package test;


import defpoint.Cercle;
import defpoint.Figure;
import defpoint.Point;
import defpoint.Rectangle;

public class Application {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Figure f1= new Cercle(new Point(10,10),new Point(20,20)); 
		Figure f2=new Rectangle(new Point(30, 30), new Point(40, 40));
		
		System.out.println("Surface de "+f1+" est de :" +f1.surface());
		
		System.out.println("Surface de "+f2+" est de :" +f2.surface());
		
		//---------------On va faire ici la copie des figures---------------
		
		System.out.println("Copie de Cercle :");
		Figure f3=f1.clone();
		
		System.out.println("Surface de"+f3+" est de :" +f3.surface());
		
		System.out.println("Copie du Rectangle:");
		Figure f4=f2.clone();
		
		System.out.println("Surface de"+f4+" est de :" +f4.surface());

	}

}
