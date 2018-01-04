class simple2
{
	int x;
	int get()
	{
		return x;
	}
}
class simple3 extends simple2
{
	int y;
	int get()
	{
		return y;
	}
	int getx(){
		return x;
	}

public static void  main(String [] args) {
	simple2 s2 = new simple2();
	simple3 s3 = new simple3();
	s2.x=5;
	s3.x=7;
	s3.y=6;
	System.out.println(" "+ s2.get());
	System.out.println(" "+ s3.get());
	System.out.println(" "+ s3.getx());

}
}