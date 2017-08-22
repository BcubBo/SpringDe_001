package Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class testLogger {
	Logger logger = (Logger)LogManager.getLogger();
	
	public void beforeLogger() {
		
		logger.info("方法执行前");
		
		
	}
	
	public void afterReturningLogger() {
		
		
		logger.info("方法执行结束后");
		
		
	}
}
