package inheritancetest;
import java.util.Scanner;
public class RectangleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Values Of n1,n2:");
		n1 = in.nextInt();
		n2 = in.nextInt();
       Triangle n = new Triangle(n1,n2);
       System.out.println("Area Of Rectangle Is:"+n.getRectangle());
       System.out.println("Area Of Triangle Is:"+n.getTriangle());
	}
}