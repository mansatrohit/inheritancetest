package inheritancetest;

public class Triangle extends Rectangle
{
	float a;
	Triangle(int x,int y)
	{
	 super(x,y);
	}
	float getTriangle()
	{
		a = (float)(0.5*l*b);
		return(a);
	}
}


