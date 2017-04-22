public class Logical
{
	public static void main(String []args)
	{
		boolean a,b,c;
		a = true; b = false;
		c = a^b;				// a, b不同则为 true
		System.out.println(c);

		System.out.println((a==false) && (b==false));	// 短路与,第一个表达式为false,第二个不再计算
		System.out.println((a==true) || (b==true));		// 短路或,第一个表达式为true,第二个不再计算
	}
}