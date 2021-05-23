package q4;

import q4.Rectangle1.Square;

public class Rectangle1
{
	int lenght;
    int breadth;

public Rectangle1(int l,int b){
	lenght=l;
	breadth=b;
}

public void printArea() {
	System.out.println(lenght*breadth);
}
public void printPerimeter() {
	System.out.println(2*(lenght+breadth));
}

static class Square extends Rectangle1{
	
	int side;
	public Square(int s) {
		super(s,s);
	}
}
}
class answer{
public  static void main(String[] args)
{
	Rectangle1 r = new Rectangle1(4,5);
	r.printArea();
	r.printPerimeter();
	
	Square s = new Square (4);
	s.printArea();
	s.printPerimeter();
	
	Square [] a = new Square[10];
	
	int k = 5;
	for(int i =0; i<10; i++) {
		a[i] = new Square(k);
		k++;
		
	}
	for (int i =0; i<10; i++) {
		a[i].printArea();
		a[i].printPerimeter();
	} 

}


}


