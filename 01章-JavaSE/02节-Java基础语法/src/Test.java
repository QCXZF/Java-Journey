public class Test
{
    static String a = "abc";
    final int b = 2;

    public void print(String str)
    {
	System.out.println(str);
    }

    public static void main(String []args)
    {
	Test t = new Test();
	t.out(a);
    }
}