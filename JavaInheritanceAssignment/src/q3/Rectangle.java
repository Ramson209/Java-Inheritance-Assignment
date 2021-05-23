package q3;

import q3.Rectangle.Square;

public class Rectangle
{
	
	int lenght;
	int breadth;
	
	public Rectangle(int l,int b){
		lenght=l;
		breadth=b;
	}
	
	public void printArea() {
		System.out.println(lenght*breadth);
	}
    public void printPerimeter() {
    	System.out.println(2*(lenght+breadth));
    }
    
   static  class Square extends Rectangle{
    	int side;
    	public Square(int s) {
    		super(s, s);
    	}
    }
}
    class answer{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(4,5);
		r.printArea();
		r.printPerimeter();
		
        Square s = new Square(6);
        s.printArea();
		s.printPerimeter();

	}


}

