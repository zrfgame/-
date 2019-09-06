/**
 * 编写者:zrf
 * 创建时间:2019年9月4日
 * cn.com
 *SubjectMain.java
 */
package cn.com.extendss;


import cn.com.extendss.proxy.SubjectProxy;

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
		SubjectProxy proxy = new SubjectProxy();
		proxy.send();

	}

}
