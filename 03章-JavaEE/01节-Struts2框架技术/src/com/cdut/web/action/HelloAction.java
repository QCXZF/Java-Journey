package com.cdut.web.action;
/**
 * Struts2�����Ű���
 * @author QCXZF
 *
 */
public class HelloAction {	// ������
	
	/**
	 * �ڶ�������ָ���Ķ������� (������ͨ���û����������)
	 * ������������дҪ��:
	 * 		1.���� public��
	 * 		2.����ֵ������һ��String
	 * 		3.����û�в���
	 * @return
	 */
	public String sayHello(){
		System.out.println("HelloAction��sayHello����ִ����");
		return "success";	// �������ļ���result��nameȡֵ���Ӧ
	}

}
