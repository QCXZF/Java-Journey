public class Logical
{
	public static void main(String []args)
	{
		boolean a,b,c;
		a = true; b = false;
		c = a^b;				// a, b��ͬ��Ϊ true
		System.out.println(c);

		System.out.println((a==false) && (b==false));	// ��·��,��һ�����ʽΪfalse,�ڶ������ټ���
		System.out.println((a==true) || (b==true));		// ��·��,��һ�����ʽΪtrue,�ڶ������ټ���
	}
}