package pac;

public class callingThisClass {
	
	public static void main(String []args)
	{
		
		classThis ct=new classThis();
		ct.employee("sri",45,200000);
		
		String ss=ct.getname();
		System.out.println(ss);
	}

}
