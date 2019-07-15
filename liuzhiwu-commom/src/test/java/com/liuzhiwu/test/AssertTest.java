package com.liuzhiwu.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.liuzhiwu.asser.AssertUtil;
import com.liuzhiwu.runtime.RuntimeExceptionTest;

public class AssertTest {
	/**
	 * //方法1：断言为真，如果为假，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 */
	@Test //测试1
	public void isTrue(){
		try {
			AssertUtil.isTrue(false, "断言为真，如果为假");
		} catch (RuntimeExceptionTest e) {
			e.printStackTrace();
		}
	}
	/**
	 * //方法2：断言为假，如果为真，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 */
	@Test //测试2
	public void isFalse(){
		try {
			AssertUtil.isFalse(true, "断言为假，如果为真");
		} catch (RuntimeExceptionTest e) {
			e.printStackTrace();
		}
	}
	/**
	 * //方法3：断言对象不为空，如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 */
	@Test //测试3
	public void NotNull(){
		try {
			AssertUtil.notNull("", "断言对象不为空，如果为空，则抛出自定义异常");
		} catch (RuntimeExceptionTest e) {
			e.printStackTrace();
		}
	}
	/**
	 * //方法4：断言对象必须空，如果不为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 */
	@Test //测试4
	public void isNull(){
		try {
			AssertUtil.isNull("qqq", "断言对象必须空，如果不为空");
		} catch (RuntimeExceptionTest e) {
			e.printStackTrace();
		}
	}
	/**
	 * 	//方法5：断言集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 */
	@Test //测试5
	public void notEmpty1(){
		try {
			ArrayList<Integer> arrayList = new ArrayList<>();
			arrayList.add(1);
			AssertUtil.notEmpty(arrayList, "断言集合不为空，对象不能空");
		} catch (RuntimeExceptionTest e) {
			e.printStackTrace();
		}
	}
	/**
	 * 	//方法6：断言Map集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 */
	@Test //测试6
	public void notEmpty2(){
		try {
			HashMap<Integer, String> hashMap = new HashMap<>();
			hashMap.put(1, "你好");
			AssertUtil.notEmpty(hashMap, "断言Map集合不为空，对象不能空");
		} catch (RuntimeExceptionTest e) {
			e.printStackTrace();
		}
	}
	/**
	 * 	//方法7：断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，如果没值，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 */
	@Test //测试7
	public void hasText(){
		try {
			AssertUtil.hasText(" ss", "断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，如果没值，则抛出自定义异常");
		} catch (RuntimeExceptionTest e) {
			e.printStackTrace();
		}
	}
	/**
	 * 	//方法8：断言值必须大于0，如果小于或等于0，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 */
	@Test //测试8
	public void greaterThanZero(){
		try {
			AssertUtil.greaterThanZero(0, "断言值必须大于0，如果小于或等于0，则抛出自定义异常");
		} catch (RuntimeExceptionTest e) {
			e.printStackTrace();
		}
	}
}
