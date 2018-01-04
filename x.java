class x
{   
	void area(int l)
	{	int s;
		s=l*l;
			System.out.println(s);

	}
	void area(int l,int b)
	{	int r;
		r=l*b;
			System.out.println(r);
	}
	public static void main(String[] args) {
		x ar= new x();
		int a=5,c=4;
		System.out.println("area of sq");
		ar.area(a);
		System.out.println("area of rec");
		ar.area(a,c);
	}
}