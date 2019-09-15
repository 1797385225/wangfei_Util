package com.wangfei.utils;


import org.junit.Test;
/**
 * 测试工具StringUtil类
 * @ClassName: StringUtilTest 
 * @Description: TODO
 * @author: wangfei
 * @date: 2019年9月9日 上午9:02:36
 */
public class StringUtilTest {

	/**
	 * 测试StringUtil工具类中toHtml()方法
	 * @Title: toHtmltest 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void toHtml() {
		//传一段文本进去，输出带html标签的文本
		String html = StringUtil.toHtml("我是中国人");
		System.out.println(html);
	}

	/**
	 * 测试StringUtil工具类中的是否为中国地区手机号码isPhone()工具方法
	 * @Title: isPhone 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void isPhone() {
		//传一个非法的手机号码测试不通过
		boolean b = StringUtil.checkMobileNumber("11022222222");
		System.out.println(b);
		//传一次合法的手机号码，测试通过
		boolean number = StringUtil.checkMobileNumber("13681834048");
		System.out.println(number);
	}
	
	/**
	 * 测试StringUtil工具类中的是否为邮箱isEmail()工具方法
	 * @Title: isEmail 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void isEmail() {
		//传一次合法的邮箱，测试通过
		boolean email = StringUtil.checkEmail("1797385225@com.qq");
		System.out.println(email);
		//传一个非法的邮箱测试不通过
		boolean email2 = StringUtil.checkEmail("22com.ee");
		System.out.println(email2);
	}
	/**
	 * //统计一个字符串中相应字符出现的次数
	 * @Title: isMethod 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void isMethod() {
		String s = "aagfagdlkerjgavpofjmvglk我是你的";
	    //调用自定义方法来 统计相应字符出现的次数
	  System.out.print(StringUtil.method(s)); 
		
	}

}
