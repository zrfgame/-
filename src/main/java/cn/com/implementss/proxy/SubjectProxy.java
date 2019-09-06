/**
 * ��д��:zrf
 * ����ʱ��:2019��9��4��
 * cn.com.proxy
 *SubjectProxy.java
 */
package cn.com.implementss.proxy;

import cn.com.implementss.Subject;
import cn.com.implementss.subjectimpl.RealSubject;

/**
 * ��д��:zrf
 * ����ʱ��:2019��9��4��
 * cn.com.proxy
 *SubjectProxy.java
 */
public class SubjectProxy implements Subject{
	private RealSubject realSubject;
	public SubjectProxy(RealSubject realSubject) {
		this.realSubject = realSubject;
	}
	public void send() {
		System.out.println("��������ʵ����־��ӡ��������������");
		realSubject.send();
		System.out.println("��������ʵ����־��ӡ������������������");
		
	}

}
