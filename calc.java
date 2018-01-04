import java.util.Scanner;
class add
{
     void add(int x,int y)
     {
     	System.out.println("SUM OF 2 NUMBERS ARE => "+ (x+y));
     }
}
class subtract
{
	 void subtract(int x,int y)
	 {
	 	System.out.println("SUBTRACTION OF 2 NUMBERS ARE =>"+ (x-y));
	 }
}
class divide
{
 	 void divide(float x,float y)
 	 {
 	 	System.out.println("AFTER DIVIDING =>"+(x/y));
 	 }
}
class multiply
{
	 void multiply(float x,float y)
	 {
	 	System.out.println("MULTIPLYION OF 2 NUMBERS ARE => "+(x*y));
	 }
}
class calc
{
	public static void main(String[] args)
	{	add a=new add();
		subtract s= new subtract();
		divide d= new divide();
		multiply m= new multiply();
        
        System.out.println("1 => ADDING TWO NO.S");
        System.out.println("2 => SUBTRACTING TWO NO.S");
        System.out.println("3 => MULTIPLYING TWO NO.S");
        System.out.println("4 => DIVIDING TWO NO.S");
		int no,n1,n2;
		Scanner obj = new Scanner( System.in);
		System.out.println("ENTER		YOUR		CHOICE	  ");
		no=obj.nextInt();
		
		switch (no) {
			case 1: System.out.println("ENTER A 1ST NO.");
					n1=obj.nextInt();
					System.out.println("ENTER A 2ND NO.");
					n2=obj.nextInt();
					a.add(n1,n2); break;
			case 2: System.out.println("ENTER A 1ST NO.");
					n1=obj.nextInt();
					System.out.println("ENTER A 2ND NO.");
					n2=obj.nextInt();
					s.subtract(n1,n2); break;
			case 3: System.out.println("ENTER A 1ST NO.");
					n1=obj.nextInt();
					System.out.println("ENTER A 2ND NO.");
					n2=obj.nextInt();
					m.multiply(n1,n2); break;
			case 4: System.out.println("ENTER A 1ST NO.");
					n1=obj.nextInt();
					System.out.println("ENTER A 2ND NO.");
					n2=obj.nextInt();d.divide(n1,n2); break;
			default:  System.out.println("wrong choice");
					break;
			
			
			}



			
		
	}
}