package Logger;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.aspectj.lang.JoinPoint;

import biz.TestBiz;



public class testLogger {
	Logger logger = (Logger)LogManager.getLogger();
	
	public void beforeLogger(JoinPoint jp) {
		System.out.println(jp.getTarget()+"\n"+jp.getSignature().getName()+"\n"+jp.getArgs()[0]);
		logger.debug("方法执行前");
		
		
		
	}
	
	public void afterReturningLogger(JoinPoint jp,Object result) {
		
		System.out.println(jp.getTarget()+"\n"+jp.getSignature().getName()+"\n"+jp.getArgs()[0]+
				" 返回:"+result);
		logger.debug("方法执行结束后");
		
		
	}
}
