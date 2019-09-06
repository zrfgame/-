/**
 * 编写者:zrf
 * 创建时间:2019年9月4日
 * cn.com.subjectimpl
 *RealSubject.java
 */
package cn.com.extendss.subjectimpl;

import cn.com.implementss.Subject;

/**
 * 编写者:zrf
 * 创建时间:2019年9月4日
 * cn.com.subjectimpl
 *RealSubject.java
 *被代理类
 */
public class RealSubject implements Subject {

	public void send() {
		System.out.println("实现主要业务逻辑");
	}

}
