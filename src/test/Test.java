package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import biz.TestBiz;
import dao.ITestBiz;

public class Test {

	public static void main(String[] args) {
		
//		new TestBiz().testBiz();此时会报空指针的异常
		ApplicationContext appctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ITestBiz biz = (ITestBiz)appctx.getBean("testBiz");
		//获取bean
		biz.testBiz("测试JointPoint连接点信息class使用","hiThere");
		//new FileSystemXmlApplicationContext("");如果文件没有在src文件夹下
		//sdfsdf
	}

}