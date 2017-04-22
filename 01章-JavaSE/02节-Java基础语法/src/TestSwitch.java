public class TestSwitch
{
	public static void main(String []args)
	{
		int i = 8;
		switch(i)
		{
			case 8 :
				System.out.println("A");
				break;	// 防止case穿透
			case 2:
			case 3:		// 2 or 3时执行
				System.out.println("B");
				break;
			default:
				System.out.println("C");
		}
	}
}