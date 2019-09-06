/**
 * 编写者:zrf
 * 创建时间:2019年9月4日
 * cn.com.proxy
 *SubjectProxy.java
 */
package cn.com.implementss.proxy;

import cn.com.implementss.Subject;
import cn.com.implementss.subjectimpl.RealSubject;

/**
 * 编写者:zrf
 * 创建时间:2019年9月4日
 * cn.com.proxy
 *SubjectProxy.java
 */
public class SubjectProxy implements Subject{
	private RealSubject realSubject;
	public SubjectProxy(RealSubject realSubject) {
		this.realSubject = realSubject;
	}
	public void send() {
		System.out.println("》》》》实现日志打印，或者其他操作");
		realSubject.send();
		System.out.println("》》》》实现日志打印，或者其他操作结束");
		
	}

}
