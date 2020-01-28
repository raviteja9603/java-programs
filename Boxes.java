class Box
{
double len;
double bre;
double heig;
Box(double l,double b,double h)
{
len=l;
bre=b;
heig=h;
}
double vol()
{
return len*bre*heig;
}
}
class Boxes
{
public static void main(String[] args)
{
Box b=new Box(10,20,30);
double volume;
volume=b.vol();
System.out.println("volume is:"+volume);
}
}

