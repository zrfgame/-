/**
 * ��д��:zrf
 * ����ʱ��:2019��9��4��
 * cn.com.proxy
 *SubjectProxy.java
 */
package cn.com.extendss.proxy;

import cn.com.implementss.subjectimpl.RealSubject;

/**
 * ��д��:zrf
 * ����ʱ��:2019��9��4��
 * cn.com.proxy
 *SubjectProxy.java
 */
public class SubjectProxy extends RealSubject{
	public void send() {
		System.out.println("��������ʵ����־��ӡ��������������");
		super.send();
		System.out.println("��������ʵ����־��ӡ������������������");
		
	}

}
