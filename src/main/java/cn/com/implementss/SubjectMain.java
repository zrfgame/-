/**
 * ��д��:zrf
 * ����ʱ��:2019��9��4��
 * cn.com
 *SubjectMain.java
 */
package cn.com.implementss;

import cn.com.implementss.proxy.SubjectProxy;
import cn.com.implementss.subjectimpl.RealSubject;

/**
 * ��д��:zrf
 * ����ʱ��:2019��9��4��
 * cn.com
 *SubjectMain.java
 */
public class SubjectMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�½�������
		SubjectProxy proxy = new SubjectProxy(new RealSubject());
		proxy.send();

	}

}
