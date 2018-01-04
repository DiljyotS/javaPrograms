class area
{
	void area()
	{
		System.out.println("area =0");
	}
}
class square extends area
{
	void area()
	{
			int a;
			a=7*7;
			System.out.println(a);

	}
}
class rectangle extends area
{
	void area()
	{	
			
			int z;
			z=7*8;
			System.out.println(z);
	}
}
class sim{
	public static void main(String[] args) {
		area a1 = new area();
		a1.area();
		square s= new square();
		s.area();
		rectangle r= new rectangle();
		r.area();
	}
}