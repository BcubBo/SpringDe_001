package Logger;

import org.apache.log4j.Logger;

import biz.TestBiz;


public class testLogger {
	Logger logger = Logger.getLogger(TestBiz.class);
	
	public void beforeLogger() {
		
		logger.info("方法执行前");
		
		
	}
	
	public void afterReturningLogger() {
		
		
		logger.info("方法执行结束后");
		
		
	}
}
