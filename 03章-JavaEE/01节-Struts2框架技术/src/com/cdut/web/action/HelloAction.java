package com.cdut.web.action;
/**
 * Struts2的入门案例
 * @author QCXZF
 *
 */
public class HelloAction {	// 动作类

	/**
	 * 在动作类中指定的动作方法 (必须是通过用户请求过来的)
	 * 动作方法的书写要求:
	 * 		1.都是 public的
	 * 		2.返回值必须是一个String
	 * 		3.必须没有参数
	 * @return
	 */
	public String sayHello(){
		System.out.println("HelloAction的sayHello方法执行了");
		return "success";	// 与配置文件中result的name取值相对应
		
	}

}
