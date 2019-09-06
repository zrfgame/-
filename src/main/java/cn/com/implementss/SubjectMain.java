/**
 * 编写者:zrf
 * 创建时间:2019年9月4日
 * cn.com
 *SubjectMain.java
 */
package cn.com.implementss;

import cn.com.implementss.proxy.SubjectProxy;
import cn.com.implementss.subjectimpl.RealSubject;

/**
 * 编写者:zrf
 * 创建时间:2019年9月4日
 * cn.com
 *SubjectMain.java
 */
public class SubjectMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//新建代理类
		SubjectProxy proxy = new SubjectProxy(new RealSubject());
		proxy.send();

	}

}
