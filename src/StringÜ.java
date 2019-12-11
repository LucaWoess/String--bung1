public class StringÜ 
{

	public static void main(String[] args) 
	{
		String s1="Meier";
		String s2="Mayer";
		s1.toLowerCase();
		s2.toLowerCase();
		if(s1.compareTo(s2)>0)
			{
				System.out.println(""+s2+"\n"+s1);
			}
		else 
			{
				System.out.println(""+s1+"\n"+s2);
			}
	}

}
