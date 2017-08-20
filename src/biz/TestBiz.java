package biz;

import dao.DaoFactory;
import dao.ITestDao;
import dao.TestDao;

public class TestBiz {
	
	
	public void testBiz() {
		
		
		ITestDao dao = DaoFactory.getInstance();
		dao.testDao();
		
		
	}

}
