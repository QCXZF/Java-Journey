public class TestConvert
{
	public static void main(String []args)
	{
		int i1 = 123;
		int i2 = 456;
		double d1 = (i1+i2) * 1.2;			// ϵͳ��ת��Ϊ double ����
		float f1 = (float)((i1+i2) * 1.2);	// ��Ҫ��ǿ��ת���� double -> float

		byte b1 = 100;
		byte b2 = 120;						// ϵͳĬ�Ͻ� int ����ת��Ϊ byte ����
		byte b3 = (byte)(b1+b2);			// ϵͳ�� b1+b2 ת��Ϊ int ����, ���㸳ֵ��Ҫǿ��ת��
											// int(4���ֽ�) -> byte(1���ֽ�)	ֱ�ӿ���3���ֽ�
		System.out.println(b3);

		double d2 = 1e200;
		float f2 = (float)d2;		// ��������(float��� E38)
									// double -> float����ֱ�ӿ���4���ֽ�,��Ϊ�������洢��ʽ
		System.out.println(f2);

		float f3 = 1.23f;			// double -> float����ֱ��ת, �����f
		long l1 = 123;				// Ĭ�� int -> long
		long l2 = 30000000000L;		// �����L, int��Χ
		float f = l1+l2+f3;			// ϵͳ��ת��Ϊ float ���м���(float�����������)
		long l = (long)f;			// ǿ��ת����ȥС������(������������)
	}
}