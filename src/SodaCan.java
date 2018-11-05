
public class SodaCan {
private double radius;
private double height;
private double costOfAluminum;
public SodaCan()
{
radius = 2.5;
height = 2.0;
costOfAluminum = 2.60;
}
public SodaCan(double xRadius, double xHeight)
{
if(xRadius > 0) 
{
radius = xRadius;
} else {
radius = 1;
}
if(xHeight > 0)
{
height = xHeight;
} else {
height = 1;	
}
costOfAluminum = 2.60;
}
public void setRadius(double xRadius)
{
if(xRadius > 0)
{
radius = xRadius;
} else
	{
	System.out.println("You dork, the height has to be positive. I'm setting it to one.");
	radius = 1;
	}	
}
public void setHeight(double xHeight)
{
if(xHeight > 0)
{
height = xHeight;	
}else
	{
	System.out.println("You dork, the height has to be positive. I'm setting it to one.");
	height = 1;
	}
}
public double getRadius() 
{
return radius;	
}
public double getHeight()
{
return height;	
}
public double getCost()
{
return costOfAluminum;		
}
public double surfaceArea()
{
double surfaceArea = 2*Math.PI*radius*height+2*Math.PI*radius*radius;
return surfaceArea;
}
public double volume()
{
double volume = Math.PI*radius*radius*height;
return volume;
}
public double costOfCan()
{
double costOfCan = costOfAluminum*surfaceArea();
return costOfCan;
}
}

