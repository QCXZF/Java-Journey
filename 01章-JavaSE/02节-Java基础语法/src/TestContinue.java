public class TestContinue
{
    public static void main(String[] args)
    {
	int stop = 4;
	for(int i = 1; i <= 10; i++)
	{
	    // 当 i等于stop时, 跳出此次循环
	    if( i == stop ) continue;
	    System.out.println("i = " + i);
	}
    }
}