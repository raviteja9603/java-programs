class Stock
{
String sname,ssymbol;
double prestock,currprice; 
Stock(String sname,String ssymbol,double perstock,double currprice){
this.sname=sname;
this.ssymbol=ssymbol;
this.prestock=prestock;
this.currprice=currprice;
}
double getChangePercentage()
{
return (prestock/ currprice)*100;
}
public static void main(String[] args)
{
Stock s=new Stock("bitcoin","$",10,12);
System.out.println("the percentage is:"+s.getChangePercentage());
}
}