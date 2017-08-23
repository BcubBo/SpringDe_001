package Logger;


import org.apache.logging.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.apache.logging.log4j.core.Logger;
import org.aspectj.lang.JoinPoint;
//import org.apache.logging.log4j.LogManager;

import biz.TestBiz;



public class testLogger {
	Logger logger = (Logger)LogManager.getLogger();
	//Logger logger = Logger.getLogger(TestBiz.class);
	
	public void beforeLogger(JoinPoint jp) {
		System.out.println(jp.getTarget()+"\n"+jp.getSignature().getName()+"\n"+jp.getArgs()[0]);
		logger.info("方法执行前");
		
		
		
	}
	
	public void afterReturningLogger(JoinPoint jp,Object result) {
		
		System.out.println(jp.getTarget()+"\n"+jp.getSignature().getName()+"\n"+jp.getArgs()[0]+
				" 返回:"+result);
		logger.info("方法执行结束后");
		
		
	}
}
