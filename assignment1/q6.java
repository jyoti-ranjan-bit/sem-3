package dsa_assignment_2;
abstract class Shape{
	abstract double calculate_area(); 
		
	}
	class square extends Shape{
		double side;
		square(double s){
			side=s;
		}
	//	@override
		double calculate_area() {
			return (side*side);
		}
	}
	class triangle extends Shape{
		double base,height;
		triangle(double b,double h){
			base=b;
			height=h;
		}
	//	@override
		double calculate_area() {
			return (0.5*base*height);
		}	
	}
	class circle extends Shape{
		double radius;
		circle(double r){
			radius =r;
		}
	//	@override
		double calculate_area() {
			return(Math.PI*Math.pow(radius,2 ));
		}
	}
	

public class q6 {

	public static void main(String[] args) {
		
		Shape ob1=new square(5);
		Shape ob2 = new triangle(4, 3);
	    Shape ob3 = new circle(2.5);  
	    System.out.println("Area of square is: "+ob1.calculate_area());
	    System.out.println("Area of triangle is: "+ob2.calculate_area());
	    System.out.println("Area of circle is: "+ob3.calculate_area());
	}

}
