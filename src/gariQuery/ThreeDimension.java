package gariQuery;

import java.util.Scanner;

public class ThreeDimension {

	private double x,y,z;
	
	ThreeDimension(double x,double y,double z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public double distance(ThreeDimension secObj) {
		return Math.sqrt(Math.pow((secObj.x-this.x),2)+Math.pow((secObj.y-this.y),2)+Math.pow((secObj.z-this.z),2));
	}
	
	public String toString() {
		return String.format("("+x+","+y+","+z+")");
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		double z = scan.nextDouble();
		
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double z2 = scan.nextDouble();
		
		ThreeDimension obj = new ThreeDimension(x,y,z);
		ThreeDimension obj2 = new ThreeDimension(x2,y2,z2);
		System.out.println(obj.distance(obj2));
		System.out.println(obj.toString());
	}

}
