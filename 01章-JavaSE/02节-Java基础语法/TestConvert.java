public class TestConvert
{
	public static void main(String []args)
	{
		int i1 = 123;
		int i2 = 456;
		double d1 = (i1+i2) * 1.2;			// 系统将转换为 double 类型
		float f1 = (float)((i1+i2) * 1.2);	// 需要加强制转换符 double -> float

		byte b1 = 100;
		byte b2 = 120;						// 系统默认将 int 类型转换为 byte 类型
		byte b3 = (byte)(b1+b2);			// 系统将 b1+b2 转换为 int 类型, 运算赋值需要强制转换
											// int(4个字节) -> byte(1个字节)	直接砍掉3个字节
		System.out.println(b3);

		double d2 = 1e200;
		float f2 = (float)d2;		// 会产生溢出(float最大 E38)
									// double -> float不能直接砍掉4个字节,因为浮点数存储格式
		System.out.println(f2);

		float f3 = 1.23f;			// double -> float不能直接转, 必须加f
		long l1 = 123;				// 默认 int -> long
		long l2 = 30000000000L;		// 必须加L, int范围
		float f = l1+l2+f3;			// 系统将转换为 float 进行计算(float类型容量最大)
		long l = (long)f;			// 强制转换舍去小数部分(不是四舍五入)
	}
}